package com.rizomm.ecommerce.model;

import com.rizomm.ecommerce.model.Customer;
import com.rizomm.ecommerce.model.OrderLine;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-01-02T11:42:30")
@StaticMetamodel(Order.class)
public class Order_ { 

    public static volatile SingularAttribute<Order, Long> idOrder;
    public static volatile ListAttribute<Order, OrderLine> items;
    public static volatile SingularAttribute<Order, Date> OrderDate;
    public static volatile SingularAttribute<Order, Customer> customer;

}