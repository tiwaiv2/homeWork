package Servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class test
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init Method");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destory Method");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String user=req.getParameter("userName");
		 String pass=req.getParameter("password");
		 PrintWriter out=res.getWriter();
		 try {
			boolean valid= uservalidation(user,pass);
			if(valid){
				req.setAttribute("message", "login Failed");
		        req.getRequestDispatcher("/index.jsp").forward(req, res);
			}else{
				req.setAttribute("userName", user);
		        req.getRequestDispatcher("/index.jsp").forward(req, res);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			out.close();
		}
		System.out.println("Service Method");
	 }
	private boolean uservalidation(String user, String pass) throws SQLException {
		boolean inValid=true;
		 Statement stmt = null;
		 Connection dbConnection = null;
		 dbConnection=  dbutil.getDBConnection();
		stmt = dbConnection.createStatement();
		String query= "select * from loginUsers where userName='"+user+"' and password='"+pass+"'";
        ResultSet rs = stmt.executeQuery(query);
        int i = 0;
        while(rs.next()) {
            i++;
        }
        if(i!=0){
        	inValid=false;
        }
        System.out.println("H2 In-Memory Database inserted through Statement");
	return inValid;
	}
}
