package com.tts.ShoppingCart.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tts.ShoppingCart.models.data.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

	Category findByName(String name);
	
	List<Category> findAll();
//	List<Category> findAllByOrderSortingAsc();

	Category findBySlug(String slug);

//	List<Category> findAllByOrderSortingAsc();
}
