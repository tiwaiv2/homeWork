<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Job Protal</title>
</head>
<body background="images/login-page-background-images-9.jpg">
<p align="right"> 
<%
    if(null!=request.getAttribute("message"))
    {
        out.println(request.getAttribute("message"));
    }
%>
</p>

<div style="height: 388px; width: 500px;margin-top:400px;display: block;class="x-box-inner"">
<form action="login" method="post" align="bottom">

<font COLOR="red" SIZE="6"/>Enter your UserName<input type="text" name="userName" required><br>
<font COLOR="red" SIZE="6"/>Enter your Password&nbsp;&nbsp;<input type="text" name="password" required><br>

<input type="submit" value="login">
<input type="reset" value="Cancel">
<a href="newStudent.jsp">Register</a>
</form>
</div>
</body>
</html> 





