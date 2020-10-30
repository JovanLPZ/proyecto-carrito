public class carrito 
{
    private String nombre;
    private float total;
    private listad<producto> productos;

    public carrito(String nombre) 
    {
        this.nombre = nombre;
        this.total = 0;
        this.productos = new listad<producto>() ;
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

    
}
