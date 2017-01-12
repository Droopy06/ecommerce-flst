package com.rizomm.ecommerce.factory;

import com.rizomm.ecommerce.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prog on 12/01/2017.
 */
public class ItemFactory {

    public static List<Item> getAllItems(){
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("clef usb","clef usb 4 GO","usb.png",10L,13.25));
        itemList.add(new Item("Ecran PC","Super ecran pc 32 pouces","ecran.png",15L,132.5));
        return itemList;
    }
}
