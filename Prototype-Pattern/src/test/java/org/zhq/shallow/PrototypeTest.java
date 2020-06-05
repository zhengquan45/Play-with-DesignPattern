package org.zhq.shallow;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(18);
        concretePrototype.setName("prototype");
        concretePrototype.setHobbies(new ArrayList());
        System.out.println(concretePrototype);

        Client client = new Client(concretePrototype);
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone(concretePrototype);
        System.out.println(concretePrototypeClone);

        System.out.println("克隆对象中的引用类型地址值:" + concretePrototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值:" + concretePrototype.getHobbies());
        System.out.println("对象地址比较:" + (concretePrototype.getHobbies() == concretePrototypeClone.getHobbies()));


    }
}
