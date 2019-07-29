package org.katheer.bean;

public class Employee {
   private int eid;
   private String name;
   private String place;
   private float sal;
   private String mobile;
   private String email;

   public String getMobile() {
      return mobile;
   }

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public float getSal() {
      return sal;
   }

   public void setSal(float sal) {
      this.sal = sal;
   }

   public int getEid() {
      return eid;
   }

   public void setEid(int eid) {
      this.eid = eid;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPlace() {
      return place;
   }

   public void setPlace(String place) {
      this.place = place;
   }

   @Override
   public String toString() {
      return eid + " - " + name + " - " + place;
   }
}
