package org.katheer.advice.validation;

import org.katheer.bean.Employee;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class EmployeeValidatorAdvice implements MethodBeforeAdvice {
   @Override
   public void before(Method method, Object[] args, Object object) throws Throwable {
      System.out.println("Validation messages for " + method.getName() + "() method :");

      Employee employee = (Employee) args[0];

      if (employee.getEid() < 100 || employee.getEid() > 999) {
         System.out.println("***Employee ID must be a 3 digit number***");
      }

      if (!employee.getEmail().endsWith("@ig.com")) {
         System.out.println("***Employee email is not valid***");
      }

      if (!employee.getMobile().startsWith("91-")) {
         System.out.println("***Employee mobile number is invalid***");
      }

      if (employee.getSal() < 20000 || employee.getSal() > 100000) {
         System.out.println("***Employee salary is not valid***");
      }
   }
}
