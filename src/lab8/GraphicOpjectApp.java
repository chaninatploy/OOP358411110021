package lab8;

public class GraphicOpjectApp {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle(10.0, 5.0);
        rec.setColor("Red");
        rec.draw();
        System.out.println(rec.findArea());
        System.out.println(rec.getColor());
        System.out.println(rec.getHigh());
        System.out.println(rec.getWidth());

        Circle cir =new Circle(20.0);
        cir.setColor("Blue");
        System.out.println("The area of my circle is : "+cir.findArea());
        System.out.println(rec.getColor());



    }//main
}//class
