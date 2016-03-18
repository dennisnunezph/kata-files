package com.core;

/**
 * Created by dennis on 3/8/16.
 */
public class example
{
    //int i[] = {0};

    /**
    public static void main(String args[])
    {
        int i[] = {1};
        change_i(i);
        System.out.println(i[0]);
    }

    */
    public static void main(String args[])

    {
        int fyeah[] = {2, 3, 4};
        smth(fyeah);
        System.out.println("x" + fyeah[0]);


        int i[] = {1};
        change_i(i);
        System.out.println(i[0]);
    }

    static void smth(int[] fyeah)
    {
        fyeah[0] = 22;
    }

    public static void change_i(int i[])
    {
        int j[] = {2};
        //i[0] = 23;
        //i = j;
        i[0] = 33;
    }
}
