package Desafio100Dias;

import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular a raiz quadrada: ");

        double num = scanner.nextDouble();

        if (num >= 0) {
            double raizQuadrada = Math.sqrt(num);
            if (raizQuadrada == Math.floor(raizQuadrada)) {
                System.out.printf("A raiz quadrada de %.0f é %.0f%n", num, raizQuadrada);   
            } else {
                System.out.println("O número não possui raiz quadrada exata.");
            }
        } else {
            System.out.println("Não e possível calcular raiz quadrada de um número negativo.");
        }

        scanner.close(); 
    }
}
