import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        int number;
        int result;
        int multiple = 0;
        boolean verified = false;

        System.out.println("Digite um número entre 1 a 10: ");
        number = scan.nextInt();
        
        System.out.println("Tabuada do " +number);
        do {
            multiple++;
            result = (number * multiple);

            if (multiple >= 1 && multiple <= 10 ) {
                System.out.println(number + " X " +multiple+ " = " +result);
            } else {
                verified = false; break;
            }

        } while (!verified);
    }
}