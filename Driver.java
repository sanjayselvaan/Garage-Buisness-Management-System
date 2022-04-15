import java.util.Scanner;
public class Driver {
    public static void main(String[]args){
        int k=1,choice=0,m=0;
        Scanner read=new Scanner(System.in);
        Operations o=new Operations();
        while(k>0)            /*----------------------------------------LOOP------------------------------------------------------*/
        {
            System.out.println("------ABC GARAGE------\n\n------CUSTOMER SECTION------\n(1).Add Customer  (2).Update Customer Total Bill and Customer Paid Amount  (3).Update Customer's Full Details  (4).Show Customer Details  (5).Show Entire Customer Details\n\n------EMPLOYEE SECTION------\n(6).Add Employee  (7).Update Employee's Salary and Employee's Salary Paid  (8).Update Employee's Full Details  (9).Show Employee Details  (10).Show Entire Employee Details\n\n------GARAGE SECTION------\n(11).Show Garage's Total Money Earned  (12).Show Garage's Total Money Spent  (13).Show Garage's Net Profit (14).Exit");
            System.out.println("Enter choice:");
            choice=read.nextInt();
            switch(choice)         /*-----------------------------------------SWITCH STATEMENT------------------------------------------*/
            {
                case 1:
                    m=0;
                    o.addCustomer(m);
                    break;

                case 2:
                    o.updateTotalBill_AmountPaid();
                    break;
                case 3:
                    m=1;
                    o.addCustomer(m);
                    break;
                case 4:
                    o.showCustomerDetails();
                    break;
                case 5:
                    o.showAllCustomerDetails();
                    break;
                case 6:
                    m=0;
                    o.addEmployee(m);
                    break;
                case 7:
                    o.updateSalary_salaryPaid();
                    break;
                case 8:
                    m=1;
                    o.addEmployee(m);
                    break;
                case 9:
                    o.showEmployeeDetails();
                    break;
                case 10:
                    o.showAllEmployeeDetails();
                    break;
                case 11:
                    o.showGarageTotalEarning();
                    break;
                case 12:
                    o.showGarageTotalSpent();
                    break;
                case 13:
                    o.showGarageNetProfit();
                    break;
                case 14:
                    k=0;
                    break;

            }

        }
    }

}
