<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

   <h1>Your Quotes</h1>
   

   <sf:form action="./quotation.html" commandName="quote" method="post">
   		<sf:label path="name" >Name:</sf:label><sf:input path="name" /><br/>
   		<sf:label path="item">Item:</sf:label><sf:input path="item" /><br/>
   		<sf:label path="quantity">Quantity:</sf:label><sf:input path="quantity" /><br/>
   		<sf:label path="amount">Amount:</sf:label><sf:input path="amount" /><br/>
   		<input type="submit" value="Submit" />
   </sf:form>