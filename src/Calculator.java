public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

//    public double getA() {
//        return a;
//    }
//
//    public void setA(double a) {
//        this.a = a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public void setB(double b) {
//        this.b = b;
//    }

    public void sum() {
        double sum = a + b;
        System.out.println("Suma liczb a = " + a + " i  b = " + b + " wynosi " + sum);
    }

    public void substract() {
        double substract = a - b;
        System.out.println("Różnica liczb a = " + a + " i b = " + b + " wynosi " + substract);
    }
}
