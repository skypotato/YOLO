package com.yolo.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yolo.category.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
