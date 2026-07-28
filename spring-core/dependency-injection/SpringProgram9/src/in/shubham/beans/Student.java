package in.shubham.beans;

//Student.java
public class Student {
 private Address address;  // property name = "address"

 public void setAddress(Address address) {
     this.address = address;
 }

 public void show() {
     System.out.println("City: " + address.getCity());
 }
}