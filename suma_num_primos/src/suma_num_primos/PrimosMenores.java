package suma_num_primos;
import java.util.Scanner;

public class PrimosMenores {
    public static void main(String[] args) {

        System.out.println("Digite el numero de entrada para ver los numeros primos menores o iguales: ");
        
        Scanner entrada = new Scanner(System.in);
        
        int numero = entrada.nextInt();
        
        for (int i = 2; i <= numero; i++) {
            boolean esPrimo = true;
            int creciente = 2;

            while (esPrimo && creciente < i) {
                if (i % creciente == 0) {
                    esPrimo = false;
                } else {
                    creciente++;
                }
            }

            if (esPrimo) {
                System.out.println(i + " es primo.");
            }
        }

        entrada.close();
    }
}
