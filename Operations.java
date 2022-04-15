import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class Operations {
    int cid=1,custid,newbill,amtpd,eid=1,totbill,amt,Salary,salaryPaid,empid,salaryPd,newsalary;
    String ad,n;
    HashMap<Integer,Customer> customerMap=new HashMap<>();
    HashMap<Integer,Employee> employeeMap=new HashMap<>();
    Scanner read=new Scanner(System.in);
    /* 1 & 3*/ public void addCustomer(int choice){
        System.out.println("Enter customer name:");
        n=read.nextLine();
        System.out.println("Enter customer address:");
        ad=read.nextLine();
        if(choice==1)                                               /*-----------------------------------IF CONDITIONAL STATEMENT--------------------------------*/
        {
            System.out.println("Enter Customers Total Bill:");
            totbill=read.nextInt();
            System.out.println("Enter Amount Paid By Customer:");
            amt=read.nextInt();
            Customer a = new Customer(cid, n, ad, totbill, amt);
            customerMap.put(cid,a);
        }
        else {                                                    /*--------------------------------------ELSE CONDITIONAL STATEMENT------------------------------*/
            Customer a = new Customer(cid, n, ad);
            customerMap.put(cid, a);
        }
        cid++;
    }
    /*2*/public void updateTotalBill_AmountPaid(){
        System.out.println("Enter customer id:");
        custid=read.nextInt();
        System.out.println("Enter new total bill:");
        newbill=read.nextInt();
        System.out.println("Enter Amount Paid:");
        amtpd=read.nextInt();
        Customer c= customerMap.get(custid);
        c.updateTotalBill(newbill);
        c.payBill(amtpd);
    }
    /*4*/public void showCustomerDetails(){
        System.out.println("Enter customer id:");
        custid=read.nextInt();
        Customer c= customerMap.get(custid);
        System.out.format("%5s%15s%15s%15s%15s%15s", "ID", "NAME","ADDRESS","TOTAL_BILL", "AMOUNT_PAID","REMAINING_AMOUNT");
        System.out.format("%5s%15s%15s%15s%15s%15s",c.id,c.name,c.address,c.totalBill,c.amountPaid,(c.totalBill-c.amountPaid));
    }
    /*5*/public void showAllCustomerDetails(){
        System.out.format("%5s%15s%15s%15s%15s%15s\n", "ID", "NAME","ADDRESS","TOTAL_BILL", "AMOUNT_PAID","REMAINING_AMOUNT");
        for(Map.Entry<Integer,Customer> c:customerMap.entrySet())
        System.out.format("%5s%15s%15s%15s%15s%15s\n",c.getKey(),c.getValue().name,c.getValue().address,c.getValue().totalBill,c.getValue().amountPaid,(c.getValue().totalBill-c.getValue().amountPaid));
    }

    /*6&8*/public void addEmployee(int choice){
        System.out.println("Enter Employee name:");
        n=read.nextLine();
        System.out.println("Enter Employee address:");
        ad=read.nextLine();
        if(choice==1)
        {
            System.out.println("Enter Employee's Salary:");
            Salary=read.nextInt();
            System.out.println("Enter Salary Paid:");
            salaryPaid=read.nextInt();
            Employee a = new Employee(eid,n,ad,Salary,salaryPaid);
            employeeMap.put(eid,a);
        }
        else {
            Employee a = new Employee(cid,n,ad);
            employeeMap.put(eid,a);
        }
        eid++;
    }
    /*7*/public void updateSalary_salaryPaid(){
        System.out.println("Enter Employee id:");
        empid=read.nextInt();
        System.out.println("Enter new Salary:");
        newsalary=read.nextInt();
        System.out.println("Enter Salary Paid:");
        salaryPd=read.nextInt();
        Employee e= employeeMap.get(empid);
        e.updateSalary(newsalary);
        e.receiveSalary(salaryPd);
    }
    /*9*/public void showEmployeeDetails(){
        System.out.println("Enter Employee id:");
        empid=read.nextInt();
        Employee e= employeeMap.get(empid);
        System.out.format("%5s%15s%15s%15s%15s%15s", "ID", "NAME","ADDRESS","SALARY", "SALARY_PAID","REMAINING_SALARY");
        System.out.format("%5s%15s%15s%15s%15s%15s",e.id,e.name,e.address,e.salary,e.salaryPaid,(e.salary-e.salaryPaid));
    }
    /*10*/public void showAllEmployeeDetails(){
        System.out.format("%5s%15s%15s%15s%15s%15s\n", "ID", "NAME","ADDRESS","SALARY", "SALARY_PAID","REMAINING_SALARY");
        for(Map.Entry<Integer,Employee> e:employeeMap.entrySet())
            System.out.format("%5s%15s%15s%15s%15s%15s\n",e.getKey(),e.getValue().name,e.getValue().address,e.getValue().salary,e.getValue().salaryPaid,(e.getValue().salary-e.getValue().salaryPaid));
    }
    /*11*/public void showGarageTotalEarning()
    {
        System.out.println(Garage.totalEarned);
    }
    /*12*/public void showGarageTotalSpent()
    {
        System.out.println(Garage.totalSpent);
    }
    /*13*/public void showGarageNetProfit()
    {
        System.out.println(Garage.totalEarned-Garage.totalSpent);
    }
}
