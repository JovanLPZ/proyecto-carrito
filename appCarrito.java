import java.util.Scanner;

public class appCarrito 
{
    public static Scanner leer = new Scanner(System.in);

    private static listad<carrito> carritos = new listad<carrito>();
    private static listad<producto> productos = new listad<producto>();

    public static void main(String[] args) 
    {

        int opcion = 0;
        String nombre = "";
        float total = 0;

        do 
        {
            opcion = menu();

            switch (opcion) 
            {
                case 1: // Nuevo carrito

                    System.out.print("Nombre del carrito: ");
                    nombre = leer.next();

                    carritos.add(new carrito(nombre));

                    break;

                case 2: // Eliminar carrito

                    System.out.print("Nombre del carrito: ");
                    nombre = leer.next();

                    boolean eliminado = false;

                    for (int i = 0; i < carritos.size(); i++) {
                        if (carritos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                            carritos.remove(i);
                            eliminado = true;
                            break;
                        }
                    }
                    if (eliminado == false) {
                        System.out.println("Carrito no encontrado");

                    }

                    break;

                case 3: // Agregar al carrito
                    System.out.print("Nombre del carrito: ");
                    nombre = leer.next();

                    boolean agregado = false;

                    for (int i = 0; i < carritos.size(); i++) {
                        if (carritos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println("Agregar Producto");
                            System.out.print("Clave: ");
                            int clave = leer.nextInt();

                            System.out.print("Descripcion: ");
                            String description = leer.next();

                            System.out.print("Precio: ");
                            int precio = leer.nextInt();

                            carritos.get(i).addProducto(new producto(clave, description, precio));
                            carritos.get(i).setCantidadProducto(carritos.get(i).getCantidadProducto() + 1);
                            agregado = true;
                            break;
                        }

                    }

                    if (agregado == false) 
                    {
                        System.out.println("Carrito no encontrado");
                    }

                break;

                case 4: // Cambiar producto

                break;

                case 5: // Quitar del carrito

                    System.out.print("Nombre del carrito: ");
                    nombre = leer.next();

                    boolean encontrado = false;

                    for (int i = 0; i < carritos.size(); i++) 
                    {
                        if(carritos.get(i).getNombre().equalsIgnoreCase(nombre))
                        {
                        	  System.out.print("¿Qué producto quiere eliminar (clave)? ");
                              int clave = leer.nextInt();
             
                              for(int j = 0; j < carritos.get(i).getProductos().size(); j++)
                              {
                                 if(carritos.get(i).getProductos().get(j).getClave()==clave)
                                 {
               	                    System.out.println("Producto \""+carritos.get(i).getProductos().get(j).getDescripcion()+"\" Eliminado");
                                       carritos.get(i).removePr(j);
                                       carritos.get(i).setCantidadProducto(carritos.get(i).getCantidadProducto() - 1);
                                    break;  
                                 } 
                                 else if (j == carritos.get(i).getProductos().size()-1)
                                 {
               	                     System.out.println("No cuenta con este producto en el carrito");
                                 }
                             }
                             encontrado = true;
                        } 
                       
                    }

                    if(encontrado == false) 
                    {
                        System.out.println("Carrito no encontrado");
                        break;
                    }

                    break;

                case 6: // Total del carrito

                    break;

                case 7: // Total global

                    total = 0;

                    for (int i = 0; i < carritos.size(); i++) {
                        total += carritos.get(i).getTotal();
                    }

                    System.out.println("El total global es: " + total);

                    break;

                case 8: // Ver lista

                    System.out.println();
                    for (int i = 0; i < carritos.size(); i++) {
                        System.out.println(carritos.get(i).getNombre());
                    }

                    break;

                case 9: // Ver productos del carrito

                encontrado = false;

                System.out.print("Nombre del carrito: ");
                nombre = leer.next();

                for (int i = 0; i < carritos.size(); i++) 
                {
                    if (carritos.get(i).getNombre().equalsIgnoreCase(nombre)) 
                    {
                        for (int j = 0; j < carritos.get(i).getCantidadProducto(); j++) 
                        {
                            System.out.println(carritos.get(i).getProductos().get(j));
                        }

                        encontrado = true;
                        break;
                    }

                }

                if (encontrado == false) 
                {
                    System.out.println("Carrito no encontrado");
                }

                break;

                case 0: // Terminar programa
                    System.out.println("Terminar programa");

                default:
                    System.out.println("Opcion no valida");

            }

        } while (opcion != 0);
        leer.close();
    }

    public static int menu() 
    {
        System.out.println("\n**********************");
        System.out.println("\nMenu de opciones\n");
        System.out.println("1.- Nuevo carrito"); // Hecha
        System.out.println("2.- Eliminar carrito"); // Hecha
        System.out.println("3.- Agregar al carrito"); // Hecha
        System.out.println("4.- Cambiar producto");
        System.out.println("5.- Quitar del carrito"); //En proceso
        System.out.println("6.- Total del carrito");
        System.out.println("7.- Total global"); // Hecha
        System.out.println("8.- Ver lista"); // Hecha
        System.out.println("9.- Ver productos"); // Hecha
        System.out.println("0.- Salir");
        System.out.print("\nOpcion: ");

        return leer.nextInt();
    }
}
