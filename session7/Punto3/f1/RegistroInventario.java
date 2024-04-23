package Punto3.f1;

import java.util.ArrayList;

import java.util.List;
class RegistroInventario {
    private List<Producto> productos;
    private List<Categoria> categorias;
    private List<Proveedor> proveedores;
    private List<Venta> ventas;

    public RegistroInventario() {
        productos = new ArrayList<>();
        categorias = new ArrayList<>();
        proveedores = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public void registrarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto registrado correctamente.");
    }

    public void registrarCategoria(Categoria categoria) {
        categorias.add(categoria);
        System.out.println("Categoría registrada correctamente.");
    }

    public void registrarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
        System.out.println("Proveedor registrado correctamente.");
    }

    public void registrarVenta(Venta venta) {
        if (venta.getProducto().getStock() >= venta.getCantidad()) {
            venta.getProducto().setStock(venta.getProducto().getStock() - venta.getCantidad());
            ventas.add(venta);
            System.out.println("Venta registrada correctamente.");
        } else {
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
    }

    public void listarProductos() {
        System.out.println("Productos registrados:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void listarCategorias() {
        System.out.println("Categorías registradas:");
        for (Categoria categoria : categorias) {
            System.out.println(categoria);
        }
    }

    public void listarProveedores() {
        System.out.println("Proveedores registrados:");
        for (Proveedor proveedor : proveedores) {
            System.out.println(proveedor);
        }
    }

    public void listarVentas() {
        System.out.println("Ventas registradas:");
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }

    public List<Producto> buscarProductos(String filtro) {
        List<Producto> resultados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getNombre().contains(filtro) || producto.getCategoria().getNombre().contains(filtro) || String.valueOf(producto.getPrecio()).contains(filtro)) {
                resultados.add(producto);
            }
        }
        return resultados;
    }
}