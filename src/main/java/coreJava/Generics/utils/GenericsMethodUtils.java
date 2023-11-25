package coreJava.Generics.utils;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericsMethodUtils<T> {
    T item;
    public GenericsMethodUtils(T item) {
        this.item = item;
    }
}
