import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de números para soma e média: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        System.out.print("Insira os números para a conta: ");
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        System.out.println(soma);
        System.out.println(media);
        
        sc.close();
    }
}
