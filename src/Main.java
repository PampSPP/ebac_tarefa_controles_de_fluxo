import java.util.Scanner;

/**
 * @author PampSPP
 */

public class Main {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite a primeira nota (0-10): ");
        float grade1 = s1.nextFloat();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Digite a segunda nota (0-10): ");
        float grade2 = s2.nextFloat();

        Scanner s3 = new Scanner(System.in);
        System.out.println("Digite a terceira nota (0-10): ");
        float grade3 = s3.nextFloat();

        Scanner s4 = new Scanner(System.in);
        System.out.println("Digite a quarta nota (0-10): ");
        float grade4 = s4.nextFloat();

        float result = (grade1 + grade2 + grade3 + grade4) / 4;

        if (result >= 7) {
            System.out.println("Você foi aprovado e sua nota é " + result + " =D");
        } else if (result >= 5) {
            System.out.println("Você está de recuperação e sua nota é " + result + " =/");
        } else {
            System.out.println("Você está reprovado e sua nota é " + result + " =(");
        }

    }
}