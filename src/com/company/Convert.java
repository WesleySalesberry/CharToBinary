package com.company;
import java.math.BigDecimal;
import java.math.BigInteger;
public class Convert {

    public static double ConvertToDecimal(String a) {
        double sum;
        if (a.contains(".")) {
            String[] b = a.split("\\.");

            int sum1 = Integer.parseInt(b[0], 2);

            double sum2 = latterPart(b[1]);

            sum = sum1 + sum2;

        } else {
            sum = Integer.parseInt(a, 2);
        }
        return sum;
    }

    public static double latterPart(String number) {
        double sum = 0;
        int length = number.length();
        for (int i = 0; i < length; i++) {
            int e = -i - 1;
            char mult = number.charAt(i);
            int num = Integer.parseInt(String.valueOf(mult));
            double num1 = num * Math.pow(2, e);
            sum = sum + num1;
            ;
        }
        return sum;
    }

    public String toFractionalBinary(double n) {
        int nu = 10; // constant?
        BigDecimal bd = new BigDecimal(n);
        BigDecimal mult = new BigDecimal(2).pow(nu);
        bd = bd.multiply(mult);
        BigInteger bi = bd.toBigInteger();
        StringBuilder str = new StringBuilder(bi.toString(2));
        while (str.length() < n + 1) {
            str.insert(0, "0");
        }
        return str.toString();
    }

    public String toIntegerBinary(int n) {
        if (n == 0) {
            return "0";
        }
        String binary = "";
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }
        return binary;
    }

    public void StringtoBinary(String s) {
        byte[] bytes = s.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        System.out.println("'" + s + "' to binary: " + binary);
    }
}