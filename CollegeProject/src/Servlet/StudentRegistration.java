package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegistration
 */
@WebServlet("/StudentRegistration")
public class StudentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String fathername=req.getParameter("fathername");
		String personaladdress=req.getParameter("personaladdress");
		String sex=req.getParameter("sex");
		String City=req.getParameter("City");
		String Course=req.getParameter("Course");
		String State=req.getParameter("State");
		String pincode=req.getParameter("pincode");
		String emailid=req.getParameter("emailid");
		String mobileno=req.getParameter("mobileno");
		String password=req.getParameter("password");
		String repassword=req.getParameter("repassword");
		String dob=req.getParameter("dob");
		System.out.println(sex +"," +State +","+Course);
		
		
		Statement stmt = null;
		 Connection dbConnection = null;
		 ResultSet rs=null;
		 dbConnection=  dbutil.getDBConnection();
		try {
			stmt = dbConnection.createStatement();
			boolean valid=studentDetailsValidation(dbConnection,stmt,emailid,password,repassword);
			if(valid){
			String query= "insert into student(firstname,lastname,fathername,personaladdress,sex,City,Course,State,pincode,emailid,mobileno,password,dob)VALUES('"+firstName+"','"+lastName+"','"+fathername+"','"+personaladdress+"','"+sex+"','"+City+"','"+Course+"','"+State+"','"+pincode+"','"+emailid+"','"+mobileno+"','"+password+"','"+dob+"');";
			stmt.execute(query);
			String loginUserquery= "insert into loginUsers(userName,password,emailId) values ('"+firstName+"','"+password+"','"+emailid+"')";
			 stmt.execute(loginUserquery);
			}else{
				req.setAttribute("message", "Registeration Failed");
		        req.getRequestDispatcher("/NewStudent.jsp").forward(req, res);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean studentDetailsValidation(Connection dbConnection, Statement stmt, String emailid, String password,
			String repassword) throws SQLException {
		String query= "select * from student where emailid='"+emailid+"'";
		ResultSet rs = stmt.executeQuery(query);
		boolean valid=true;
		 int i = 0;
	        while(rs.next()) {
	            i++;
	        }
	        if(i!=0){
	        	valid=false;
	        }
			return valid;
	}
}
