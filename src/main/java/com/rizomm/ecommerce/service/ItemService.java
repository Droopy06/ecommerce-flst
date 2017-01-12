package com.rizomm.ecommerce.service;

import com.rizomm.ecommerce.model.Item;

import java.util.List;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
public interface ItemService {
    List<Item> getAllService();
    Item getItemById(int id);
    Item saveItem(Item item);
    Item updateItem(Item item);
    void deleteArticle(int id);
}
