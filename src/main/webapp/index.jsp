<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>Welcome to Spring Security App</h1>
<a href="${pageContext.servletContext.contextPath}/user/home.html">Users</a>
<a href="${pageContext.servletContext.contextPath}/vendor/home.html">Vendors</a>
<a href="${pageContext.servletContext.contextPath}/admin/home.html">Admin</a>


<form action="./logout.html" method="post">
		     <input type="submit" value="Logout" /> 
		     <input type="hidden"
                name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>