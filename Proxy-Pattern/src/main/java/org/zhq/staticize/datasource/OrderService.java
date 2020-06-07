package org.zhq.staticize.datasource;

public class OrderService implements IOrderService {
    private OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public int createOrder(Order order) {
        System.out.println("OrderService 调用 OrderDao 创建订单");
        return orderDao.insert(order);
    }
}
