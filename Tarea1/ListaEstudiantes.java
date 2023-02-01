//TAREA PROGRAMADA 1
//DANIEL ROJAS MORALES C26836
//RAQUEL ROJAS CASTILLO C26766
import java.util.HashMap;
import java.util.Map;
public class ListaEstudiantes {
//atributo lista de objetos de la clase Estudiante
    private Estudiante listaEstudiantes[];
//constructor
public ListaEstudiantes(Estudiante[] listaEstudiantes) {
    this.listaEstudiantes = listaEstudiantes;
}
//setter y getter
    public void setListaEstudiantes(Estudiante[] listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    public Estudiante[] getListaEstudiantes() {
        return listaEstudiantes;
    }
//fin setter y getter
//métodos de la clase ListaEstudiantes
//método para imprimir la lista de estudiantes
    public static void imprimirListaEstudiantes(Estudiante[] listaEstudiantes){
        try{
            for (int i=0; i<listaEstudiantes.length; i++){
                //impresión sugerida 2
                System.out.println("Expediente #" + i+1 );
                System.out.println("Nombre: " + listaEstudiantes[i].getNombre());
                System.out.println("Apellidos: " + listaEstudiantes[i].getApellidos());
                System.out.println("Cédula: " + listaEstudiantes[i].getCedula());
                System.out.println("Carné: " + listaEstudiantes[i].getCarne());
                System.out.println("Promedio Ponderado: " + listaEstudiantes[i].getPromedioPonderado());
                System.out.println("Carrera: " + listaEstudiantes[i].getCarrera());
                System.out.println("Edad: " + listaEstudiantes[i].getEdad());
            }
        }
        catch(Exception e){
            System.out.println("Error en el arreglo");
        }//fin try
    }//fin del método imprimirListaEstudiantes

//método para insertar un elemento al inicio de la lista
    public static void insertarElementoAlInicio(Estudiante listaEstudiantes[], Estudiante estudianteNuevo){
        Estudiante nListaEstudiantes[];
        nListaEstudiantes = new Estudiante[listaEstudiantes.length + 1];
        nListaEstudiantes[0] = estudianteNuevo;
        for (int i=1; i<listaEstudiantes.length+1; i++){
            nListaEstudiantes[i] = listaEstudiantes[i-1];
        }
        listaEstudiantes = nListaEstudiantes;
        nListaEstudiantes = null;
    }

//método para insertar un elemento al final de la lista
    public static void insertarElementoAlFinal(Estudiante listaEstudiantes[], Estudiante estudianteNuevo){
        Estudiante nListaEstudiantes[];
        nListaEstudiantes = new Estudiante[listaEstudiantes.length + 1];
        for (int i=0; i<listaEstudiantes.length; i++){
            nListaEstudiantes[i] = listaEstudiantes[i];
        }
        nListaEstudiantes[listaEstudiantes.length] = estudianteNuevo;
        listaEstudiantes = nListaEstudiantes;
        nListaEstudiantes = null;
    }// fin del método insertarElementoAlFinal

//método para eliminar un estudiante por cédula
    public static void eliminarElemento(Estudiante listaEstudiantes[], int estudianteID){
        Estudiante nListaEstudiantes[];
        int indice = 0, cuantos = 0;
        boolean encontrado = false;
        for(int i=0; i<listaEstudiantes.length; i++){
            if (estudianteID == listaEstudiantes[i].getCedula()){
                //se buscan los elementos a borrar dentro del array y se contabilizan
                encontrado = true;
                cuantos++;
            }
        }// fin for

        if(encontrado = true){
            //se usa un array auxiliar con un tamaño reducido para almacenar los elementos que se mantienen
            nListaEstudiantes = new Estudiante[listaEstudiantes.length - cuantos];
            for(int i=0; i<listaEstudiantes.length; i++){
                if(estudianteID != listaEstudiantes[i].getCedula()){
                    //se copian los elementos que se desean mantener y si el elemento a borrar se encuentra en el arreglo el contador del indice no aumenta
                    nListaEstudiantes[indice] = listaEstudiantes[i];
                    //el indice solo avanza si se copió un elemento al array
                    indice++;
                }
            }// fin for
            listaEstudiantes = nListaEstudiantes;
            nListaEstudiantes = null;
        }
    }// fin del método elimninarElemento por cedula

// método para almacenar los elementos a eliminar
    public static int[] insertarElementoAEliminar(int [] posicionesA, int elemento){
        int[] nListaEstudiantesA = new int[posicionesA.length + 1];
        //funcion auxiliar que almacena en un array auxiliar los elementos que se desean eliminar
        for (int i=0; i<posicionesA.length; i++){
            nListaEstudiantesA[i] = posicionesA[i];
        }// fin for
        nListaEstudiantesA[posicionesA.length] = elemento;
        posicionesA = nListaEstudiantesA;
        return posicionesA;

    } // fin del método insertarElementoAEliminar

//método para buscar el indice del elemento a eliminar
    public static boolean buscarIndice(int [] posicionesA, int elemento){
        boolean encontrado = false;
        //funcion auxiliar para buscar los elementos a borrar
        for(int i=0; i<posicionesA.length; i++){
            if (elemento == posicionesA[i]){
                encontrado = true;
            }
        }// fin for
        return encontrado;
    } // fin del método buscarIndice del elemento a eliminar

//método para eliminar un estudiante por carne
    public static void eliminarElemento(Estudiante listaEstudiantes[], String estudianteID){
        Estudiante nListaEstudiantes[];
        int[] posiciones = new int [0];
        boolean encontrado = false;
        //se buscan los elementos a borrar en el array y se envian a una función que almacena sus posiciones
        for (int i=0; i<listaEstudiantes.length; i++){
            if(estudianteID.equals(listaEstudiantes[i].getCarne())){
                encontrado = true;
                posiciones = insertarElementoAEliminar(posiciones, i);
            }
        }// fin for
        if (encontrado){
            //si existe un elemento a eliminar dentro del array se borra saltandose su posició cuando se copia la lista a otro array
            nListaEstudiantes = new Estudiante[listaEstudiantes.length - posiciones.length];
            int indice = 0;
            for(int i=0; i < listaEstudiantes.length; i++){
                if(buscarIndice(posiciones, i) == false){
                    nListaEstudiantes[indice] = listaEstudiantes[i];
                    indice ++;
                }
            }// fin for
            listaEstudiantes = nListaEstudiantes;
            nListaEstudiantes = null;
        }
    }// fin del método elimninarElemento por carne

//método para eliminar un elemento por su posición
    public static void eliminarElementoPorPosicion(Estudiante listaEstudiantes[], int posicion){
        for (int i = posicion; i < listaEstudiantes.length - 1; i++) {
            listaEstudiantes[i] = listaEstudiantes[i + 1];
        }
        //se mueven todos los elementos despues de la posición indicada un lugar a la izquierda
        //dejando el elemento a eliminar al final del array e igualandolo a null
        listaEstudiantes[listaEstudiantes.length - 1] = null;

    }

//método para buscar datos en la lista por cédula
    public static void buscarPorCedula (Estudiante listaEstudiantes[], int cedula){
        for (int i=0; i<listaEstudiantes.length; i++){
            if (cedula == listaEstudiantes[i].getCedula()){
                System.out.println("Expediente #" + i+1 );
                System.out.println("Nombre: " + listaEstudiantes[i].getNombre());
                System.out.println("Apellidos: " + listaEstudiantes[i].getApellidos());
                System.out.println("Cédula: " + listaEstudiantes[i].getCedula());
                System.out.println("Carné: " + listaEstudiantes[i].getCarne());
                System.out.println("Promedio Ponderado: " + listaEstudiantes[i].getPromedioPonderado());
                System.out.println("Carrera: " + listaEstudiantes[i].getCarrera());
                System.out.println("Edad: " + listaEstudiantes[i].getEdad());
            }
            else{
                System.out.println("No existe un registro que cumpla con el criterio de búsqueda");
            }//fin if
        }//fin for
    }// fin del método buscarPorCedula

//método para buscar datos en la lista por carne
    public static void buscarPorCarne (Estudiante listaEstudiantes[], String carne){
        for (int i=0; i<listaEstudiantes.length; i++){
            if (carne.equals(listaEstudiantes[i].getCarne())){
                System.out.println("Expediente #" + i+1 );
                System.out.println("Nombre: " + listaEstudiantes[i].getNombre());
                System.out.println("Apellidos: " + listaEstudiantes[i].getApellidos());
                System.out.println("Cédula: " + listaEstudiantes[i].getCedula());
                System.out.println("Carné: " + listaEstudiantes[i].getCarne());
                System.out.println("Promedio Ponderado: " + listaEstudiantes[i].getPromedioPonderado());
                System.out.println("Carrera: " + listaEstudiantes[i].getCarrera());
                System.out.println("Edad: " + listaEstudiantes[i].getEdad());
            }
            else{
                System.out.println("No existe un registro que cumpla con el criterio de búsqueda");
            }//fin if
        }//fin for
    }// fin del método buscarPorCarne

//método para obtener información de la lista
    public static void obtenerInformacion (Estudiante listaEstudiantes[], int opcion){
        switch (opcion) {
            case 1:
            //cantidad de elementos de la lista
                System.out.println("La lista tiene " + listaEstudiantes.length + " elementos");
                break;
            case 2:
            //Mayor promedio y menor promedio
                double promedioMayor = listaEstudiantes[0].getPromedioPonderado();
                double promedioMenor = listaEstudiantes[0].getPromedioPonderado();
                for (int i=0; i<listaEstudiantes.length; i++){
                    if(listaEstudiantes[i].getPromedioPonderado() > promedioMayor){
                        promedioMayor = listaEstudiantes[i].getPromedioPonderado();
                    }//fin if
                    if(listaEstudiantes[i].getPromedioPonderado() < promedioMenor){
                        promedioMenor = listaEstudiantes[i].getPromedioPonderado();
                    }//fin if
                }//fin for
                System.out.println("El mayor promedio ponderado es: " + promedioMayor);
                System.out.println("El menor promedio ponderado es: " + promedioMenor);
                break;
            case 3:
            //Carrera con más alumnos
                Map<String, Integer> frecuencias = new HashMap<>();
                for (int i = 0; i < listaEstudiantes.length; i++) {
                    String carrera = listaEstudiantes[i].getCarrera();
                    frecuencias.put(carrera, frecuencias.getOrDefault(carrera, 0) + 1);
                }

                String carreraMasFrecuente = null;
                int maxFrecuencia = 0;
                //utilizando HashMap y Map de la librería util de java se calcula la frecuencia de la carrera contando el número de veces
                //que se encuentra en el array y se cambia el valor max cuando hay una carrera con mayor frecuencia que la anterior
                for (Map.Entry<String, Integer> entrada : frecuencias.entrySet()) {
                    String carrera = entrada.getKey();
                    int frecuencia = entrada.getValue();
                    if (frecuencia > maxFrecuencia) {
                        maxFrecuencia = frecuencia;
                        carreraMasFrecuente = carrera;
                    }
                }// fin for
                System.out.println("La carrera con más alumnos es: " + carreraMasFrecuente);
                break;
            case 4:
            //Promedio de las edades
                int sumaEdades = 0;
                int promedioEdad = 0;
                    for (int i=0; i<listaEstudiantes.length; i++){
                        sumaEdades = sumaEdades + listaEstudiantes[i].getEdad();
                    }//fin for
                    promedioEdad = sumaEdades / listaEstudiantes.length;
                    System.out.println("El promedio de las edades es: " + promedioEdad);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }//fin switch
    }// fin del método obtenerInformacion
}//fin de la clase