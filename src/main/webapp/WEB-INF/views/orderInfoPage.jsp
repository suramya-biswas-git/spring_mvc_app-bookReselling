<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
   
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<h3 style="font-family:Courier New;color:blue">
<form:form method="post" action="return"  modelAttribute="orderRecord">

<table cellpadding="5" >
 <tr>
   <td>Order Id:</td>
   <td><form:input path="orderId" disabled="true"/></td> 

<td>Book Id:</td>
<td><form:input path="bookId" disabled="true"/></td>   
</tr>
<tr>
<td>User Id:</td>
<td><form:input path="userId" disabled="true"/></td> 
<td>User Email:</td>
<td><input value=${userRecord.email} disabled="true"/>
</td>   
</tr>
<tr>
<td>Order Amount :</td>
<td><form:input path="orderAmount" disabled="true"/></td> 
<td>Book Name:</td>
<td><input value=${bookRecord.bookName} disabled="true"/></td>   
</tr>

</table>
<input type="submit" value="Shop Again"/> 

 </form:form>

</div>
</body>
</html>