package coreJava.functionalInterfaceAndLambda;

import coreJava.functionalInterfaceAndLambda.utils.Vehicle;

public class AnonymousClass {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle() {
            @Override
            public void onRoadPrice(int exShowRoomPrice) {
                System.out.println("The On road price of this vehicle is : "+exShowRoomPrice*1.5);
            }
        };

        bike.onRoadPrice(200);

        // Default method called
        bike.totolWheel(2);

        // Static Method called
        Vehicle.mileageOfVehicle(35);

        // Inbuild toString method called
        bike.toString();
    }
}
