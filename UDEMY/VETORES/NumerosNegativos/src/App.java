import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o n° de valores a digitar: ");
        int n = sc.nextInt(); //var n para definir tamanho do vetor
        int [] vetor = new int[n]; // criação do vetor

        System.out.print("Insira os valores: ");
        for (int i = 0; i < n; i++){ //função for para se digitar todos os n° escolhidos pela var n
            vetor[i] = sc.nextInt();
        }

        System.out.print("Numeros negativos: ");
        for (int i = 0; i < n; i++){ //função for + if para printar apenas os n° negativos
            if (vetor[i] < 0){
                System.out.print(vetor[i] + ", ");
            }
        }

        sc.close();
    }
}
/*
 * Devo inserir um numero n para mostrar quantos valores serão inseridos no vetor
 * escrever numero a numero no vetor
 * printar apenas n° negativos
 * 
 * int n = sc.nextInt(); para trazer a qtde de n° no vetor
 * vetor[] 
 * 
 */