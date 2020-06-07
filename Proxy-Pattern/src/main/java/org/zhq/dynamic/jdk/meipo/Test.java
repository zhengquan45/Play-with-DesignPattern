package org.zhq.dynamic.jdk.meipo;

import org.zhq.staticize.meipo.Person;

public class Test {
    public static void main(String[] args) {
        try {
            Person person = (Person) new JDKMeipo().getInstance(new Customer());
            person.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
