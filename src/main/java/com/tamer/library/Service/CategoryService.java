package com.tamer.library.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.tamer.library.Model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamer.library.Repository.CategoryRepository;


@Service
public class CategoryService {

	
	@Autowired
	CategoryRepository categoryRepository;
	public Category addCategory(Category category)
	{
		     
		   Category c=categoryRepository.save(category);
		     
		     return c;
                    
	}
	public List<Category> getAll()
	{
		return categoryRepository.findAll();
	}
	public Set<Category> getSpecefic(int arr[])
	{
		Set<Category> categories=new HashSet<>();
		for(int c=0;c<arr.length;c++)
		{
			categories.add(categoryRepository.findOne(arr[c]));
		}
		return categories;
	}
	
	
}