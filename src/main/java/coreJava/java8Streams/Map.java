package coreJava.java8Streams;

import coreJava.java8Streams.utils.IPL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        IPL bangalore = new IPL(1, "Bangalore");
        IPL gujrat = new IPL(2, "Gujrat");
        IPL delhi = new IPL(3, "Delhi");
        IPL kolkata = new IPL(4, "Kolkata");

        List<IPL> iplList = new ArrayList<>(Arrays.asList(bangalore, gujrat, delhi, kolkata));
        List<String> teamNames = getList(iplList);
        System.out.println(teamNames.toString());
    }

    private static List<String> getList(List<IPL> iplList) {
        return iplList.stream().map(IPL::getName).toList();
    }
}

