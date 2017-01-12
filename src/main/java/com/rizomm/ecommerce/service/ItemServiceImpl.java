package com.rizomm.ecommerce.service;

import com.rizomm.ecommerce.dao.ItemDao;
import com.rizomm.ecommerce.model.Item;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by LAMOOT Alexandre on 17/11/2016.
 */
@Remote
@Stateless
public class ItemServiceImpl implements ItemService {

    @Inject
    private ItemDao itemDao;

    @Override
    public List<Item> getAllService() {
        return itemDao.getAllItems();
    }

    @Override
    public Item getItemById(int id) {
        return itemDao.getItemById(id);
    }

    @Override
    public Item saveItem(Item item) {
        return itemDao.createItem(item);
    }

    @Override
    public Item updateItem(Item item) {
        return null;
    }

    @Override
    public void deleteArticle(int id) {

    }
}
