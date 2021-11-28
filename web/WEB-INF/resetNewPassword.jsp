<%-- 
    Document   : resetNewPassword
    Created on : Nov 25, 2021, 7:03:05 PM
    Author     : 794974
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Set a new password </h1>
        <form method="post" action="newPassword">
        Enter a new password <br>
        <input type="password" name="newpass"><br>
        Confirm password<br>
        <input type="password" name="confirmpass"><br>
        <input type="submit" name="getval" value="update">
        <input type="hidden" name="uuid" value=${uuid}>
        </form>
        <c:if test="confirmation">
            <p>Your password has been updated</p>
    </c:if>
    </body>
</html>
