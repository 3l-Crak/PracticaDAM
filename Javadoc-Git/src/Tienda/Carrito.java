package Tienda;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Carrito representa un carrito de compras que contiene productos.
 * Permite agregar productos, calcular el total y vaciar el carrito.
 *
 * @author Eloy y ChatGPT
 * @version 1.0
 * @since 1.0
 */
public class Carrito {

    private List<tienda.Producto> productos;
    private String propietario;

    /**
     * Constructor para crear un carrito con un propietario.
     *
     * @param propietario Nombre del propietario del carrito.
     */
    public Carrito(String propietario) {
        this.propietario = propietario;
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un producto al carrito.
     *
     * @param producto Producto que se desea agregar.
     */
    public void agregarProducto(tienda.Producto producto) {
        productos.add(producto);
    }

    /**
     * Calcula el precio total de los productos en el carrito.
     *
     * @return El precio total de todos los productos.
     */
    public double calcularTotal() {
        double total = 0;
        for (tienda.Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    /**
     * Vacía el carrito eliminando todos los productos.
     */
    public void vaciarCarrito() {
        productos.clear();
    }

    /**
     * Obtiene el número total de productos en el carrito.
     *
     * @return Número de productos.
     */
    public int obtenerCantidadProductos() {
        return productos.size();
    }

    /**
     * Devuelve el nombre del propietario del carrito.
     *
     * @return Nombre del propietario.
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Cambia el nombre del propietario del carrito.
     *
     * @param propietario Nuevo nombre del propietario.
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}