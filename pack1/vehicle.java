package pack1;
import java.util.Scanner;

public class vehicle {
    int vehicle_id;
    String vehicle_name;
    int model;
    String make;
    String type;
    String color;
    String deliverylocation;
    String delivery_date;
    int no_of_deliveries;
    int fuel;

    public void addVehicle()
    {
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter vehicle id:");
            int vehicle_id = sc.nextInt();
            System.out.print("Enter vehicle name:");
            String vehicle_name = sc.next();
            System.out.print("Enter model:");
            int model = sc.nextInt();
            System.out.print("Enter vehicle make:");
            String make = sc.next();
            System.out.print("Enter vehicle type:");
            String type = sc.next();
            System.out.print("Enter vehicle color:");
            String color = sc.next();
            System.out.print("Enter vehicle chasis number:");
            String chasis_no = sc.next();
            System.out.println(vehicle_id + " " + vehicle_name + " " + model + " " + make + " " + type + " " + color
                    + " " + chasis_no);
        }
    }
    public void vehicledelivery()
     {
        try (Scanner sc = new Scanner(System.in))
         {
            System.out.print("Enter vehicle id:");
            int vehicle_id = sc.nextInt();
            System.out.print("Enter delivery location:");
            String deliverylocation = sc.next();
            System.out.print("Enter no.of.delivered vehicles:");
            String no_of_deliveries = sc.next();
            System.out.print("Enter delivery date:");
            String delivery_date = sc.next();
            System.out.println(vehicle_id + " " + deliverylocation + " " + no_of_deliveries + " " + delivery_date);
        }

    }
    public void vehiclefuel() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter vehicle id:");
            int vehicle_id = sc.nextInt();
            System.out.print("Enter fuel level:");
            int fuel = sc.nextInt();
            System.out.println(vehicle_id + " " + fuel);
        }
    }
}
