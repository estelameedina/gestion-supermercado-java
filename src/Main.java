package examen_programacion;

public class Main {
    
    public static void main (String[] args) {
        
        // Creamos una instancia del supermercado
        Supermercado miSupermercado = new Supermercado();

        // Creamos tres productos de ejemplo
        try{
        miSupermercado.añadirProducto (new Producto ("banana", "fruta", -2, 30));
        miSupermercado.añadirProducto (new Producto ("calabaza", "verdura", 5, 20));
        miSupermercado.añadirProducto (new Producto ("pera", "fruta", 2, 40));
        } catch (PrecioNegativoException e){
            System.out.println("Error:  " + e.getMessage());
        }
        
        //Imprimimos la lista de productos
        miSupermercado.ListaProductos();

        System.out.println("*****************");
        System.out.println("****VENDIENDO PRODUCTO****");

        try {
            miSupermercado.vendeProducto("calabaza");
        } catch (StockInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("*****************");
        System.out.println("****VENDIENDO EL MISMO PRODUCTO****");

        try {
            miSupermercado.vendeProducto("calabaza");
        } catch (StockInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }    
}


