package com.demo.test;

public class Employee {
    private String name = "lisi";
    {
        System.out.println("初始化1");
        name = "wangwu";
        age = 20;
    }
    private int age = 30;
    static {
        System.out.println("静态初始化1");
        System.out.println("id0:" + Employee.id);
        Employee.id = 40;
        System.out.println("id1:" + Employee.id);
        System.out.println("liuliu开始");
        Employee employee = new Employee("liuliu", 50);
        System.out.println(employee);
        System.out.println("liuliu id:" + employee.getId());
        System.out.println("liuliu结束");
    }
    private static int id = 30;

    {
        System.out.println("初始化2");
        name = "zhaosi";
        age = 40;
    }
    static {
        System.out.println("id2:" + Employee.id);
        System.out.println("静态初始化2");
        id = 80;
        System.out.println("id3:" + Employee.id);
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, int age) {
        super();
        System.out.println("有參構造器");
        this.name = name;
        this.age = age;
    }

    public Employee() {
        super();
        System.out.println("無參構造器");
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }

}

