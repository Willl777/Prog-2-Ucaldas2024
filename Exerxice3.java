//3.
import java.util.LinkedList;
import java.util.Scanner;

public class BusquedaLinkedList {
    public static void main(String[] args) {
     
        LinkedList<String> lista = new LinkedList<>();

        lista.add("Hola");
        lista.add("Mundo");
        lista.add("en");
        lista.add("LinkedList");

       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el elemento a buscar:");
        String elemento = scanner.nextLine();

        
        if (lista.contains(elemento)) {
            System.out.println("El elemento '" + elemento + "' se encuentra en la LinkedList.");
        } else {
            System.out.println("El elemento '" + elemento + "' no se encuentra en la LinkedList.");
        }

   
    }
}
