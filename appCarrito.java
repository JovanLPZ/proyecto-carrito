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

            switch(opcion)
            {
                case 1: //Nuevo carrito
               
                System.out.print("Nombre del carrito: ");
                nombre = leer.next();
                
                carritos.add(new carrito(nombre));
                
                break;

                case 2: //Eliminar carrito

                System.out.print("Nombre del carrito: ");
                nombre = leer.next();


                for(int i = 0; i < carritos.size(); i++)
                {                 
                    if(carritos.get(i).getNombre().equals(nombre))
                    {
                        carritos.remove(i);
                        break;
                    }
                    else
                    {
                        System.out.println("Carrito no encontrado");
                        break;
                    }
                }

                break;

                case 3: //Agregar al carrito
             

                break;

                case 4: //Cambiar producto
                
                break;

                case 5: //Quitar del carrito
                
                break;

                case 6: //Total del carrito

                break;

                case 7: //Total global

                break;

                case 8: //Ver lista

                System.out.println();
                for (int i = 0; i < carritos.size(); i++) 
                {
                    System.out.println(carritos.get(i).getNombre());
                }

                break;

                case 0: //Terminar programa
                System.out.println("Terminar programa");

                default:
                System.out.println("Opcion no valida");

            }

        } while(opcion != 0);
        leer.close();
    }


    public static int menu()
    {
        System.out.println("\n**********************");
        System.out.println("\nMenu de opciones\n");
        System.out.println("1.- Nuevo carrito"); //Hecha
        System.out.println("2.- Eliminar carrito"); //Hecha
        System.out.println("3.- Agregar al carrito");
        System.out.println("4.- Cambiar producto");
        System.out.println("5.- Quitar del carrito");
        System.out.println("6.- Total del carrito");
        System.out.println("7.- Total global");
        System.out.println("8.- Ver lista"); //Hecha
        System.out.println("0.- Salir");
        System.out.print("\nOpcion: ");
        
        return leer.nextInt();
    }
}