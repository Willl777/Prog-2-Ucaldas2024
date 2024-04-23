import java.util.ArrayList;

public class inventario implements Contenedor {

    public ArrayList<Producto> Produc=new ArrayList<>();

  public inventario (){
    this.Produc.add (new Producto("Guanabana", 1000, 3));
    this.Produc.add (new Producto("Mango", 2000, 6));
    this.Produc.add (new Producto("Manzana", 1500, 8));



  }

  public ArrayList < Producto> obProductos(){
    return this.Produc;
  }

}
