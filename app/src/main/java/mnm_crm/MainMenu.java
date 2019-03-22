package mnm_crm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author meghnasawhney
 * this class will represent the main menu that users will interact with
 */


public class MainMenu {
    private final List <Option> options;
    
    public MainMenu(){
        options = new ArrayList<>();
    }
    
    public void add (Option option1){
        options.add(option1);
    }
    
    public void chooseOption(){
            Scanner scan = new Scanner(System.in);
            String option ="";
            int choice;
            boolean loop=true;
            System.out.println("Main Menu ");
            System.out.println("Choose an option below:");
            System.out.println("1. Create an Employee ");
            System.out.println("2. Delete an Employee ");
            System.out.println("3. Create Customer ");
            System.out.println("4. Delete Customer ");
            System.out.println("5. Exit ");
            System.out.println("Enter your option below: ");
            choice =scan.nextInt();
            

            switch (choice) {
            case 1:
                System.out.println("You chose to create an Employee ");
                option = scan.nextLine();
                CreateEmployee.execute();
                
                break;
            case 2:
                System.out.println("You chose to delete an employee ");
                option = scan.nextLine();
                //DeleteEmployee.execute();
                break;
            case 3:
                System.out.println("You chose to create a customer ");
                option = scan.nextLine();
                CreateCustomer.execute();
                break;
            case 4:
                System.out.println("You chose to delete a customer ");
                option = scan.nextLine();
                DeleteCustomer.execute();
                break;
             case 5: 
                System.out.println("You have exited");
                System.exit(0);
                break;
            default :
                System.out.println("Not a valid option");
                break;
            }
    }
}

   // }while(choice !=6);
         
        


