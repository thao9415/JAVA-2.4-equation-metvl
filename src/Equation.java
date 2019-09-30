public class Equation {

    private int a, b, c;

    //constructor
    public Equation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    //getter setter
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }


    public double getDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
    }

    public void display() {
        if (getDelta() > 0) {
            System.out.println("Phương trình có 2 nghiệm là x1 = " + getRoot1() + " x2= " + getRoot2());
        } else if (getDelta() == 0) {
            System.out.println("Phương trình có 1 nghiệm là x = " + getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }


}
