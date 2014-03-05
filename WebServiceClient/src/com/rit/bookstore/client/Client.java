package com.rit.bookstore.client;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rit.bookstore.services.Book;
import com.rit.bookstore.services.BookStore;
import com.rit.bookstore.services.BookStoreImplService;


/**
 * Servlet implementation class Client
 */
public class Client extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Client() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request1, HttpServletResponse response1) throws ServletException, IOException {
		
		  BookStoreImplService service = new BookStoreImplService();
		  BookStore bs = service.getBookStoreImplPort(); 
		  Book book=bs.getBookByTitle(request1.getParameter("text"));
		  System.out.println("book in client  "+book.getAuthor());
		  request1.setAttribute("bookObj", book);
		  System.out.println("------->>  Call Started");
		 
		  System.out.println("------->>  Call Ended");
		response1.setContentType("text/html");
	    
	
	    request1.getRequestDispatcher("response.jsp").forward(request1, response1);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
