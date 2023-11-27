package coreJava.generics.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericsBoundedUtils <T extends Number, T2> {
    T item;
    T2 item2;

    public GenericsBoundedUtils (T item, T2 item2) {
        this.item = item;
        this.item2 = item2;
    }
}
