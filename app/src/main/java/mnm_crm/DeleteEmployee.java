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
public class DeleteEmployee {
     private final List<Employee> employees;
    
    
    public DeleteEmployee(){
        employees=new ArrayList<>();
    }
    
    public static void execute(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the employee's id number:");
        int idNum=in.nextInt();
        //for(int i =0;i < employees.size();i++){
        //int id=employees[i].getId();
        //if (id = idNum){
           // employees.remove(i);
       // }else{
         //  i++; 
        }
        }

   
    
