package lab3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String name ,b , c,d;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("คุณชื่อ-สกุล อะไร ? : ");
        name = sc.nextLine();
        System.out.println("สวัสดีคุณ "+name);

        System.out.println("คุณอายุเท่าไหร่ ? : ");
        int a =sc1.nextInt();
        System.out.println("อายุ"+a+"ปี");

        System.out.println("เพศอะไร ?:");
        b = sc.nextLine();
        System.out.println("เพศ "+b);

        System.out.println("ที่อยู่ของคุณ ?:");
        c=sc.nextLine();
        System.out.println("ที่อยู่ : " +c);

        System.out.println("เบอร์โทรศัพท์ ? : ");
        d =sc.nextLine();
        System.out.println("เบอร์ "+d);




    }//main


}//class
