package org.zhq.shallow;

import java.util.List;

public class ConcretePrototypeA implements Prototype {
    private int age;
    private String name;
    private List hobbies;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    public Prototype clone() {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(this.age);
        concretePrototype.setHobbies(this.hobbies);
        concretePrototype.setName(this.name);
        return concretePrototype;
    }
}
