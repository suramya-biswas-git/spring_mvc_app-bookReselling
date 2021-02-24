<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form:form method="post" action="placeOrder"  modelAttribute="bookRecord">
<form:input type="hidden" path="bookId"/>
<form:input type="hidden" path="bookName"/>
<form:input type="hidden" path="author"/>
<form:input type="hidden" path="price"/>
<form:input type="hidden" path="description"/>

<table cellpadding="5" >
 <tr>
   <td>  Book Name:</td>
   <td><form:input path="bookName" disabled="true"/></td> 

<td>Author:</td>
<td><form:input path="author" disabled="true"/></td>   
</tr>
<tr>
<td>Description:</td>
<td><form:input path="description" disabled="true"/></td> 
<td>Unit Price:</td>
<td><form:input path="price" disabled="true"/></td>   
</tr>
</table>
<input type="submit" value="Back to List" name="back"/> 
<input type="submit" value="Place order" name="order"/> 
 </form:form>

</div>
</body>
</html>