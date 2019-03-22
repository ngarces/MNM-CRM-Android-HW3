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
public class CreateEmployee {
    public final List<Employee> employees;
    
    public CreateEmployee(){
        employees=new ArrayList<>();
    }
    
    public static void execute(){
        System.out.println("Enter the Employee's last name: ");
        Scanner scanner=new Scanner(System.in);
        String last=scanner.nextLine();
        System.out.println("Enter the Employee's first name: ");
        String first=scanner.nextLine();
        System.out.println("Enter the Employee's email: ");
        String email=scanner.nextLine();
        System.out.println("Enter the Employee's phone (no spaces):");
        String phone=scanner.nextLine();
        System.out.println("Enter the Employee's id number: ");
        int id=scanner.nextInt();
        Employee newEmp= new Employee(last,first,email,phone,id);
        newEmp.printCustomer();
    }
    
}
