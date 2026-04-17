package com.pluralsight;

public class Vehicle {
    //Creating a class that contains the vehicle identifications, making sure they are private
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    // Assigning all the properties of the vehicle
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

//    public long getVehicleId() {
//        return vehicleId;
//    }


}



