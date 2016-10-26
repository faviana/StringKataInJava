package com.ironyard.homework;


/**
 * Created by favianalopez on 10/17/16.
 */
public class Kata extends Main {


    public static void explode(String x) {

        System.out.print("explode(\"" + x + "\") -> \"");

        char[] cArr = x.toCharArray();

        for (int i = 0; i < cArr.length; i++) {
            System.out.print(cArr[i]);
            if (cArr.length != i + 1)
                System.out.print(" ");
        }

        System.out.println("\"");
    }


    public static void notString(String x) {

        System.out.print("notString(\"" + x + "\") -> \"");

        char[] cArr = x.toCharArray();

        if (x.startsWith("not")) {
            System.out.print(x);

        } else {
            System.out.print("not " + x);
        }

        System.out.println("\"");
    }

    public static void missingChar1(String x) {

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
        System.out.println("\"");
    }

    public static void frontBack(String x) {

        System.out.printf("frontBack(\"" + x + "\") -> \"");

        char[] cArr;

        StringBuilder sb = new StringBuilder();
        sb.append(x);

        // get first chars
        String firstChar = sb.substring(0, 1);
        String lastChar = sb.substring(x.length() - 1);

        sb.replace(0, 1, lastChar);
        sb.replace(x.length() - 1, x.length(), firstChar);

        cArr = sb.toString().toCharArray();

        System.out.print(cArr);
        System.out.println("\"");
    }

    public static void front3(String x) {

        System.out.print("front3(\"" + x + "\")->\"");

        char[] cArr = new char[0];
        StringBuilder sb = new StringBuilder();
        sb.append(x);

        String firstThreeChar = sb.substring(0, 3);

        sb.replace(0, 3, firstThreeChar);

        cArr = sb.toString().toCharArray();


        for (int i = 0; i < 3; i++) {
            for (int d = 0; d < 3; d++) {

                System.out.print(cArr[d]);
            }

        }

        System.out.println("\"");

    }

    public static void backAround(String x) {

        System.out.print("backAround(\"" + x + "\")->\"");

        String string = x.substring(x.length() - 1);
        System.out.print(string + x + string);
        System.out.println("\"");

    }

    public static void front22(String x) {

        System.out.print("front22(\"" + x + "\")->\"");

        if (x.length() < 2) {
            System.out.print(x + x + x);
        } else {
            String string = x.substring(0, 2);
            System.out.print(string + x + string);
        }

        System.out.println("\"");

    }

    public static void delDel(String x) {

        String delete = ("delDel(\"" + x + "\")" + "->\"");
        String del = x.substring(1, 4);
        if (del.startsWith("del") || del.startsWith("del")) {
            String firstChar = x.substring(0, 1);
            String delChar = x.substring(4, x.length());

            System.out.println(delete + firstChar + delChar + "\"");
        } else {
            System.out.println(delete + x + "\"");
        }
    }

    public static void startOz(String x) {

        System.out.print("startOz(\"" + x + "\")->\"");

        String string = "";
        if (x.length() >= 1 && x.charAt(0) == 'o') {
            string = string + x.charAt(0);
        }

        if (x.length() >= 2 && x.charAt(1) == 'z') {
            string = string + x.charAt(1);
        }

        if (string.isEmpty()) {
            String ki = x.substring(0, 2);
            System.out.print(ki);
        }

        System.out.print(string);
        System.out.println("\"");

    }

    public static void endUp(String x) {

        System.out.print("endUp(\"" + x + "\")->\"");

        int lastThreeWords = x.length() - 3;
        int length = x.length();

        if (x.length() < 3) {
            System.out.print(x.toUpperCase());
        } else {
            String upperCase = x.substring(lastThreeWords, length).toUpperCase();
            System.out.print(x.substring(0, lastThreeWords) + upperCase);
        }
        System.out.println("\"");

    }

}






