package com.onlineshopping.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onlineshopping.dao.CategoryDao;
import com.onlineshopping.model.Category;

@RestController
@RequestMapping("api/category")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {

	@Autowired
	private CategoryDao categoryDao;

	@GetMapping("all")
	public ResponseEntity<List<Category>> getAllCategories() {
		
       
		
		List<Category> categories = this.categoryDao.findAll();
		
		ResponseEntity<List<Category>> response = new ResponseEntity<>(categories, HttpStatus.OK);
		
		
		return response;
		
	}
	
	@PostMapping("add")
	public ResponseEntity<Object> add(@RequestBody Category category) {
		
		
		Category c = categoryDao.save(category);
		
		if(c != null) {
			System.out.println("response sent");
			return new ResponseEntity<Object>( c ,HttpStatus.OK);
		}
		
		else {
			
			return new ResponseEntity<Object>("Failed to add category!",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}

