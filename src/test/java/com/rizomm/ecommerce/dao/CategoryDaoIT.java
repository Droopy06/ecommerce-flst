package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Category;
import org.junit.Test;

import javax.persistence.Persistence;

import static org.junit.Assert.assertNotNull;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
public class CategoryDaoIT {

    @Test
    public void getAllCategories() throws Exception{
        CategoryDaoImpl categoryDao = new CategoryDaoImpl();
        categoryDao.em = Persistence.createEntityManagerFactory("ecommerce2PU").createEntityManager();
        Category category = new Category("category 1","Description of category 1","family 1");
        categoryDao.createCategory(category);
        assertNotNull(categoryDao.getAllCategories());
    }
}
