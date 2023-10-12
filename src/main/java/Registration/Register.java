package Registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		int rollno=Integer.parseInt(request.getParameter("rollno"));
		String user=request.getParameter("user");
		String gender=request.getParameter("gender");
		String dept=request.getParameter("dept");
		String password=request.getParameter("password");
//		int status=1;	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/mentoringsystem","root","");
			Statement stmt=conn.createStatement();
			PreparedStatement pstm=conn.prepareStatement("INSERT INTO student_master(name,gender,rollno,role,email,password,dept) VALUES(?,?,?,?,?,?,?)");
			pstm.setString(1,name);
			pstm.setString(2,gender);
			pstm.setInt(3,rollno);
			pstm.setString(4,user);
			pstm.setString(5,email);
			pstm.setString(6,password);
			pstm.setString(7,dept);
			pstm.execute();
			
			PrintWriter out=response.getWriter();
			out.print("data inserted successfully");
			conn.close();
		}catch(Exception e) {
			response.getWriter().append(e.toString()).append(request.getContextPath());
		}
		
		
	}
	

}
