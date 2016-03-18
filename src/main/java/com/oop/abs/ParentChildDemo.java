package com.oop.abs;

/**
 * Created by dennis on 2/11/16.
 */
public class ParentChildDemo {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.greet();

        Parent child = new Child();
        child.greet();
    }
}
