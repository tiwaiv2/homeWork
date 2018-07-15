<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>

 <script>
function validateForm() {
    var x = document.forms["myForm"]["emailid"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
}
function check_pass() {
    if (document.getElementById('password').value !=
            document.getElementById('repassword').value) {
        document.getElementById('submit').disabled = true;
        alert("Password should match");
    } else {
        document.getElementById('submit').disabled = false;
    }
}
</script>

  </head>

  <body>

  <form name="myForm" action="StudentRegistration"  onsubmit="return validateForm();" method="post">

<table cellpadding="2" width="20%" bgcolor="99FFFF" align="center"

  cellspacing="2">


<tr>

  <td colspan=2>

  <center><font size=4><b>Student Registration Form</b></font></center>

  </td>

  </tr>

<%
    if(null!=request.getAttribute("message"))
    {
        out.println(request.getAttribute("message"));
    }
%>

<tr>

  <td>First Name</td>

  <td><input type=text name=firstName id="firstName" size="30" required></td>

  </tr>
  
  <tr>

  <td>Last Name</td>

  <td><input type=text name=lastName id="lastName" size="30" required></td>

  </tr>


<tr>

  <td>Father Name</td>

  <td><input type="text" name="fathername" id="fathername"

  size="30" required></td>

  </tr>


<tr>

  <td>Personal Address</td>

  <td><input type="text" name="personaladdress"

  id="personaladdress" size="30" required></td>

  </tr>


<tr>

  <td>Sex</td>

  <td required><input type="radio" name="sex" value="male" size="10" >Male

  <input type="radio" name="sex" value="Female" size="10">Female </td>

  </tr>


<tr>

  <td>City</td>

   <td><input type="text" name="City" id="City" size="30" required></td>

  </tr>


<tr>

  <td>Course</td>

  <td required><select name="Course">

  <option value="-1" selected>select..</option>

  <option value="B.Tech">B.TECH</option>

  <option value="MCA">MCA</option>

  <option value="MBA">MBA</option>

  <option value="BCA">BCA</option>

  </select></td>

  </tr>


<tr>

  <td>State</td>

  <td><input type="text" name="State" id="State" size="30" required></td>

  </tr>

  <tr>

  <td>PinCode</td>

  <td><input type="text" name="pincode" id="pincode" size="30" required></td>


</tr>

  <tr>

  <td>EmailId</td>

  <td><input type="text" name="emailid" id="emailid" size="30" required></td>

  </tr>
  <tr>

  <td>Password</td>

  <td><input type="password" name="password" id="password" size="30" required></td>

  </tr>
  <tr>

  <td>RepeatPassword</td>

  <td><input type="password" name="repassword" id="repassword" onchange='check_pass();' size="30" required></td>

  </tr>


<tr>

  <td>DOB</td>

  <td><input type="text" name="dob" id="dob" size="30" required></td>

  </tr>


<tr>

  <td>MobileNo</td>

  <td><input type="text" name="mobileno" id="mobileno" size="30" required></td>

  </tr>

  <tr>

  <td><input type="reset"></td>

  <td colspan="2"><input type="submit" id="submit" value="Submit Form" /></td>

  </tr>

  </table>

  </form>

  </body>

  </html>
