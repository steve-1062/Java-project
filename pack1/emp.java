package pack1;
import java.util.Scanner;

public class emp 
{
    int employee_id;
    String first_name;
    String last_name;
    String designation;
    int age;
    String email;
    int phone_no;
    String address;
    int basicsalary;
    float DA;
    float HRA;
    float incometax;
    float GS;
    double bonus;

    protected void addEmployee()
     {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter employee id:");
            int employee_id = sc.nextInt();
            System.out.print("Enter first name:");
            String first_name = sc.next();
            System.out.print("Enter last type:");
            String last_name = sc.next();
            System.out.print("Enter employee age:");
            int age = sc.nextInt();
            System.out.print("Enter employee email id:");
            String email = sc.next();
            System.out.print("Enter employee phone_no:");
            long phone_no = sc.nextLong();
            System.out.print("Enter employee address:");
            String address = sc.next();
            System.out.print("Enter employee salary:");
            int basicsalary = sc.nextInt();
            calculatesalary(basicsalary);
            calculatesalary(basicsalary, DA, HRA);
            print_salary(basicsalary);
            print_salary(basicsalary, bonus);
            System.out.println("\nEmployee_id: " + employee_id + "\nFirst_name:" + first_name + "\nLast_name:" + last_name + "\nAge:" + age + "\nEmail:" + email + "\nPhone_no:"
                    + phone_no + "\nAddress:" + address + "\nBasic_ Salary:" + basicsalary);
        }

    }

private void calculatesalary(int basicsalary)
{
        HRA=(float) (0.1*basicsalary);
        DA=(float) (0.73*basicsalary);
        double bonus=1000+basicsalary;
        System.out.println("HRA:"+ HRA);
        System.out.println("DA:"+ DA);
        System.out.println("Bonus:"+ bonus);
}

private void calculatesalary(int basicsalary, float DA, float HRA)
{
   float GS=basicsalary+DA+HRA;
   float incometax=(float) ((0.3)*GS);
   System.out.println("GS:"+ GS);
   System.out.println("Income tax:"+ incometax);
}

protected void calculatesalary(float incometax, float GS)
{
   float netsalary=GS-incometax;
   System.out.println("Net salary:"+ netsalary);
}

public void print_salary(int basicsalary)
{
    System.out.println("Salary without bonus:" + basicsalary);
}

public void print_salary(int basicsalary,double bonus)
{
    System.out.println("Salary with bonus:" + (basicsalary+bonus));
}


}