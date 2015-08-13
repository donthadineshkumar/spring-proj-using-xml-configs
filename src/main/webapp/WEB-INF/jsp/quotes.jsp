<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>

   <h1>All your quotes</h1>
   
   
   <c:forEach  items="${quotes}" var="quote">
   		Name : ${quote.name} <br/>
		Item: ${quote.item} <br/>
		Amount :  ${quote.amount}<br/>
		quantity: ${quote.quantity}<br/>
   </c:forEach>
   
   