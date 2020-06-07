package org.zhq.dynamic.nojdk;

import java.lang.reflect.Method;

public class GPMeipo implements GPInvocationHandler {
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.target,args);
        after();
        return null;
    }

    private void after() {
        System.out.println("觉得合适,准备办事");
    }

    private void before() {
        System.out.println("确认需求,开始物色");
    }

}
