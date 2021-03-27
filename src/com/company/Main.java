package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        HashMap<Long, String> numbers = new LinkedHashMap<>();
        numbers.put(0L, "");
        numbers.put(1L, "I");
        numbers.put(2L, "II");
        numbers.put(3L, "III");
        numbers.put(4L, "IV");
        numbers.put(5L, "V");
        numbers.put(6L, "VI");
        numbers.put(7L, "VII");
        numbers.put(8L, "VIII");
        numbers.put(9L, "IX");
        numbers.put(10L, "X");

        numbers.put(20L, "XX");
        numbers.put(30L, "XXX");
        numbers.put(40L, "XL");
        numbers.put(50L, "L");
        numbers.put(60L, "LX");
        numbers.put(70L, "LXX");
        numbers.put(80L, "LXXX");
        numbers.put(90L, "XC");

        numbers.put(100L, "C");
        numbers.put(200L, "CC");
        numbers.put(300L, "CCC");
        numbers.put(400L, "CD");
        numbers.put(500L, "D");
        numbers.put(600L, "DC");
        numbers.put(700L, "DCC");
        numbers.put(800L, "DCCC");
        numbers.put(900L, "CM");
        numbers.put(1000L, "M");
        numbers.put(2000L, "MM");
        numbers.put(3000L, "MMM");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:  ");
        Number number = new Number(sc.nextLong());
        long n = number.getNumber();
        int counter = number.counter(n);

        switch (counter) {
            case 1: {
                System.out.println(numbers.get(number.getNumber()));
                break;
            }
            case 2: {
                System.out.println((numbers.get(number.counter2(n)) + numbers.get(number.counter1(n))));
                break;
            }
            case 3: {
                System.out.println(numbers.get(number.counter3(n))
                        + numbers.get(number.counter2(n)) + numbers.get(number.counter1(n)));
                break;
            }
            case 4: {
                System.out.println(numbers.get(number.counter4(n)) + numbers.get(number.counter3(n))
                        + numbers.get(number.counter2(n)) + numbers.get(number.counter1(n)));
                break;
            }
        }
    }
}
