<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Please Login</title>
  </head>
  <body>
    <div>
    	<c:url value="/login" var="loginUrl"/>
        <form name="f" action="${loginUrl}" method="post">               
            <fieldset>
                <legend>Please Login</legend>
                <c:if test="${param.error != null}">
                	<div style="color: red;">    
                    	Invalid username and password.
                	</div>
                </c:if>
                
                <c:if test="${param.logout != null}">
                	<div style="color: green;">     
                    	You have been logged out.
                	</div>
                </c:if>
                
                
                <label for="username">Username</label>
                <input type="text" id="username" name="username"/>        
                <label for="password">Password</label>
                <input type="password" id="password" name="password"/>    
                <div>
                    <button type="submit" class="btn">Log in</button>
                </div>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </fieldset>
        </form>
    </div>
  </body>
</html>