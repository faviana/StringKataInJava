package com.ironyard.homework;

import static com.ironyard.homework.Kata.*;

/**
 * Created by favianalopez on 10/17/16.
 */
public class Main {

    public static void main (String[] args){

        explode("example");
        explode("cat");
        explode("");
        explode("c");

        notString("candy");
        notString("x");
        notString("not bad");

        missingChar1("kitten");
        missingChar0("kitten");
        missingChar4("kitten");

        frontBack("code");
        frontBack("a");
        frontBack("ab");

        front3("Java");
        front3("Chocolate");
        front3("abc");

        backAround("cat");
        backAround("Hello");
        backAround("a");

        front22("kitten");
        front22("Ha");
        front22("abc");

        delDel("adelbc");
        delDel("adelHello");
        delDel("adedbc");

        startOz("ozymandias");
        startOz("bzoo");
        startOz("oxx");
        startOz("kitten");

        endUp("Hello");
        endUp("hi there");
        endUp("hi");


        }
}
