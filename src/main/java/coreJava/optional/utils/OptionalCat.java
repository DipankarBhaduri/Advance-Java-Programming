package coreJava.optional.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OptionalCat {
    String name;
    int age;
    public OptionalCat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
