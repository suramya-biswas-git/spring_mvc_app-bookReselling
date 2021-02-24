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
<form:form method="post" action="orderInfo"  modelAttribute="userRecord">
<form:input type="hidden" path="userName"/>
<form:input type="hidden" path="address"/>
<form:input type="hidden" path="city"/>
<form:input type="hidden" path="pin"/>
<form:input type="hidden" path="state"/>
<form:input type="hidden" path="email"/>
<form:input type="hidden" path="mobile"/>
<br/><br/><br/> 
<table cellpadding="5">
 <tr>
   <td> User Id:</td>
   <td><form:input path="userId"/></td> 
   <td>Password:</td>
   <td><form:input type="password" path="password"/></td> 
   </tr>
   
</table>

<input type="submit" value="Shop Now" name="shop"/> 
<input type="submit" value="Register" name="register"/> 
 </form:form>
</div>

</body>
</html>