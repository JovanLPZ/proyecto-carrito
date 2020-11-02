public class carrito 
{
    private String nombre;
    private float total;
    private int cantidadProducto;
    private listad<producto> productos;

    public carrito(String nombre) 
    {
        this.nombre = nombre;
        this.total = 0;
        this.cantidadProducto = 0;
        this.productos = new listad<producto>() ;
    }

    public void addProducto(producto producto) 
    {
        productos.add(producto);
        total+=producto.getPrecio();
    }
    
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public float getTotal() 
    {
        return total;
    }

    public void setTotal(float total) 
    {
        this.total = total;
    }

    public listad<producto> getProductos() 
    {
        return productos;
    }

    public void setProductos(listad<producto> productos) 
    {
        this.productos = productos;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

}
