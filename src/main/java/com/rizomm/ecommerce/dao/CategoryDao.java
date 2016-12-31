package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Category;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
public interface CategoryDao {

     List<Category> getAllCategories();
     Category getCategoryById(int id);
     Category createCategory(Category category);
     void deleteCategory(Category category);
     void updateCategory(Category category);
}
