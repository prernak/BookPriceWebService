package com.rit.bookstore.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rit.bookstore.services.BookList;
import com.rit.bookstore.services.BookStore;
import com.rit.bookstore.services.BookStoreImplService;
import com.rit.bookstore.services.Book;

/**
 * Servlet implementation class getBookDetails
 */
public class getBookDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getBookDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside servlet getBook");
		String bookBuyOption = request.getParameter("ServiceCombo");
		String keyWorkDet = request.getParameter("text");
		
		response.setContentType("text/html");
		 
		if( bookBuyOption == "getBookByAuthor"){
			    BookStoreImplService service = new BookStoreImplService();
				BookStore bs = service.getBookStoreImplPort(); 

				BookList objBookList = new BookList();
				
				objBookList = bs.bookDetailsByAuthor(keyWorkDet);
				request.setAttribute("objBookList", objBookList);
				
				for(int i=0; i < objBookList.getListBooks().size() ; i++)
				{
					
					System.out.println(objBookList.getListBooks().get(i).getTitle());
					
					
				}
			
		}
		else
		{
		    BookStoreImplService service = new BookStoreImplService();
			BookStore bs = service.getBookStoreImplPort(); 

			BookList objBookList = new BookList();
		
			
			request.setAttribute("objBookList", objBookList);
			objBookList = bs.getBookByTitle(keyWorkDet);
			
			for(int i=0; i < objBookList.getListBooks().size() ; i++)
			{
				
				System.out.println(objBookList.getListBooks().get(i).getTitle());
				
				
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse 
			response) throws ServletException, IOException {
		doGet(request, response);
	}

}
