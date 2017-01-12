package com.rizomm.ecommerce.service;

import com.rizomm.ecommerce.model.Category;
import com.rizomm.ecommerce.model.Item;
import org.junit.Test;

import javax.rmi.PortableRemoteObject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Lamoot Alexandre on 12/01/2017.
 */
public class ItemServiceIT extends AbstractEJBTest {

    @Test
    public void shouldCreateAItem() throws Exception {

        // Creates an instance of category
        Category category = new Category();
        category.setName("category 1");
        category.setDescription("Science fiction comedy book");
        category.setFamily("family 1");
        // Creates an instance of item
        Item item = new Item();
        item.setCategory(category);
        item.setDescription("desc1");
        item.setPicture("img.png");
        item.setPrice(12.75);
        item.setQuantity(12L);

        Object ejb = ctx.lookup("java:global/ecommerce-1.0.0-SNAPSHOT/CategoryService");
        assertNotNull(ejb);

        // Looks up the EJB
        ItemService itemService = (ItemService) PortableRemoteObject.narrow(ejb, ItemService.class);

        // Persists the item to the database
        int oldSize = itemService.getAllService().size();
        item = itemService.saveItem(item);
        assertNotNull("ID should not be null", item.getIdItem());

        // Retrieves all the item from the database
        assertEquals(oldSize+1, itemService.getAllService().size());
    }
}
