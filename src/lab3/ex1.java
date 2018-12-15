package lab3;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        //name
        System.out.print("What is your nickname? : ");
        name = sc.nextLine();

        System.out.println("Hello, "+ name);
        //age
        System.out.print("How old are you ? : ");
        int a = sc.nextInt();
        System.out.println("You are"+a+"years old.");

        if (a >30) System.out.println("You are older.");
        else System.out.println("You are younger.");


    }//main
}//class
