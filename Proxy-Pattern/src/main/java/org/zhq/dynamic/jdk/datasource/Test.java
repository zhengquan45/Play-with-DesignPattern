package org.zhq.dynamic.jdk.datasource;

import org.zhq.staticize.datasource.IOrderService;
import org.zhq.staticize.datasource.Order;
import org.zhq.staticize.datasource.OrderDao;
import org.zhq.staticize.datasource.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        try{
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2019/02/03");
            order.setCreateTime(date.getTime());
            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService(new OrderDao()));
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
