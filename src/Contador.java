import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            //Lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm < parametroDois) {
            int contagem = parametroDois - parametroUm;
            System.out.println("Imprimindo...");
            for (int indice = 1; indice <= contagem; indice++) {
                System.out.println("Imprimindo o número " + indice);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
