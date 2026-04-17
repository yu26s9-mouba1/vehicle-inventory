package com.pluralsight;
import java.util.Scanner;

//My main class
public class VehicleInventoryApp {

    //Creating an array of 20 vehicles
    static Vehicle[] vehicles = new Vehicle[20];

    //Declaring the counter that will track the amount of vehicles stored in the array
    static int vehicleCount = 6;
    static  Scanner scanner = new Scanner(System.in);


// Creating the method to run the menu loop
    public static void main(String[] args) {
        //Calling the method
        preloadVehicles();


        //Through this Infinite loop I can prompt the user for their command while the menu shows until if the user wants to quit
        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.print("Enter your command: ");


            //This allows me to read commands
            int command = scanner.nextInt();
            scanner.nextLine();

            //Using a switch to macth the command number with the right block
            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    searchByMakeModel();
                    break;
                case 5:
                    addVehicle();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Option not done yet or invalid command.");
            }


            }

        }


        //Making a method that reates 6 vehicles objects and stores them in the array
    public static void preloadVehicles() {
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500.00f); //adding 'f' at the end of each price since the the field is a float
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000.00f);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700.00f);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500.00f);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500.00f);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000.00f);


    }


    //Looping thru every vehicle currently stored and listing them
    public static void listAllVehicles() {
        for (int i = 0; i < vehicleCount; i++) {
            displayVehicle(vehicles[i]);
        }

    }


        //Searching the vehicles by their makes and models
        public static void searchByMakeModel() {
            System.out.print("Enter make/model to search: ");
            String searchValue = scanner.nextLine().toLowerCase();

            boolean found = false;

            for (int i = 0; i < vehicleCount; i++) {
                if (vehicles[i].getMakeModel().toLowerCase().contains(searchValue)) {
                    displayVehicle(vehicles[i]);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No vehicles found.");  
            }
        }



    //Using a method to add a new vehicle to the next available spot in the array
    public static void addVehicle() {
        if (vehicleCount >= vehicles.length) {
            System.out.println("Inventory is full.");
            return;
        }


        System.out.print("Enter vehicle ID: ");
        long vehicleId = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter odometer reading: ");
        int odometerReading = scanner.nextInt();

        System.out.print("Enter price: ");
        float price = scanner.nextFloat();
        scanner.nextLine();

        vehicles[vehicleCount] = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
        vehicleCount++;

        System.out.println("Vehicle added successfully.");

    }


    //Now, displaying a vehicle's details

    public static void displayVehicle(Vehicle vehicle) {
        System.out.println("----------------------------");
        System.out.println("Vehicle ID: " + vehicle.getVehicleId());
        System.out.println("Make/Model: " + vehicle.getMakeModel());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println("Odometer: " + vehicle.getOdometerReading());
        System.out.println("Price: $" + vehicle.getPrice());
    }
}














