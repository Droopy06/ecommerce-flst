package com.rizomm.ecommerce.service;

import com.rizomm.ecommerce.model.Category;
import com.rizomm.ecommerce.service.CategoryService;
import com.rizomm.ecommerce.service.CategoryServiceImpl;
import org.junit.Test;

import javax.rmi.PortableRemoteObject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Lamoot Alexandre on 12/01/2017.
 */
public class CategoryServiceIT extends AbstractEJBTest {

    @Test
    public void shouldCreateACategory() throws Exception {

        // Creates an instance of category
        Category category = new Category();
        category.setName("category 1");
        category.setDescription("Science fiction comedy book");
        category.setFamily("family 1");

        Object ejb = ctx.lookup("java:global/ecommerce-1.0.0-SNAPSHOT/CategoryService");
        assertNotNull(ejb);

        // Looks up the EJB
        CategoryService categoryService = (CategoryService) PortableRemoteObject.narrow(ejb, CategoryService.class);

        // Persists the category to the database
        int oldSize = categoryService.getAllService().size();
        category = categoryService.saveCategory(category);
        assertNotNull("ID should not be null", category.getId());

        // Retrieves all the category from the database
        assertEquals(oldSize+1, categoryService.getAllService().size());
    }
}
