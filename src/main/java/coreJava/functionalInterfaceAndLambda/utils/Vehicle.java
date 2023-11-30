package coreJava.functionalInterfaceAndLambda.utils;

@FunctionalInterface
public interface Vehicle {
    void onRoadPrice(int exShowRoomPrice);

    default void totolWheel(int wheel) {
        System.out.println("The total while of this vehicle is : "+wheel);
    }

    static void mileageOfVehicle(int millage) {
        System.out.println("The mileage of this vehicle is : "+millage+" KM/L");
    }

    String toString();
}
