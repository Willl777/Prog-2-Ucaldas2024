//2.
import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los elementos para agregar al ArrayList (Ingrese 'fin' para terminar):");
        String input = scanner.nextLine();
        while (!input.equals("fin")) {
            lista.add(input);
            input = scanner.nextLine();
        }

        System.out.println("ArrayList actual: " + lista);

        System.out.println("Ingrese el índice del elemento a eliminar:");
        int indice = scanner.nextInt();
        
        if (indice >= 0 && indice < lista.size()) {
            String eliminado = lista.remove(indice);
            System.out.println("Se ha eliminado el elemento '" + eliminado + "' en el índice " + indice);
        } else {
            System.out.println("Índice fuera de rango. No se ha eliminado ningún elemento.");
        }

        System.out.println("ArrayList actualizado: " + lista);

    }
}
