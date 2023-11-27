package coreJava.generics.utils;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericsClassUtils <T>{
    T item;
    public GenericsClassUtils(T item) {
        this.item = item;
    }
}
