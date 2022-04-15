import java.util.HashMap;
public class Garage {
    private HashMap<Employee,Integer> employees;
    private HashMap<Customer,Integer> customers;
    public static int totalSpent; /*-------------------STATIC AND PUBLIC ACCESS MODIFIER KEYWORD---------------*/
    public static int totalEarned;/*-------------------STATIC AND PUBLIC ACCESS MODIFIER KEYWORD---------------*/

    public Garage()/*--------------------------------------CONSTRUCTOR OVERLOADING------------------------------------------------------*/
    {
        totalEarned=0;
        totalSpent=0;
    }
    public Garage(HashMap<Employee,Integer> employees,HashMap<Customer,Integer> customers)/*-------------------------CONSTRUCTOR OVERLOADING----------------------------*/
    {
        this.employees=employees;
        this.customers=customers;
        totalSpent=0;
        totalEarned=0;
    }
    public HashMap<Employee,Integer> getEmployees(){

        return employees;
    }
    public void addEmployee(Employee employee){

        employees.put(employee,employee.id);
    }
    public HashMap<Customer,Integer> getCustomer(){

        return customers;
    }
    public void addCustomer(Customer customer){

        customers.put(customer,customer.id);
    }
    public int getTotalEarned()
    {

        return totalEarned;
    }
    public static void updateTotalEarned(int MoneyEarned){

        totalEarned+=MoneyEarned;
    }
    public int getTotalSpent()
    {

        return totalSpent;
    }
    public static void updateTotalSpent(int MoneySpent){

        totalSpent+=MoneySpent;
    }


}
