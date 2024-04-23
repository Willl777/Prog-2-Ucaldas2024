import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
    inventario ins = new inventario();
    ArrayList <Producto> produc = ins.obProductos();

    for (Producto produ: produc ){
        System.err.println(" Nombre "+ produ.getName()+" Precio: "+produ.getPrice()+" Cantidad: "+ produ.getCantidad());

    }
}
    
}