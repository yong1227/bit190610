package com.bitcamp.web.mapper;

import java.util.List;

import com.bitcamp.web.domain.CategoryDTO;

import org.springframework.stereotype.Repository;

/**
 * CateforyMapper
 */
@Repository
public interface CategoryMapper {

     //create 추가
     public void insertCategory(CategoryDTO category);
     //read 종류 3가지
     public List<CategoryDTO> selectCategories();
     public List<CategoryDTO> selectCategoriesByWord(CategoryDTO category);
     public CategoryDTO selectCategoryByCategoryId(String category);
 
     //update
     public void updateCategory(CategoryDTO category);
     //delete
     public void deleteCategory(CategoryDTO category);
    
}