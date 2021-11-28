<%-- 
    Document   : reset.jsp
    Created on : Nov 24, 2021, 10:31:17 PM
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
        <h1>Reset Password!</h1>
        <p>Please enter your email address to reset your password</p>
        <form method="post" action="reset">
            Email Address:<input type="text" name="resetemail" value="">
            <p><input type="submit" name="getval" value="submit"></p>
            <input type="hidden" name="trigger2" value="trigger2"
        </form><br>
        <c:if test="erroremail">
        <p>Please enter an email address</p>
    </c:if>
    </body>
</html>
