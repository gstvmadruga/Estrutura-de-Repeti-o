import ContagemRegressiva;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número positivo para iniciar a contagem regressiva: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            do {
                System.out.println(numero);  // Exibe o número atual da contagem
                numero--;  // Decrementa o número
            } while (numero >= 0);  // Continua enquanto o número for maior ou igual a 0
        }
        scanner.close();
    }
}
