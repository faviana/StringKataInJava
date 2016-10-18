package com.ironyard.homework;


/**
 * Created by favianalopez on 10/17/16.
 */
public class Kata extends Main {


    public static void explode(String x) {

        System.out.println("//EXPLODE\\\\");

        System.out.print("explode(\"" + x + "\") -> \"");

        char[] cArr = x.toCharArray();

        for (int i = 0; i < cArr.length; i++) {
            System.out.print(cArr[i]);
            if (cArr.length != i + 1)
                System.out.print(" ");
        }

        System.out.println("\"");
    }

    public static void cat(String x) {

        System.out.print("explode(\"" + x + "\") -> \"");

        char[] cArr = x.toCharArray();

        for (int i = 0; i < cArr.length; i++) {
            System.out.print(cArr[i]);
            if (cArr.length != i + 1)
                System.out.print(" ");
        }

        System.out.println("\"");
    }

    public static void noString(String x) {

        System.out.print("explode(\"" + x + "\") -> \"");

        char[] cArr = x.toCharArray();

        for (int i = 0; i < cArr.length; i++) {
            if (cArr.length != i + 1)
                System.out.print(" ");
        }

        System.out.println("\"");
    }

    public static void c(String x) {

        System.out.print("explode(\"" + x + "\") -> \"");

        char[] cArr = x.toCharArray();

        for (int i = 0; i < cArr.length; i++) {
            System.out.print(cArr[i]);

            if (cArr.length != i + 1)
                System.out.print(" ");
        }

        System.out.println("\"\n");
    }

    public static void notCandy(String x) {

        System.out.println("//NOT STRING\\\\");

        System.out.print("notString(\"" + x + "\") -> \"");

        char[] cArr = x.toCharArray();

        if (x.startsWith("not")) {
            System.out.print(x);

        } else {
            System.out.print("not " + x);
        }

        System.out.println("\"");
    }

    public static void notX(String x) {

        System.out.print("notString(\"" + x + "\") -> \"");

        char[] cArr = x.toCharArray();

        if (x.startsWith("not")) {
            System.out.print(x);
        } else {
            System.out.print("not " + x);
        }

        System.out.println("\"");
    }

    public static void notBad(String x) {

        System.out.print("notString(\"" + x + "\") -> \"");

        char[] cArr = x.toCharArray();

        if (x.startsWith("not")) {
            System.out.print(x);
        } else {
            System.out.print("not " + x);
        }

        System.out.println("\"\n");
    }


    public static void missingChar1(String x) {

        System.out.println("//MISSING CHARACTERS\\\\");

        System.out.print("missingChar(\"" + x + "\") -> \"");

        char[] cArr;

        /* String Builder: Appends the string representation
        *of the char array argument to this sequence.
         */
        StringBuilder sb = new StringBuilder();

        /* Append: add (something) as an attachment or
        *supplement at the end of the string
        *
        *
        * sb.reverse...example.
        */
        sb.append(x);
        sb.deleteCharAt(1);

        /*String Builder is calling to a string
        *then we are calling a method on the
        * string .toCharArray
        * which turns string into a char[]
         */
        cArr = sb.toString().toCharArray();
        System.out.print(cArr);
        System.out.println("\"");
    }

    public static void missingChar0(String x) {

        System.out.print("missingChar(\"" + x + "\") -> \"");

        char[] cArr;

        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.deleteCharAt(0);

        cArr = sb.toString().toCharArray();

        System.out.print(cArr);
        System.out.println("\"");
    }


    public static void missingChar4(String x) {

        System.out.print("missingChar(\"" + x + "\") -> \"");

        char[] cArr;

        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.deleteCharAt(4);

        cArr = sb.toString().toCharArray();

        System.out.print(cArr);
        System.out.println("\"\n");
    }

    public static void frontBack1(String x) {

        System.out.println("//FRONT BACK\\\\");

        System.out.print("missingChar(\"" + x + "\") -> \"");

    }

    public static void frontBack2(String x) {

        System.out.print("missingChar(\"" + x + "\") -> \"");

    }

    public static void frontBack3(String x) {

        System.out.print("missingChar(\"" + x + "\") -> \"");

    }


}
