package Exercicio22;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        int i = 0;
        for (; i < 3; i++) {
            
            System.out.println("Digite o nome do produto");
            nomeProduto = leitor.next();
            
            System.out.println("Digite o preco de custo do produto");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o preco de venda do produto");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if(precoCusto == precoVenda){
                System.out.println("houve empate entre o preco de "
                        + "custo e o preco de venda");
            } else {
                if(precoCusto > precoVenda){
                    System.out.println("Houve um prejuizo");
                } else {
                    System.out.println("Houve lucro");
                }
            }
            
            System.out.println(nomeProduto + ", preco de custo = " 
                    + precoCusto + ", preco de venda = " + precoVenda);
            
        }
        
        System.out.println("A media do preco de custo e de: " 
                + (totalCusto / i));
        System.out.println("A media do preco de venda e de: " 
                + (totalVenda / i));
        
    }
}
