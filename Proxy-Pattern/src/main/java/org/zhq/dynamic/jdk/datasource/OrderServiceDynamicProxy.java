package org.zhq.dynamic.jdk.datasource;

import org.zhq.staticize.datasource.DynamicDataSourceEntry;
import org.zhq.staticize.datasource.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDynamicProxy implements InvocationHandler {
    private final SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    private void after() {
        System.out.println("Proxy after method");
    }

    private void before() {
        System.out.println("Proxy before method");

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Order order = (Order) args[0];
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到[DB_" + dbRouter + "]数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
        Object obj = method.invoke(target, args);
        after();
        return obj;
    }
}
