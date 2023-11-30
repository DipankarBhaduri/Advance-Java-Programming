package coreJava.functionalInterfaceAndLambda;

import coreJava.functionalInterfaceAndLambda.utils.Vehicle;

public class LambdaExpression {
    public static void main(String[] args) {

        // Functional Interface with lambda expression
        Vehicle bike = (int exShowRoomPrice) -> System.out.println("The On road price of this vehicle is : "+exShowRoomPrice*1.5);
        bike.onRoadPrice(100);
    }
}

/* TYPES OF FUNCTIONAL INTERFACE
1. Consumer Functional Interface : It has single input parameter and it returns a result;
2. Supplier Functional INterface : It has no input parameter and it produce a result;
3. Functional Interface : It has single or more input parameter and it returns a result;
4. Predicate Interface : It has agruments and its return a boolean value;
*/