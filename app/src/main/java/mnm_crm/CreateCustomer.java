/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mnm_crm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author meghnasawhney
 */
public class CreateCustomer {
    public final List<Customer> customers;
    
    public CreateCustomer(){
        customers=new ArrayList<>();
    }
    
    public static void execute(){
        System.out.println("Enter the Customer's last name: ");
        Scanner scanner=new Scanner(System.in);
        String last=scanner.nextLine();
        System.out.println("Enter the Customer's first name: ");
        String first=scanner.nextLine();
        System.out.println("Enter the Customer's email: ");
        String email=scanner.nextLine();
        System.out.println("Enter the Customer's phone (no spaces):");
        String phone=scanner.nextLine();
        System.out.println("Enter the Customer's address: ");
        String addy=scanner.nextLine();
         Customer newCust= new Customer(last,first,email,phone,addy);
         newCust.printCustomer();
    }
    
}
