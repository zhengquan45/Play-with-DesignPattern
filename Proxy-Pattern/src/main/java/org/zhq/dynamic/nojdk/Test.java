package org.zhq.dynamic.nojdk;

import org.zhq.dynamic.jdk.meipo.Customer;
import org.zhq.staticize.meipo.Person;

public class Test {
    public static void main(String[] args) {
        Person person = (Person) new GPMeipo().getInstance(new Customer());
        System.out.println(person.getClass());
        person.findLove();
    }
}
