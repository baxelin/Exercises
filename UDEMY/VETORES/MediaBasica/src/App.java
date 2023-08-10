import java.util.Locale;
import java.util.Scanner;

import Entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o n° de Produtos: ");
        int n = sc.nextInt();
        Produto[] vetor = new Produto[n]; 
        
        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Insira o nome do Produto: ");
            String nome = sc.nextLine();
            System.out.print("Insira o nome do Preço: ");
            double preco = sc.nextDouble();
            vetor [i] = new Produto(nome, preco);
        }

        double soma = 0;
        for (int i = 0; i < n; i++){
            soma += vetor[i].getPreco();
        }

        double media = soma / n;

        System.out.printf("Preço médio: %.2f%n", media);

        sc.close();
    }
}
