/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnm_crm;

/**
 *
 * @author ngarc
 */
public class Employee implements Person{
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNum; //int can only hold a value so large, better represented as a string
    private long id;
    
    //Constructor to set up new customer
    public Employee(String last, String first, String em, String phone, long idNum){
        lastName = last;
        firstName = first;
        email = em;
        phoneNum = phone;
        id = idNum;
    }
    
    //prints employee's info in one line
    public void printCustomer(){
        System.out.println(lastName + ", " + firstName + "\t" + email + "\t" + phoneNum + "\t" + id);
    }
    
    
    //getter methods
    public String getLastName(){
        return lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPhoneNum(){
        return phoneNum;
    }
    
    public long getId(){
        return id;
    }
    
}
