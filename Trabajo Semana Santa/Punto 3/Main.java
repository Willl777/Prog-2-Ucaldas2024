public class Main {
    public static void main(String[] args) {
        RegistroInventario registro = new RegistroInventario();

        Categoria categoria1 = new Categoria("Electrónicos", "Productos electrónicos");
        Categoria categoria2 = new Categoria("Ropa", "Ropa y accesorios");
        registro.registrarCategoria(categoria1);
        registro.registrarCategoria(categoria2);

        Proveedor proveedor1 = new Proveedor("Electronics Inc.", "123456789", "Calle Principal #123");
        Proveedor proveedor2 = new Proveedor("Fashion World", "987654321", "Avenida Central #456");
        registro.registrarProveedor(proveedor1);
        registro.registrarProveedor(proveedor2);

        Producto producto1 = new Producto("Smartphone", categoria1, 500.00, 10);
        Producto producto2 = new Producto("Camiseta", categoria2, 20.00, 20);
        registro.registrarProducto(producto1);
        registro.registrarProducto(producto2);
    }
}
