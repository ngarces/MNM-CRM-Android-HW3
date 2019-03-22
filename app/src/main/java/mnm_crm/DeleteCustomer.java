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
public class DeleteCustomer {
     public final List<Customer> customers;
    
    
    public DeleteCustomer(){
        customers=new ArrayList<>();
    }
    
    public static void execute(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the customers id number:");
        int id=in.nextInt();
    
}
}
