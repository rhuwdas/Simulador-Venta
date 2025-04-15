public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private Float precio;
    private int cantidad;
    public Producto(String codigo, String nombre, String descripcion, Float precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public Producto() {
        this.codigo = "";
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0.0f;
        this.cantidad = 0;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public boolean setPrecio(Float precio) {
        if (precio > 0) {
            this.precio = precio;
            return true;
        }
        return false;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
