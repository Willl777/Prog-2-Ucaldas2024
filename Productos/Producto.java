public class Producto {
    private String name;
    private float price=0;
    private float cantidad=0;

    public Producto (String name_Param, float price_Param, float cantidad_Param){
        this.name=name_Param;
        this.price=price_Param;
        this.cantidad=cantidad_Param;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
}
