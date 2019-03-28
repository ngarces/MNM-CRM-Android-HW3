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
    
    //Constructors to set up new customer
    public Employee(String last, String first, String em, String phone, long idNum){
        lastName = last;
        firstName = first;
        email = em;
        phoneNum = phone;
        id = idNum;
    }

    public Employee(String last, String first){
        lastName = last;
        firstName = first;
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

    //setter methods
    public void setLastName(String last) {
        lastName = last;
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public void setEmail(String em) {
        email = em;
    }

    public void setPhoneNum(String phone) {
        phoneNum = phone;
    }

    public void setId(long idNum){
        idNum = id;
    }
}
