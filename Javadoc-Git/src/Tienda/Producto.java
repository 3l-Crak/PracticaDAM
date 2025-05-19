package tienda;

/**
 * La clase Producto representa un producto disponible en la tienda.
 * Cada producto tiene un nombre y un precio.
 *
 * @author Eloy y ChatGPT
 * @version 1.0
 * @since 1.0
 */
public class Producto {

    private String nombre;
    private double precio;

    /**
     * Constructor de la clase Producto.
     *
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del producto.
     *
     * @param nombre Nuevo nombre para el producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Cambia el precio del producto.
     *
     * @param precio Nuevo precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Calcula el precio con descuento.
     *
     * @param porcentaje Porcentaje de descuento a aplicar (0-100).
     * @return El precio luego de aplicar el descuento.
     * @deprecated Este método será reemplazado por aplicarDescuento(double).
     * @see #aplicarDescuento(double)
     */
    @Deprecated
    public double calcularDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    /**
     * Aplica un descuento al precio del producto y actualiza el valor.
     *
     * @param porcentaje Porcentaje de descuento (0-100).
     * @return El nuevo precio del producto.
     */
    public double aplicarDescuento(double porcentaje) {
        this.precio = this.precio - (this.precio * porcentaje / 100);
        return this.precio;
    }
}
