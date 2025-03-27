import NumerosPrimos;

public class NumerosPrimosIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número inicial do intervalo: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o número final do intervalo: ");
        int fim = scanner.nextInt();
        
        if (inicio <= 0 || fim <= 0 || inicio >= fim) {
            System.out.println("Por favor, insira números positivos e o número inicial deve ser menor que o número final.");
        } else {
            System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");
            
            for (int num = inicio; num <= fim; num++) {
                boolean ehPrimo = true; // Variável para verificar se o número é primo
                
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) { // Se o número for divisível por i, não é primo
                        ehPrimo = false;
                        break; // Interrompe o loop interno
                    }
                }
                
                if (ehPrimo && num > 1) {
                    System.out.println(num);
                }
            }
        }
        scanner.close();
    }
}
