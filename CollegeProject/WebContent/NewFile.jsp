<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
Login Failed
<form action="login" method="post">
Enter your UserName1<input type="text" name="userName" required><br>
Enter your Password<input type="text" name="password" required><br>

<input type="submit" value="login">
<input type="reset" value="Cancel">
<a href="NewStudent.html">Register</a>

<%-- <%
    if(null!=request.getAttribute("errorMessage"))
    {
        out.println(request.getAttribute("errorMessage"));
    }
%> --%>
</form>

</body>
</html>
