import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> rentedVehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Vehicle Rental Company:\nchoose a number from the following: ");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Truck");
            System.out.println("3. Rent a Bike");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter a car model:");
                    String carModle = scanner.nextLine();
                    System.out.println("How many days?");
                    int carDays = scanner.nextInt();
                    Vehicle car = new Car(carModle,carDays);
                    car.displayDetails();
                    rentedVehicles.add(car);
                    break;
                case 2:
                    System.out.println("Enter truck type: ");
                    String truckType = scanner.nextLine();
                    System.out.println("Enter rental weeks: ");
                    int truckWeeks = scanner.nextInt();
                    Vehicle truck = new Truck(truckType,truckWeeks);
                    truck.displayDetails();
                    rentedVehicles.add(truck);
                    break;
                case 3:
                    System.out.println("Enter bike brand: ");
                    String bikeBrand = scanner.nextLine();
                    System.out.println("How many hours: ");
                    int bikeHours = scanner.nextInt();
                    Vehicle bike = new Bike(bikeBrand, bikeHours);
                    bike.displayDetails();
                    rentedVehicles.add(bike);
                    break;
                case 4:
                    System.out.println("Rented vehicles: ");
                    for(Vehicle vehicle: rentedVehicles){
                        vehicle.displayDetails();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Thanks for using Vehicle Rental Company.");
                    return;
                default:
                    System.out.println("Invalid choice. please try again.");
            }
        }
    }
}