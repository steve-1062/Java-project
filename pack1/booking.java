package pack1;
import java.util.Scanner;



public class booking 
{
    int booking_id;
    String booking_name;
    String customer_name;
    int employee_id;
    String booking_date;
    int principle;
    int interest_rate;
    int period;
    int total_amt;
    float Loan;
    float extra_amt;
    int Actual_amt;

    public void testdrive() 
    {
        try (Scanner sc = new Scanner(System.in))
         {
            System.out.print("Enter booking id:");
            this.booking_id = sc.nextInt();
            System.out.print("Enter booking name:");
            this.booking_name = sc.next();
            System.out.print("Enter customer name:");
            this.customer_name = sc.next();
            System.out.print("Enter employee id:");
            this.employee_id = sc.nextInt();
        }
    

    }

    public static void carbooking() {

    }

    public static void servicebooking() {

    }

    /*public void bookingamt(int total_amt)
    {    
        System.out.println("Total_amt:" + total_amt);
    }*/

    public void bookingamt(int principle, int Actual_amt)
    {
     Loan = (int) ((principle * 0.08 * 36)/100); 
     extra_amt = Loan - Actual_amt;
     System.out.println("Principle:" + principle);
     System.out.println("Loan_amt:" + Loan);
     System.out.println("Extra_amt:" + extra_amt);
    }

    public void bookingamt(float Loan){

    }

   

}
