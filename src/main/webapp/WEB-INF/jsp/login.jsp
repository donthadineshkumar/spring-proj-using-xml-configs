<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <form action="./login" method="post">
    		<input type="text" name="username" /><br/>
    
    		<input type="password" name="password" /><br/>
    		
    		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    		
    		<input type="submit" value="submit" />    	  
    </form>
    