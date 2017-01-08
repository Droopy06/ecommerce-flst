package com.rizomm.ecommerce.Controller;

import com.rizomm.ecommerce.dao.ItemDaoImpl;
import com.rizomm.ecommerce.model.Item;

import javax.ejb.EJB;

/**
 * Created by ISEN on 07/01/2017.
 */
public class ItemController {
    private Item item = new Item();


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    @EJB
    ItemDaoImpl items;

}
