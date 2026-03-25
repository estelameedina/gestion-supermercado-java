package examen_programacion;

import java.util.ArrayList;

public class Supermercado {
    public ArrayList<Producto> listaProductos;

    public Supermercado() {
        listaProductos = new ArrayList<>();
    }

    //Añade un producto al supermercado

    public void añadirProducto(Producto producto) throws PrecioNegativoException {
    if (producto.getPrecio() > 0) { // Esto hará que no se pueda añadir un producto con precio negativo
        this.listaProductos.add(producto);
    } else {
        throw new PrecioNegativoException("El precio no es válido");
        }
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    //Muestra una lista de los productos
    public void ListaProductos() {
        for(int i=0; i< this.listaProductos.size (); i++) {
            Producto miProducto = this.listaProductos.get(i);
            miProducto.describe();
            }
        }
    
    //Se vende un producto. Si no queda stock se lanza una excepción
    public void vendeProducto(String nombre) throws StockInsuficienteException{
    boolean existe = false;
    for (int i = 0; i < listaProductos.size(); i++) {
        if (listaProductos.get(i).getNombre() == nombre) {
            System.out.println("Producto con nombre:  " + nombre + " Se ha vendido correctamente");
            listaProductos.remove(i);
            existe = true;
            break;
        }
    }
    if (!existe) {
        throw new StockInsuficienteException ("Producto no Disponible");
        }
    }
}
