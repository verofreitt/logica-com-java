package ComandosLeituraGravacao;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();
        String codigoREua = leitor.next();
        
        System.out.println("Texto que sera exibido no console");
        System.out.print("Texto que sera exibido no console");
    }
}
