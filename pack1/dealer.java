package pack1;
import java.util.Scanner;

public class dealer {
    int dealer_id;
    String dealer_name;
    String location;
    long dphone_no;
    String type;
    int sales_id;
    int total_no_of_sales;
    static int monthlytarget;

    static
    {

        monthlytarget = 25;
        System.out.println("Monthy target:" + monthlytarget);
    }

    
    
    public void addDealer() 
    {
        try (Scanner sc = new Scanner(System.in))
         {
            System.out.print("Enter dealer id:");
            this.dealer_id = sc.nextInt();
            System.out.print("Enter dealer name:");
            this.dealer_name = sc.next();
            System.out.print("Enter location:");
            this.location = sc.next();
            System.out.print("Enter dealer phone_no:");
            this.dphone_no = sc.nextLong();
            System.out.print("Enter dealer type:");
            this.type = sc.next();
        }

    }

    public void calculateSales() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter sales id:");
            this.sales_id = sc.nextInt();
            System.out.print("Enter total_no_of_sales:");
            this.total_no_of_sales = sc.nextInt();
        }

    }

    public void dealertarget()
    {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter dealer id:");
            this.dealer_id = sc.nextInt();
            System.out.println("Enter dealer name:");
            this.dealer_name = sc.nextLine();

        }
    }
}
