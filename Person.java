/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Person { protected String name; protected
        String address;
public Person(){
    System.out.println("Inside Person:Constructor");
    name = "";
    address = "";
    
}
 
public Person (String name, String address){
    this.name = name;
    this.address = address;
}
public String getName(){
    return name;

}

public String getAddress(){
    return address;
}

public void setName(String add){
    this.name = name;
    
}

public void setAddress(String add){
    this.address = add;
}

}
