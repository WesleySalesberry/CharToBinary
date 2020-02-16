package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
        //String s;
        int x;
        double number;
        Convert c = new Convert();
        Scanner sc = new Scanner(System.in);
        System.out.println("What value you want to insert");
        System.out.println("Press 1 for String");
        System.out.println("Press 2 for Decimal");
        System.out.println("Press 3 for Binary");
        x = sc.nextInt();
        switch(x)
        {
            case 1 : System.out.println("Enter your String");
                Scanner sc1 = new Scanner(System.in);
                String s = sc1.nextLine();
                c.StringtoBinary(s);
                break;
            case 2: System.out.println("Enter your Decimal number");
                number = sc.nextDouble();
                int integer = (int)number;
                double decimal = number-(int)number;
                System.out.println(number+" to binary "+c.toIntegerBinary(integer)+"."+c.toFractionalBinary(decimal));
                break;
            case 3:   System.out.println("Enter your Binary number");
                Scanner sc2 = new Scanner(System.in);
                String s1 = sc2.nextLine();
                System.out.println(s1+" to decimal "+c.ConvertToDecimal(s1));
        }
    }

    }

