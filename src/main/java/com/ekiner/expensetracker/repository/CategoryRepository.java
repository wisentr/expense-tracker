package com.ekiner.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ekiner.expensetracker.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	Category findByName(String name);
}
