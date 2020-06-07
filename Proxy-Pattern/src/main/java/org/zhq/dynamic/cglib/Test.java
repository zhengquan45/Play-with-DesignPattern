package org.zhq.dynamic.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

public class Test {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/zhengquan/project/Play-with-DesignPattern/Proxy-Pattern/src/main/java/org/zhq/dynamic/cglib");
        try {
            Customer customer = (Customer) new CglibMeipo().getInstance(Customer.class);
            customer.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
