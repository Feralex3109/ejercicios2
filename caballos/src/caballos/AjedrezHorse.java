package caballos;
import java.util.Scanner;

public class AjedrezHorse {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Las filas empiezan de izquierda a derecha, de 1 a 8");
            System.out.println("Las columnas empiezan de abajo a arriba, de 1 a 8");

            System.out.println("Ingrese la fila del caballo: ");
            int fila_cab = teclado.nextInt();
            if (fila_cab < 1 || fila_cab > 8) {
                System.out.println("Número inválido para la fila");
                return;
            }

            System.out.println("Ingrese la columna del caballo: ");
            int col_cab = teclado.nextInt();
            if (col_cab < 1 || col_cab > 8) {
                System.out.println("Número inválido para la columna");
                return;
            }

            System.out.println("Ingrese la fila del rey: ");
            int fila_rey = teclado.nextInt();
            if (fila_rey < 1 || fila_rey > 8) {
                System.out.println("Número inválido para la fila");
                return;
            }

            System.out.println("Ingrese la columna del rey: ");
            int col_rey = teclado.nextInt();
            if (col_rey < 1 || col_rey > 8) {
                System.out.println("Número inválido para la columna");
                return;
            }

            System.out.println(verificadorDeAtaque(fila_cab, col_cab, fila_rey, col_rey));
        }
    }

    public static String verificadorDeAtaque(int fila_cab, int col_cab, int fila_rey, int col_rey) {
        if ((fila_rey == fila_cab - 2 && (col_rey == col_cab + 1 || col_rey == col_cab - 1)) ||
            (fila_rey == fila_cab + 2 && (col_rey == col_cab + 1 || col_rey == col_cab - 1)) ||
            (fila_rey == fila_cab - 1 && (col_rey == col_cab + 2 || col_rey == col_cab - 2)) ||
            (fila_rey == fila_cab + 1 && (col_rey == col_cab + 2 || col_rey == col_cab - 2))) {
            return "El caballo lo ataca";
        } else {
            return "El caballo NO lo ataca";
        }
    }
}

