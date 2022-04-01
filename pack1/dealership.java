package pack1;
import java.util.Scanner;

public class dealership {
    int dealership_id;
    String dealership_name;
    String dealership_email;
    long phone_no;
    String dealership_address;

    public void addDealership() {
        try (Scanner sc = new Scanner(System.in))
         {
            System.out.print("Enter dealership id:");
            this.dealership_id = sc.nextInt();
            System.out.print("Enter dealership name:");
            this.dealership_name = sc.next();
            System.out.print("Enter email:");
            this.dealership_email = sc.next();
            System.out.print("Enter phone no:");
            this.phone_no = sc.nextLong();
            System.out.print("Enter address:");
            this.dealership_address = sc.next();
        }
    }

    public void numberofdealerships() {

    }

    public void dealershipstatus() {

    }
}
