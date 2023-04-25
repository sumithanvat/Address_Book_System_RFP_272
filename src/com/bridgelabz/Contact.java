package com.bridgelabz;

import java.util.ArrayList;

public class Contact {
    private String firstName, lastName, address, city, state, zipCode, contactNo, email;
    public Contact(String firstName, String lastName, String address, String cityName, String stateName, String zipCodeNo, String contact, String emailAddr){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = cityName;
        this.state = stateName;
        this.zipCode = zipCodeNo;
        this.contactNo = contact;
        this.email = emailAddr;
    }

    public static void add(ArrayList<Contact> contacts1) {
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }

    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getContactNo(){
        return contactNo;
    }
    public String getZipCode(){
        return zipCode;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = firstName;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setContactNo(String contactNo){
        this.contactNo = contactNo;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String toString(){
        return "Contacts:" + firstName + " " +lastName + " Email "+email +" Address "+ address +" City " +city + " State "+state +" "+ " Contact "+ contactNo +" ZipCode" + zipCode ;
    }

}
