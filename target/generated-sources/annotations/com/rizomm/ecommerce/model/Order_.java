package com.rizomm.ecommerce.model;

import com.rizomm.ecommerce.model.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2016-11-17T17:48:14")
@StaticMetamodel(Order.class)
public class Order_ { 

    public static volatile SingularAttribute<Order, Integer> id;
    public static volatile ListAttribute<Order, Item> items;
    public static volatile SingularAttribute<Order, String> email;

}