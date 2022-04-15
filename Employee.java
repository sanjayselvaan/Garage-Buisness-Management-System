public class Employee extends People {
    static String shopName;
    int salary;
    int salaryPaid;
    public Employee(int id,String name,String address){     /*---------------------------CONSTRUCOR OVERLOADING-----------------------------*/
        this.id=id;
        this.name=name;
        this.address=address;
        this.salary=2500;
        this.salaryPaid=0;
    }
    public Employee(int id,String name,String address,int Salary,int salaryPaid){        /*----------------------------------CONSTRUCTOR OVERLOADING-----------------------------*/
        this.id=id;
        this.name=name;
        this.address=address;
        this.salary=Salary;
        this.salaryPaid=salaryPaid;
    }
    public void updateSalary(int salary)
    {
        this.salary+=salary;
    }
    public void receiveSalary(int amountSalary)
    {
        salaryPaid+=amountSalary;
        Garage.updateTotalSpent(salaryPaid);
    }
}
