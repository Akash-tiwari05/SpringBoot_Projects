package com.Cineflex.Cineflex;

import com.Cineflex.Plan.Plan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.lang.model.element.Name;
import java.security.PrivateKey;

@Service
public class Self implements User{

   private String name;
    private int age;
    private long contact;
    private String address;
    private Plan plan;




    @Override
    public void setUserDetails(String Name, int age, long contact, String address) {
     this.name = Name;
      this.age = age;
      this.contact = contact;
      this.address = address;
    }

    @Override
    public void getUserDetails() {
        System.out.println("Hello "+name + " you have entered the following details for self");
        System.out.println("Age : "+age+"\nContact: "+contact + "\nAddress: "+  address);
    }


 @Override
 public Plan getUserPLan() {
  return plan;
 }

 public void setPlan(Plan plan){
     this.plan= plan;
 }
}
