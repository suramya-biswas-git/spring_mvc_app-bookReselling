<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<h3 style="font-family:Courier New;color:green">
<form:form method="post" action="finalOrder"  modelAttribute="userRecord">

<form:input type="hidden" path="password"/>
<form:input type="hidden" path="address"/>
<form:input type="hidden" path="city"/>
<form:input type="hidden" path="pin"/>
<form:input type="hidden" path="state"/>
<table cellpadding="5">
 <tr>
 <td> User Id:</td>
   <td><form:input path="userId"/></td> 
   <td> User Name:</td>
   <td><form:input path="userName"/></td> 
   </tr>
   <tr>
    <td> Email:</td>
   <td><form:input path="email"/></td> 
   <td>Mobile:</td>
   <td><form:input path="mobile"/></td> 
   </tr>
     </table>
   <input type="submit" value="Shop Now"/> 
</form:form>
</h3>
</div>
</body>
</html>