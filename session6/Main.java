import java.util.Scanner;

public class Main{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int menu_option = 0;

        System.out.println("1. Mujer");
        System.out.println("2. Hombre");
        System.out.println("3. Salir");
        menu_option = input.nextInt();
        switch (menu_option) {
            case 1:
                WomanMenu instance_woman = new WomanMenu();
                instance_woman.option_menu();
                break;
            case 2:
                WomanMenu instance_man = new WomanMenu();
                instance_man.option_menu();
                break;
            case 3:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}