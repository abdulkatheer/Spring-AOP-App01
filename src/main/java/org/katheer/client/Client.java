package org.katheer.client;

import org.katheer.bean.Employee;
import org.katheer.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      Employee employee1 = (Employee) context.getBean("employee1");
      Employee employee2 = (Employee) context.getBean("employee2");

      //Getting target via proxy
      EmployeeService employeeService = (EmployeeService) context.getBean("proxy");
      employeeService.getEmployeeDetails(employee1);
      employeeService.displayEmployeeDetails(employee2);
      employeeService.dummy();
   }
}
