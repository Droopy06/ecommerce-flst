package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Category;
import com.rizomm.ecommerce.model.Item;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
public interface ItemDao {

    List<Item> getAllItems();
    List<Item> getItemsByCategory(Category cat);
    List<Item> getItemsByKeyWord(String keyWord);
    Item getItemById(int id);
    Item createItem(Item item, Category cat);
    Item createItem(Item item);
    void deleteItem(Item item);
    void updateItem(Item item);

}
