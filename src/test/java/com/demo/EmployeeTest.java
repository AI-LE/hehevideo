package com.demo;
import com.demo.repo.Employee;
//import com.hehevideo.controller.repo.Employee;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void find(){
        Employee employee = new Employee();
        employee.setName("keivn");
        System.out.println(employee.getName());
    }
}
