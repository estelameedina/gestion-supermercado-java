package examen_programacion;

public class Producto {
    
    //Atributo que guarda el nombre del producto
    private String nombre;

    //Atributo que guarda la categoría del producto
    private String categoria;

    //Atributo que guarda el precio del producto
    private int precio;
    
    //Atributo que guarda el stock del producto
    private int stock;

    //Creamos el constructor que se ejecutará al crear un nuevo producto
    public Producto (String nombre, String categoria, int precio, int stock){
    this.nombre = nombre;
    this.categoria = categoria;
    this.precio = precio;
    this.stock= stock;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getCategoria(){
        return categoria;
    }
    public int getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }

    // Método para vender un producto
    public void venderProducto(int cantidad) {
        if (cantidad > 0 && stock >= cantidad) {
            stock -= cantidad;
            System.out.println("Venta de " + cantidad + " unidades de " + nombre + " realizada.");
        } else {
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
    }

    // Método para reponer el stock
    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Stock de " + nombre + " reposición con " + cantidad + " unidades.");
        } else {
            System.out.println("La cantidad de reposición debe ser mayor a 0.");
        }
    }

    public void describe() {
        System.out.println("Soy un producto con nombre:  " + nombre);
    }
}
