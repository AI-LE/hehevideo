package com.demo.test;

import com.demo.test.Employee;

public class TestDefault {
    public static void main(String[] args) {
        System.out.println("tom开始");
        Employee tom = new Employee("tom", 20);
        System.out.println(tom);
        System.out.println(tom.getId());
        System.out.println("tom结束");
        System.out.println("jouty开始");
        Employee jouty = new Employee("jouty", 19);
        System.out.println(jouty);
        System.out.println(jouty.getId());
        System.out.println("jouty结束");
        System.out.println("jerry开始");
        Employee jerry = new Employee("jerry", 19);
        System.out.println(jerry);
        System.out.println(jerry.getId());

        System.out.println("jerry结束");
    }
}