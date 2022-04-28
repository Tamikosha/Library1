package com.tamer.library.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.tamer.library.Model.Author;
import com.tamer.library.Model.Book;
import com.tamer.library.Repository.AuthorRepository;
import com.tamer.library.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

	
	@Autowired
    AuthorRepository ar;
	
	@Autowired
    BookRepository br;
	
	public Author addAuthor(Author author)
	{
		author.setBooks((List<Book>)br.findAll());
	   	Author a=ar.save(author);
	   	return a;
	}
	public List<Author> getAll()
	{
	 return (List<Author>)ar.findAll();
	}
	
	public Set<Author> getSpecefic(int arr[])
	{
		Set<Author> authors=new HashSet<Author>();
		for(int c=0;c<arr.length;c++)
		{
			authors.add(ar.findOne(arr[c]));
		}
		return authors;
	}
}