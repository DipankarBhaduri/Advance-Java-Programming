package com.coreJava.functionalInterfaceAndLambda;

import com.coreJava.functionalInterfaceAndLambda.utils.Vehicle;

public class ExtendingInterface implements Vehicle {
    @Override
    public void onRoadPrice(int exShowRoomPrice) {
        System.out.println("The On road price of this vehicle is : "+exShowRoomPrice*1.5);
    }

    public static void main(String[] args) {
        Vehicle.mileageOfVehicle(40);
        ExtendingInterface extendingInterface = new ExtendingInterface();
        extendingInterface.onRoadPrice(1000);
        extendingInterface.totolWheel(6);
    }
}
