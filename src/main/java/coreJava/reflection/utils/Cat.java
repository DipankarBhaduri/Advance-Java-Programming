package coreJava.reflection.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Cat {
    private String name;
    private int age;

    public void heyPublic() {
        System.out.println("I AM PUBLIC METHOD");
    }

    private void heyPrivate() {
        System.out.println("I AM PRIVATE METHOD");
    }

    public static void heyPublicStatic() {
        System.out.println("I AM PUBLIC STATIC METHOD");
    }

    private static void heyPrivateStatic() {
        System.out.println("I AM PRIVATE STATIC METHOD");
    }
}
