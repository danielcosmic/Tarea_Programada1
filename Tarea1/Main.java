//DANIEL ROJAS MORALES C26836
//RAQUEL ROJAS CASTILLO C26766
import java.util.*;
public class Main {
    public static void main (String args[]){
        Estudiante[] listaEstudiantes;
        listaEstudiantes = new Estudiante[0];
        Scanner in = new Scanner(System.in);
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
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    //insertar elemento al inicio
                System.out.println("Ingrese el nombre del estudiante que desea agregar:");
                String nombrei = in.nextLine();
                System.out.println("Ingrese los apellidos del estudiante que desea agregar:");
                String apellidosi = in.nextLine();
                System.out.println("Ingrese la cédula del estudiante que desea agregar:");
                String cedulaEi = in.nextLine();
                int cedulai = Integer.parseInt(cedulaEi);
                System.out.println("Ingrese el carné del estudiante que desea agregar:");
                String carnei = in.nextLine();
                System.out.println("Ingrese el promedio ponderado del estudiante que desea agregar:");
                String promedioEi = in.nextLine();
                double promedioPonderadoi = Double.parseDouble(promedioEi);
                System.out.println("Ingrese la carrera del estudiante que desea agregar:");
                String carrerai = in.nextLine();
                System.out.println("Ingrese la cédula del estudiante que desea agregar:");
                String edadEi = in.nextLine();
                int edadi = Integer.parseInt(edadEi);
                Estudiante estudianteNi = new Estudiante(nombrei, apellidosi, cedulai, carnei, promedioPonderadoi, carrerai, edadi);
                ListaEstudiantes.insertarElementoAlInicio(listaEstudiantes, estudianteNi);
                case 2:
                    //insertar elemento al final
                    System.out.println("Ingrese el nombre del estudiante que desea agregar:");
                String nombref = in.nextLine();
                System.out.println("Ingrese los apellidos del estudiante que desea agregar:");
                String apellidosf = in.nextLine();
                System.out.println("Ingrese la cédula del estudiante que desea agregar:");
                String cedulaEf = in.nextLine();
                int cedulaf = Integer.parseInt(cedulaEf);
                System.out.println("Ingrese el carné del estudiante que desea agregar:");
                String carnef = in.nextLine();
                System.out.println("Ingrese el promedio ponderado del estudiante que desea agregar:");
                String promedioEf = in.nextLine();
                double promedioPonderadof = Double.parseDouble(promedioEf);
                System.out.println("Ingrese la carrera del estudiante que desea agregar:");
                String carreraf = in.nextLine();
                System.out.println("Ingrese la cédula del estudiante que desea agregar:");
                String edadEf = in.nextLine();
                int edadf = Integer.parseInt(edadEf);
                Estudiante estudianteNf= new Estudiante(nombref, apellidosf, cedulaf, carnef, promedioPonderadof, carreraf, edadf);
                ListaEstudiantes.insertarElementoAlInicio(listaEstudiantes, estudianteNf);
                    break;
                case 3:
                    //eliminar por id
                    System.out.println("Digite 1 para eliminar por cédula");
                    System.out.println("Digite 2 para eliminar por carné");
                    String entradaE = in.nextLine();
                    int opcionE = Integer.parseInt(entradaE);
                    if (opcionE == 1){
                        System.out.println("Ingrese la cédula del estudiante que desea eliminar:");
                        String cedulaI = in.nextLine();
                        int cedulaE = Integer.parseInt(cedulaI);
                        ListaEstudiantes.eliminarElemento(listaEstudiantes, cedulaE);
                    }else if (opcionE == 2){
                        System.out.println("Ingrese el carné del estudiante que desea eliminar:");
                        String carneE = in.nextLine();
                        ListaEstudiantes.eliminarElemento(listaEstudiantes, carneE);
                    }else{
                    System.out.println("Opción inválida");
                    }//fin if
                    break;
                case 4:
                    //eliminar por posición
                    System.out.println("Ingrese la posición del estudiante que desea eliminar:");
                        String posicionIE = in.nextLine();
                        //se le resta 1 para que quede el indice del elemento a eliminar
                        int posicionE = Integer.parseInt(posicionIE) - 1;
                        ListaEstudiantes.eliminarElementoPorPosicion(listaEstudiantes, posicionE);
                    break;
                case 5:
                    //imprimir lista
                    ListaEstudiantes.imprimirListaEstudiantes(listaEstudiantes);
                    break;
                case 6:
                    //consultar elementos
                    System.out.println("Digite 1 para consultar por cédula");
                    System.out.println("Digite 2 para consultar por carné");
                    String entradaC = in.nextLine();
                    int opcionC = Integer.parseInt(entradaC);
                    if (opcionC == 1){
                        System.out.println("Ingrese la cédula del estudiante que desea consultar:");
                        String cedulaIC = in.nextLine();
                        int cedulaC = Integer.parseInt(cedulaIC);
                        ListaEstudiantes.buscarPorCedula(listaEstudiantes, cedulaC);
                    }else if (opcionC == 2){
                        System.out.println("Ingrese el carné del estudiante que desea consultar:");
                        String carneC = in.nextLine();
                        ListaEstudiantes.buscarPorCarne(listaEstudiantes, carneC);
                    }else{
                    System.out.println("Opción inválida");
                    }//fin if
                    break;
                case 7:
                    //obtener información
                    System.out.println("Digite 1 para obtener la cantidad de elementos del arreglo");
                    System.out.println("Digite 2 para obtener el promedio mayor y menor");
                    System.out.println("Digite 3 para obtener la carrera con más alumnos");
                    System.out.println("Digite 4 para obtener el promedio de edades");
                    String opcionIO = in.nextLine();
                    int opcionO = Integer.parseInt(opcionIO);
                    if (opcionO==1){
                        ListaEstudiantes.obtenerInformacion(listaEstudiantes, opcionO);
                    }else if (opcionO==2){
                        ListaEstudiantes.obtenerInformacion(listaEstudiantes, opcionO);
                    }else if (opcionO==3){
                        ListaEstudiantes.obtenerInformacion(listaEstudiantes, opcionO);
                    }else if (opcionO==4){
                        ListaEstudiantes.obtenerInformacion(listaEstudiantes, opcionO);
                    }else{
                        System.out.println("Opción inválida");
                    }//fin if
                    break;
                default:
                    System.out.println("Entrada incorrecta");
                    break;
            }//fin switch
        } while (opcion !=8);
        in.close();
    }//fin del main
}//fin de la clase