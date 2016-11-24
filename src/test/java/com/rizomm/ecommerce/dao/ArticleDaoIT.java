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
    public void createBooks() throws Exception{
        Item item = new Item("product 1",15.57,"Description of pruduct 1","product1.png",5);
        Category category = new Category("category 1","Description of category 1","family 1");
        item.setCategory(category);
        ItemDaoImpl articleDao = new ItemDaoImpl();
        articleDao.em = Persistence.createEntityManagerFactory("ecommercePU").createEntityManager();
        assertNotNull(articleDao.createArticle(item));
        assertEquals(1,articleDao.getAllArticles().size());
    }

    @Test
    public void getAllBooks() throws Exception{
        ItemDaoImpl articleDao = new ItemDaoImpl();
        articleDao.em = Persistence.createEntityManagerFactory("ecommercePU").createEntityManager();
        assertNotNull(articleDao.getAllArticles());
    }
}
