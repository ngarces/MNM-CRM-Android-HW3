package mnm_crm;

import java.util.ArrayList;
import java.util.List;

public class AccountingDepartment {

    List<Employee> employeeList;    //list of employees working in the accounting department
    List<Customer> customerList;    //list of customers for accounting department to keep track of
    List<Integer> chargesList;      //list of charges for customers, position of the charge in the list is consistent with the customer it belongs to

    public AccountingDepartment(){  //constructor
        employeeList = new ArrayList<>();
        customerList = new ArrayList<>();
        chargesList = new ArrayList<>();
    }

    public void addEmployee(Employee emp){  //add employee to list
        employeeList.add(emp);
    }

    public void addCustomer(Customer cust){ //add customer to list and set their charge to 0
        customerList.add(cust);
        chargesList.add(0);
    }

    public void setCharge(Customer cust, int charge){   //set the charge of a customer
        int index = customerList.indexOf(cust); //get index of the customer
        if (customerList.indexOf(cust) != -1){  //if customer is in the list
            chargesList.set(index, charge);     //update charge at the same index of the customer
        }
    }

    public void deleteCustomer(Customer cust){  //delete customer and their charge from the list
        int index = customerList.indexOf(cust); //get index of the customer
        if (customerList.indexOf(cust) != -1){  //if customer is in the list
            customerList.remove(index);     //delete customer
            chargesList.remove(index);      //delete charge tied to customer
        }
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}