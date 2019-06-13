package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.CategoryDTO;

import org.springframework.stereotype.Component;

/**
 * CategoryService
 */
@Component
public interface CategoryService {

    //create 추가
    public void addCategory(CategoryDTO category);
    //read 종류 3가지
    public List<CategoryDTO> findCategories();
    public List<CategoryDTO> findCategoriesByWord(CategoryDTO category);
    public CategoryDTO findCategoryByCategoryId(CategoryDTO category);

    //update
    public void updateCategory(CategoryDTO category);
    //delete
    public void deleteCategory(CategoryDTO category);
}