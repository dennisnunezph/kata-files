package com.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dennis on 2/19/16.
 */
public class ListDemo {

    public static void main(String[] args) {

        //simpleLoop();
        simpleFilter();
    }

    private static void simpleLoop() {
        List<String> list = populateList();

        list.stream().forEach(s -> System.out.println(s));
    }


    private static void simpleFilter() {
        List<String> list = populateList();

        list.stream().filter(s -> s.startsWith("a"))
                .forEach(s -> System.out.println(s));
    }

    private static List<String> populateList() {
        List<String> list = new ArrayList<>();

        list.add("Doe");
        list.add("a");
        list.add("deer");
        list.add("a");
        return list;
    }


}
