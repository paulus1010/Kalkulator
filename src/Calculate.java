public class Calculate {
    public static void main(String[] args) {
        Calculator paraLiczb = new Calculator(6.7, 5.2);

        System.out.println("Program oblicza sumę i różnicę dwóch liczb rzeczywistych a i b.");
        paraLiczb.sum();
        paraLiczb.substract();
        System.out.println("Koniec obliczeń.");
    }
}
