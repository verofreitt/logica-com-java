package ExercicioEstruturaRepetição;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            
            System.out.println("Digite um numero");
            int numero = leitorScanner.nextInt();

            if (numero == 0) {
                System.out.println("O numero e zero");
            } else {
                if (numero > 0) {
                    System.out.println("O numero e maior que zero");
                } else {
                    System.out.println("O numero e menor que zero");
                }
            } 
            
            System.out.println("Deseja continuar? S - Sim / N - Não");
            
            desejaContinuar = leitorScanner.next().charAt(0);

        }

    }
}
