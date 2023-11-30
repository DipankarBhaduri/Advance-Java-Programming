package coreJava.functionalInterfaceAndLambda;

import coreJava.functionalInterfaceAndLambda.utils.Consumer;

public class ConsumerClass {
    public static void main(String[] args) {
        Consumer<String> consumerString = new Consumer<String>() {
            @Override
            public void getValue(String string) {
                System.out.println("String data : "+string);
            }
        };

        Consumer<Integer> consumerInteger = new Consumer<Integer>() {
            @Override
            public void getValue(Integer integer) {
                System.out.println("Integer Data : "+integer);
            }
        };

        consumerInteger.getValue(26);
        consumerString.getValue("Dipankar");
    }
}
