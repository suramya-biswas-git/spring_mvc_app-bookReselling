package com.iiht.onlineBookReselling.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iiht.onlineBookReselling.dto.BookDTO;
import com.iiht.onlineBookReselling.dto.BookOrderDTO;
import com.iiht.onlineBookReselling.dto.UserDTO;
import com.iiht.onlineBookReselling.exception.UserNotFoundException;
import com.iiht.onlineBookReselling.service.BookOrderService;
import com.iiht.onlineBookReselling.service.BookService;
import com.iiht.onlineBookReselling.service.UserService;

@Controller
public class BookResellingController {
	@Autowired
	private BookService bookService;
	@Autowired
	private UserService userService;
	@Autowired
	private BookOrderService bookOrderService;
	
	private BookDTO bookDTO;
	
	@RequestMapping(value="/",method={RequestMethod.POST, RequestMethod.GET})
	public String showIndexPage(Model model) throws Exception{
		List<BookDTO> bookDTOList=bookService.showAllBooks();
		model.addAttribute("bookDTOList",bookDTOList);
		return "index";
	}
	
	@RequestMapping(value="/details/{id}", method={RequestMethod.POST, RequestMethod.GET})
	public String showBookDetailPage(@PathVariable int id, Model model) throws Exception{
		   BookDTO bookDTO=bookService.showBookDetails(id);
		   model.addAttribute("bookRecord",bookDTO);
	return "bookDetailPage";		
	}       

	@RequestMapping(value="/details/placeOrder",method={RequestMethod.POST})
	public String showPlaceOrderPage(@ModelAttribute("book") BookDTO book, Model model,HttpServletRequest request) throws Exception{
		 String output="";
         String str1=request.getParameter("back");
         String str2=request.getParameter("order");
         if(str2==null)
        	 output="redirect:/";
         else if (str1==null)
         {
        	 this.bookDTO=book;
        	 UserDTO user=new UserDTO();
        	 model.addAttribute("userRecord",user);
        	 output="placeOrderPage";
         }
		return output;		
	}
	
	@RequestMapping(value="/details/orderInfo",method={RequestMethod.POST}) 
	public String showOrderInfoPage(@ModelAttribute("userRecord") UserDTO user, Model model,HttpServletRequest request) throws Exception {
		 String output="";
         String str1=request.getParameter("register");
         String str2=request.getParameter("shop");
         if(str2==null){
        	int id=userService.generateId();
        	UserDTO userDTO=new UserDTO(id);
        	model.addAttribute("userRecord",userDTO);
          	 output="registerUserPage";
	}
         else if (str1==null){
        	 try{
        		
        		 UserDTO usr=userService.findUser(user);
        		if(usr==null)
        			throw new UserNotFoundException();
          	int orderId=bookOrderService.generateOrderId();
        	BookOrderDTO bookOrder=new BookOrderDTO(orderId,user.getUserId(),bookDTO.getBookId(),bookDTO.getPrice());
        	bookOrderService.save(bookOrder);
        	model.addAttribute("userRecord",usr);
        	model.addAttribute("bookRecord",bookDTO);
        	model.addAttribute("orderRecord",bookOrder);
        	output="orderInfoPage" ; 	
        	 }
        	 catch(UserNotFoundException ex)
        	 {
        		 output="errorPage";
        	 }
         }
		return output;		
	}
	
	@RequestMapping(value="/details/userSave",method={RequestMethod.POST})
	public String showUserInfoPage(@ModelAttribute("userRecord") UserDTO user, Model model,HttpServletRequest request) throws Exception{
		 String output="";
         String str1=request.getParameter("home");
         String str2=request.getParameter("register");
         if(str2==null)
        	 output="redirect:/";
         else if (str1==null)
         {
        	userService.save(user);
        	model.addAttribute("userRecord",user);
        	 output="userInfoPage";
         }
		return output;		
	}
	
	@RequestMapping(value="/details/finalOrder",method={RequestMethod.POST})
	public String showOrderInfoPage(@ModelAttribute("userRecord") UserDTO user, Model model) throws Exception{
		int orderId=bookOrderService.generateOrderId();
    	BookOrderDTO bookOrder=new BookOrderDTO(orderId,user.getUserId(),bookDTO.getBookId(),bookDTO.getPrice());
    	bookOrderService.save(bookOrder);
    	model.addAttribute("userRecord",user);
    	model.addAttribute("bookRecord",bookDTO);
    	model.addAttribute("orderRecord",bookOrder);
    	return "orderInfoPage" ; 
	}
	@RequestMapping(value="/details/return",method={RequestMethod.POST})
	public String returnBack(){
		return "redirect:/";		
	}
}

//http://localhost:9191/onlineBookReselling/
