import Soma;

public class SomaNumerosNaturais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número N: ");
        int N = scanner.nextInt();
        
        int soma = 0;
        
        for (int i = 1; i <= N; i++) {
            soma += i; // Acumulador que soma os números
        }
        
        System.out.println("A soma dos primeiros " + N + " números naturais é: " + soma);
        
        scanner.close();
    }
}
