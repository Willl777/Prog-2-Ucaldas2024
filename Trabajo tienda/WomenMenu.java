import java.util.Scanner;

public class WomenMenu {

    Scanner input = new Scanner(System.in);

    public String showMenu() {
        return "            1. Calzado\n            2. Productos destacados\n           3.Ropa\n          4. Accesorios\n           5. Deportes\n";
    }

    public void option_menu() {
        System.out.println(showMenu());
        int option = 0;
        int option_submenu = 0;
        option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Calzado\n       1. Running\n        2. Classic\n        Selecciona una opción:");
                option_submenu = input.nextInt();
                if (option_submenu == 1) {
                    Running instance_running = new Running();
                    instance_running.addRunningShoesWoman();
                    System.out.println("Filtro por talla 38");
                    System.out.println(instance_running.sizeInformationShoes());
                    System.out.println("Filtro por precio mayor a 150");
                    System.out.println(instance_running.priceInformationShoes());
                    System.out.println("Filtro por envio");
                    System.out.println(instance_running.sendInformationShoes());
                    System.out.println("Sin filtro");
                    System.out.println(instance_running.showInformationShoes());
                } else if (option_submenu == 2) {
                    Clasic instance_classic = new Clasic();
                    instance_classic.addClassicShoes();
                    System.out.println("Filto por más de 5 colores");
                    System.out.println(instance_classic.coloursInformationShoes());
                    System.out.println("Filtro por precio mayor a 150");
                    System.out.println(instance_classic.priceInformationShoes());
                    System.out.println("Sin filtro");
                    System.out.println(instance_classic.showInformationShoes());
                } else {
                    System.out.println("Opción no válida");
                }
                break;
            case 2:
                System.out.println("Productos destacados");
            case 3:
                System.out.println("Ropa");
            case 4:
                System.out.println("Accesorios");
            case 5:
                System.out.println("Deportes");
        }
    }
}
