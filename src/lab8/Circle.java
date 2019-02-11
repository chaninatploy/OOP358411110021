package lab8;

public class Circle extends GraphicObject {
    private double r;
    final double PI = 3.14;



    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle...");
    }

    @Override
    double findArea() {
        return this.PI*(r*r);
    }
    public Circle (double r){
        this.r=r;
    }
}//class

