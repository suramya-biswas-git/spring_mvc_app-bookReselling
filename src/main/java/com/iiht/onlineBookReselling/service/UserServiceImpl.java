package com.iiht.onlineBookReselling.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.iiht.onlineBookReselling.dao.UserDao;
import com.iiht.onlineBookReselling.dto.UserDTO;
import com.iiht.onlineBookReselling.model.User;

@Service 
@Transactional
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	public void save(UserDTO userDTO) throws Exception {
		
	User user=new User(userDTO.getUserId(),userDTO.getUserName(),userDTO.getAddress(),userDTO.getCity(),userDTO.getPin(),userDTO.getState(),userDTO.getEmail(),userDTO.getPassword(),userDTO.getMobile());
     userDao.save(user);
	}

	public UserDTO findUser(UserDTO userDTO) throws Exception {
		User user=new User(userDTO.getUserId(),userDTO.getEmail(),userDTO.getPassword());
		List<User> userList=userDao.findUser(user);
		UserDTO userDTO2=null;
		try
		{
		for(User usr:userList){
			userDTO2=new UserDTO(usr.getUserId(),usr.getEmail(),usr.getMobile())	;
		   }
		}
		catch(Exception ex){
			userDTO2=null;
		}
		return userDTO2;
	}
	
	public int generateId() throws Exception {
		int id=0;
		List<Integer> idList= userDao.generateId();
		try{
			for(int i:idList)
				id=i;
			id++;
		}catch(Exception e){
			id=50001;
		}
			return id;
	}
}
