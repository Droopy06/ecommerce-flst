package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Item;
import com.rizomm.ecommerce.model.Category;
import org.junit.Test;

import javax.persistence.Persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
public class ArticleDaoIT {

    @Test
    public void createItem() throws Exception{
        Item item = new Item("designationProd1","Description Produit1",100L,1800D);
        Category category = new Category("category 1","Description of category 1","family 1");
        item.setCategory(category);
        ItemDaoImpl articleDao = new ItemDaoImpl();
        articleDao.em = Persistence.createEntityManagerFactory("ecommercePU").createEntityManager();
        assertNotNull(articleDao.createItem(item));
        assertEquals(1,articleDao.getAllItems().size());
    }

    @Test
    public void getAllItems() throws Exception{
        ItemDaoImpl articleDao = new ItemDaoImpl();
        articleDao.em = Persistence.createEntityManagerFactory("ecommercePU").createEntityManager();
        assertNotNull(articleDao.getAllItems());
    }
}
