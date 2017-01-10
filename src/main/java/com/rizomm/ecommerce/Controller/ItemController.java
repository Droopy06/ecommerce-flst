package com.rizomm.ecommerce.Controller;

import com.rizomm.ecommerce.dao.ItemDaoImpl;

import javax.ejb.EJB;

/**
 * Created by ISEN on 07/01/2017.
 */
public class ItemController {
    @EJB
    ItemDaoImpl items;

}
