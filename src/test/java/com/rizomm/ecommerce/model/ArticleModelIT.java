package com.rizomm.ecommerce.model;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
public class ArticleModelIT extends AbstractPersistentTest  {

    @Test
    public void shouldFindACustomer() throws Exception{
        Item item = new Item("product 1",15.57,"Description of pruduct 1","product1.png",5);
        Category category = new Category("category 1","Description of category 1","family 1");
        item.setCategory(category);
        tx.begin();
        em.persist(item);
        em.persist(category);
        tx.commit();

        assertNotNull(item.getId());
        assertNotNull(category.getId());
        // Clear
        em.clear();

        item = em.find(Item.class, item.getId());
        assertNotNull(item);
    }
}
