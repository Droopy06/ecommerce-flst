package com.rizomm.ecommerce.dao;

import com.rizomm.ecommerce.model.Customer;
import com.rizomm.ecommerce.model.Order;
import com.rizomm.ecommerce.service.PanierServiceImpl;

/**
 * Created by ISEN on 31/12/2016.
 */
public interface OrderDao {
    Order saveOrder(PanierServiceImpl p, Customer client);
}
