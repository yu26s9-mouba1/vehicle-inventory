package com.pluralsight;
import java.util.Scanner;
public class vehicleInventoryApp {

    //Creating an array of 20 vehicle
    static Vehicle[] vehicles = new vehicle[20];

    //Declaring the amount of preload of 6 vehicles
    static int vehicleCount = 6;
    static  Scanner scanner = new Scanner(System.in);


// Creating a method of preloadVehicles and using a while loop and swicth  
    public static void main(String[] args) {

        preloadVehicles();

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("3 - Search by price range");
            System.out.println("4 - Search by color");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.print("Enter your command: ");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    searchByMakeModel();
                    break;
                case 3:
                    searchByPriceRange();
                    break;
                case 4:
                    searchByColor();
                    break;
                case 5:
                    addVehicle();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }





}
