<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>AUTHOR</th>
                <th>DESCRIPTION</th>
                <th>PRICE</th>
                <th>ACTION</th>
                
                </tr>
        </thead>
        <tbody>
         <c:forEach var="book" items="${bookDTOList}">   
            <tr>
            	<td>${book.bookId}</td>
                <td>${book.bookName}</td>
                <td>${book.author}</td>
                <td>${book.description}</td>
                <td>${book.price}</td>
                
                <td>
                	
                	&nbsp;&nbsp;&nbsp;
                	<a href="details/${book.bookId}">Details</a>
                </td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</div>    


</body>
</html>

<!-- To Run application type http://localhost:9191/onlineBookReselling/ in browser-->