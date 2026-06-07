package com.tyrov.roman;

public class Main {
public static void main(String[] args) {
    int a = 7;
    int b = 9;
    double c = 5.0;
    double d = 8.0;
    int maxInteger = Integer.MAX_VALUE;

    System.out.println(a + b);
    System.out.println(b / a);
    System.out.println(a * b);

    System.out.println(c * b);
    System.out.println(d / a);

    if (a > b) {
        System.out.println(a);
    } else {
        System.out.println(b);
    }
    if (c <= d) {
        System.out.println(c);
    } else {
        System.out.println(d);
    }

    System.out.println(maxInteger + 1);
    }
}

