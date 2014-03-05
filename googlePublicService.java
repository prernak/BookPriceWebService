package cmo.rit.googlebooksapi.client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.rit.bookstore.services.*;

import net.sf.json.JSONArray;  
import net.sf.json.JSONObject;  
import net.sf.json.JSONSerializer;  
 
public class googlePublicService {
 
	
	public static void main(String args[])
	{
		List<Book> books = findBookByTitle("harry");
	}
	
	// http://localhost:8080/RESTfulExample/json/product/get
	public static List<Book> findBookByTitle(String keyword) {
 
		List<Book> books = null;
		try
		{
	 
		String searchString =  "https://www.googleapis.com/books/v1/volumes?q=" +keyword+"&filter=paid-ebooks&key=AIzaSyACmaKYHmZYVC3GCXzBn_R52GD9VG4zkn8";
		URL url = new URL(searchString);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
 
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
		}
 
		BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));
 
		String output;
		
		String jsonString = "";
		
		//System.out.println("Output from Server .... \n");
		
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			jsonString += output;
			
		}
		br.close();
		
	//	System.out.println(jsonString);
		
		JSONObject  json = (JSONObject) JSONSerializer.toJSON(jsonString);
		
		
		JSONArray array_Item = json.getJSONArray("items"); 
		
		System.out.println(array_Item.size());
		
		
		books = new ArrayList<Book>();
		
		Book m_book;
		
		for(int i=0; i < array_Item.size() ; i++)
		{
			m_book = new Book();
			
			JSONObject childJSONObject = array_Item.getJSONObject(i);
			
			//Getting the Title
			JSONObject  volInfo = childJSONObject.getJSONObject("volumeInfo");
			String titleInfo = volInfo.getString("title");
			m_book.setTitle(titleInfo);
			
			
			//getting the Author Details
			String authorinfo = volInfo.getString("authors");
			
			

			String FormatName = "";
			
			
			for(int j=0; j <authorinfo.length() ; j++)
			{
						
				if( !( ( authorinfo.charAt(j) == '[' ) || (authorinfo.charAt(j) == '"' ) || ( authorinfo.charAt(j) == ']' )) )
				{
					FormatName += authorinfo.charAt(j);
					
				}
				
			}
					
			m_book.setAuthName(FormatName);
			
			//Getting the Price offered by google
			JSONObject saleInfo = childJSONObject.getJSONObject("saleInfo");
			JSONObject retailPriceinfo = saleInfo.getJSONObject("retailPrice");
			double priceinfo = retailPriceinfo.getDouble("amount");
			m_book.setPrice(""+priceinfo);
			
			System.out.println("Title " + titleInfo);
			System.out.println("Author " + FormatName);
			System.out.println("Price " + priceinfo);
			
			books.add(m_book);
			
			
		}
	
		
		conn.disconnect();
 
	  } 
		catch (MalformedURLException e) {
 
		e.printStackTrace();
 
	  } catch (IOException e) {
 
		e.printStackTrace();
 
	  }
	  	  

	return books;
 
	}
	
	
	
	
	public static List<Book> findBookByAuthor(String keyword) {
	 
	List<Book> books = null;
	
  try {


	String searchString =  "https://www.googleapis.com/books/v1/volumes?q="+keyword+"+inauthor:keyes&key=AIzaSyACmaKYHmZYVC3GCXzBn_R52GD9VG4zkn8";

	URL url = new URL(searchString);
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	conn.setRequestMethod("GET");
	conn.setRequestProperty("Accept", "application/json");

	if (conn.getResponseCode() != 200) {
		throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
	}

	BufferedReader br = new BufferedReader(new InputStreamReader(
		(conn.getInputStream())));

	String output;
	
	String jsonString = "";
	
	//System.out.println("Output from Server .... \n");
	
	while ((output = br.readLine()) != null) {
		jsonString += output;
		
	}
	br.close();
	
	System.out.println(jsonString);
	
	JSONObject  json = (JSONObject) JSONSerializer.toJSON(jsonString);
	
	
	JSONArray array_Item = json.getJSONArray("items"); 
	
//	System.out.println(array_Item.size());
	
	books = new ArrayList<Book>();
	
	Book m_book;
	
	for(int i=0; i < array_Item.size() ; i++)
	{
		m_book = new Book();
		
		JSONObject childJSONObject = array_Item.getJSONObject(i);
		
		//Getting the Title
		JSONObject  volInfo = childJSONObject.getJSONObject("volumeInfo");
		String titleInfo = volInfo.getString("title");
		m_book.setTitle(titleInfo);
		
		
		//getting the Author Details
		String authorinfo = volInfo.getString("authors");
		
		

		String FormatName = "";
		
		
		for(int j=0; j <authorinfo.length() ; j++)
		{
					
			if( !( ( authorinfo.charAt(j) == '[' ) || (authorinfo.charAt(j) == '"' ) || ( authorinfo.charAt(j) == ']' )) )
			{
				FormatName += authorinfo.charAt(j);
				
			}
			
		}
				
		m_book.setAuthName(FormatName);
		
	
		
		//Getting the Price offered by google
		JSONObject saleInfo = childJSONObject.getJSONObject("saleInfo");
		JSONObject retailPriceinfo = saleInfo.getJSONObject("retailPrice");
		double priceinfo = retailPriceinfo.getDouble("amount");
		
		//double priceinfo = 20.9;
		m_book.setPrice(""+priceinfo);
		
		System.out.println("Title " + titleInfo);
		System.out.println("Author " + FormatName);
		System.out.println("Price " + priceinfo);

		books.add(m_book);
		
		
	}
	
	
	conn.disconnect();
	


  } catch (MalformedURLException e) {

	e.printStackTrace();

  } catch (IOException e) {

	e.printStackTrace();

  }
  

return books;

}	
	
	
	
	
	
	
	
 
}
