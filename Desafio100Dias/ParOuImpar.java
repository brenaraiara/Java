package Desafio100Dias;

    import java.util.Scanner;

    public class ParOuImpar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite um numero: ");
            int num = scanner.nextInt();
    
            if (num % 2 == 0) {
                System.out.println("O numero " + num + " e PAR.");
            } else {
                System.out.println("O numero " + num + " e IMPAR.");
            }

            scanner.close();
        }
    }
