<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src='<spring:url value="/resources/js/userRegistration.js"/>'></script>
</head>
<body>
<div align="center">
<h3 style="font-family:Courier New;color:green">
<form:form method="post" action="userSave"  modelAttribute="userRecord" onSubmit="return checkConfirmedPassword()">
<form:input type="hidden" path="userId"/>
<table cellpadding="5">
 <tr>
   <td> User Name:</td>
   <td><form:input path="userName"/></td> 
    <td> Email:</td>
   <td><form:input path="email"/></td> 
   </tr>
   <tr>
   <td> Password:</td>
   <td><form:input type="password" path="password" id="original"/></td> 
    <td> Confirmed Password:</td>
   <td><input type="password" id="confirm"/></td> 
   </tr>
   <tr>
   <td>Address:</td>
   <td><form:input path="address"/></td> 
    <td>City:</td>
   <td><form:input path="city"/></td> 
   </tr>
   <tr>
   <td>Pin:</td>
   <td><form:input path="pin"/></td> 
    <td>State:</td>
   <td><form:input path="state"/></td> 
   </tr>
   <tr>
   <td>Mobile:</td>
   <td><form:input path="mobile"/></td> 
    <td><input type="submit" value="Back Home" name="home"/> 
<td><input type="submit" value="Register" name="register"/> </td>
  
   </tr>
   </table>
</form:form>
</h3>
</div>
</body>
</html>