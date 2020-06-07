package org.zhq.staticize.datasource;

public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao 创建 Order 成功");
        return 1;
    }
}
