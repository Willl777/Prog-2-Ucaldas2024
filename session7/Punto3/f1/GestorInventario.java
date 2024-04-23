package Punto3.f1;
    import java.util.List;
    class GestorInventario {
        public Producto obtenerProductoMenorStock(List<Producto> productos) {
            if (productos.isEmpty()) {
                return null;
            }
            
            Producto productoMenorStock = productos.get(0);
            
            for (Producto producto : productos) {
                if (producto.getStock() < productoMenorStock.getStock()) {
                    productoMenorStock = producto;
                }
            }
            
            return productoMenorStock;
        }
    }

        

    

    
