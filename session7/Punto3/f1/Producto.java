package Punto3.f1;

class Producto {
    private String nombre;
    private Categoria categoria;
    private double precio;
    private int stock;

    public Producto(String nombre, Categoria categoria, double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public String toString() {
        return "Producto: " + nombre + ", Categoría: " + categoria.getNombre() + ", Precio: $" + precio + ", Stock: " + stock;
    }
}