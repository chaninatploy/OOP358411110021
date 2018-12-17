package lab4;

import sun.print.SunMinMaxPage;

import java.util.Scanner;

public class Quiz2_Operators {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 : ");
        a = sc.nextInt();
        System.out.print("Enter 2 : ");
        b = sc.nextInt();

        System.out.println("Sum ="+sum(a,b));
        System.out.println("Sub ="+subt(a,b));
        System.out.println("Mul ="+mult(a,b));
        System.out.println("Div="+divt(a,b));


    }//main

    private static int divt(int a, int b) {
        return a/b;
    }

    private static int mult(int a, int b) {
        return a*b;
    }

    private static int subt(int a, int b) {
        return a-b;
    }

    private static int sum (int a, int b) {
        return a+b;
    }





}//class
