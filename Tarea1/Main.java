import java.util.*;
public class Main {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Menú");
            System.out.println("Digite la opción que desee realizar:");
            System.out.println("1. Insertar un elemento al inicio de la lista");
            System.out.println("2. Insertar un elemento al final de la lista");
            System.out.println("3. Eliminar elemento por ID");
            System.out.println("4. Eliminar elemento por posición");
            System.out.println("5. Imprimir el listado");
            System.out.println("6. Consultar elementos en la lista");
            System.out.println("7. Obtener información de la lista");
            System.out.println("8. Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                case 3:
                    //
                    break;
                case 4:
                    //
                    break;
                case 5:
                    //
                    break;
                case 6:
                    //
                    break;
                case 7:
                    //
                    break;
                default:
                    //
                    break;
            }//fin switch
        } while (opcion !=8);
        entrada.close();
    }//fin del main
}//fin de la clase