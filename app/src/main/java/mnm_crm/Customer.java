package mnm_crm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngarces
 */
public class Customer implements Person{
    private String lastName;
    private String firstName;
    private String business;
    private String email;
    private String phoneNum;   //int can only hold a value so large, better represented as a string
    private String address;
    private List<String> frequentlyOrdered;
    
    //Constructor to set up new customer
    public Customer(String last, String first, String bus, String em, String phone, String ad){
        lastName = last;
        firstName = first;
        business = bus;
        email = em;
        phoneNum = phone;
        address = ad;
        frequentlyOrdered = new ArrayList<>();
    }

    public Customer(String last, String first)
    {
        lastName = last;
        firstName = first;
    }
    
    //prints customer's info in one line
    public void printCustomer(){
        System.out.println(lastName + ", " + firstName + "\t" + email + "\t" + phoneNum + "\t" + address);
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
    
    public String getAddress(){
        return address;
    }

    public List<String> getFrequentlyOrdered(){ return frequentlyOrdered; }


    //set up setters later
}
