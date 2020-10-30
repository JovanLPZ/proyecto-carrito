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
               
                System.out.println("Nombre del carrito: ");
                nombre = leer.next();
                
                carritos.add(new carrito(nombre));
                
                break;

                case 2: //Eliminar carrito

            

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
        
        System.out.println("\nMenu de opciones\n");
        System.out.println("1.- Nuevo carrito\n");
        System.out.println("2.- Eliminar carrito\n");
        System.out.println("3.- Agregar al carrito\n");
        System.out.println("4.- Cambiar producto\n");
        System.out.println("5.- Quitar del carrito\n");
        System.out.println("6.- Total del carrito\n");
        System.out.println("7.- Total global\n");
        System.out.println("0.- Salir\n");
        System.out.print("\nOpcion: ");
        
        return leer.nextInt();
    }
}