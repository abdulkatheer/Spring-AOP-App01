package org.katheer.service;

import org.katheer.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

   @Override
   public void getEmployeeDetails(Employee e) {
      System.out.println("Employee details from getEmployeeDetails() method :");
      System.out.println("Name   : " + e.getName());
      System.out.println("ID     : " + e.getEid());
      System.out.println("Mobile : " + e.getMobile());
      System.out.println("Email  : " + e.getEmail());
      System.out.println("Salary : " + e.getSal());
      System.out.println("Place  : " + e.getPlace());
   }

   @Override
   public void displayEmployeeDetails(Employee e) {
      System.out.println("Employee details from displayEmployeeDetails() method :");
      System.out.println("Name   : " + e.getName());
      System.out.println("ID     : " + e.getEid());
      System.out.println("Mobile : " + e.getMobile());
      System.out.println("Email  : " + e.getEmail());
      System.out.println("Salary : " + e.getSal());
      System.out.println("Place  : " + e.getPlace());
   }

   @Override
   public void dummy() {

   }
}
