package bookManagement.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import bookManagement.entity.Book;
@Service
public class BookService {
	public ArrayList<Book> bl = new ArrayList<Book>();
	public BookService()
	{
		bl.add(new Book(101,"Thirukural","Thiruvalluvar",560.0));
		bl.add(new Book(102,"HarryPotter","J.K.Rowling",2250.0));
		bl.add(new Book(103,"WingsOfFire","APJKalam",5000.0));
	}
	
	public String addBook(Book b)
	{
		bl.add(b);
		return "Book Added";
	}
	
	public String viewBook(int bid)
	{
		for(Book b : bl)
		{
			if(bid == b.getBid())
			{
				return b.toString();
			}
		}
		return "Book Unavailable";
	}
	
	public String viewAllBook()
	{
		return bl.toString();
	}
	public String updateBook(Book b)
	{
		for(Book b1 : bl)
		{
			if(b1.getBid() == b.getBid())
			{
				bl.remove(b1);
			}
		}
		bl.add(b);
		return "Book updated";
	}
	
	public String deleteBook(int bid) {
		for(Book b : bl)
		{
			if(bid == b.getBid())
			{
				bl.remove(b);
				return "Book Deleted";
			}
		}
		return "Book unavailable";
	}
}
