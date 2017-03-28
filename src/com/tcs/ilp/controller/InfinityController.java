package com.tcs.ilp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tcs.ilp.bean.Customer;
import com.tcs.ilp.service.InfinityService;

/**
 * Servlet implementation class InfinityController
 */
public class InfinityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfinityController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request,response);
	}
	
	public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("actionCheck");
		InfinityService service=new InfinityService();
		if("login".equals(action)){
			String name=request.getParameter("username");
			String passwd=request.getParameter("passwd");
			if(name.charAt(0)=='O'){
				request.setAttribute("msg","Operator");
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/home.jsp");
				rd.forward(request, response);
			}
			else if(name.charAt(0)=='A'){
				request.setAttribute("msg","Admin");
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/home.jsp");
				rd.forward(request, response);
			}else if(name.charAt(0)=='C'){
				request.setAttribute("msg","Customer");
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/home.jsp");
				rd.forward(request, response);
			}
			}
		else if("home".equals(action)){
			String msg=(String)request.getSession().getAttribute("msg");
			request.setAttribute("msg",msg);
			RequestDispatcher rd=request.getRequestDispatcher("/jsp/addCustomer.jsp");
			rd.forward(request, response);
		}
		
		else if("addCustomer".equals(action)){
			int count=0;
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String email=request.getParameter("email");
			long phone=Long.parseLong(request.getParameter("mob"));
			String add1=request.getParameter("add1");
			String add2=request.getParameter("add2");
			String landmark=request.getParameter("land");
			int pincode=Integer.parseInt(request.getParameter("pin"));
			String operatorid=request.getParameter("oid");
			String operatorname=request.getParameter("oname");
			String retailerid=request.getParameter("rid");
			String retailername=request.getParameter("rname");
			Customer c=new Customer(fname,lname,email,phone,add1,add2,landmark,pincode,operatorid,operatorname,retailerid,retailername);
			count=service.addCustomer(c);
			if(count>0){
				request.setAttribute("msg","Customer with ID: "+"C"+count+"successfully registered");
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/addCustomerResult.jsp");
				rd.forward(request, response);
			}
			else {
				request.setAttribute("msg","Customer not registered");
				RequestDispatcher rd=request.getRequestDispatcher("/jsp/addCustomerResult.jsp");
				rd.forward(request, response);
			}
			
		}
	}

		
}
