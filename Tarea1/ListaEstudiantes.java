public class ListaEstudiantes {
//atributo lista de objetos de la clase Estudiante
    private Estudiante ListaEstudiantes[];
//setter y getter
    public void setListaEstudiantes(Estudiante[] ListaEstudiantes) {
        this.ListaEstudiantes = ListaEstudiantes;
    }
    public Estudiante[] getListaEstudiantes() {
        return ListaEstudiantes;
    }
//fin setter y getter
//métodos de la clase ListaEstudiantes
//método para imprimir la lista de estudiantes
    public static void imprimirListaEstudiantes(Estudiante[] ListaEstudiantes){
        try{
            for (int i=0; i<ListaEstudiantes.length; i++){
                //impresión sugerida 2
                System.out.println("Expediente #" + i+1 );
                System.out.println("Nombre: " + ListaEstudiantes[i].getNombre());
                System.out.println("Apellidos: " + ListaEstudiantes[i].getApellidos());
                System.out.println("Cédula: " + ListaEstudiantes[i].getCedula());
                System.out.println("Carné: " + ListaEstudiantes[i].getCarne());
                System.out.println("Promedio Ponderado: " + ListaEstudiantes[i].getPromedioPonderado());
                System.out.println("Carrera: " + ListaEstudiantes[i].getCarrera());
                System.out.println("Edad: " + ListaEstudiantes[i].getEdad());
            }
        }
        catch(Exception ex){//REVISAR ESTA EXCEPCION!!-R
            throw ex;//REVISAR ESTA EXCEPCION!!-R
        }
    }//fin del método imprimirListaEstudiantes
//método para insertar un elemento al inicio de la lista
    public static void insertarElementoAlInicio(Estudiante ListaEstudiantes[], Estudiante estudianteNuevo){
        Estudiante nListaEstudiantes[];
        nListaEstudiantes = new Estudiante[ListaEstudiantes.length + 1];
        nListaEstudiantes[0] = estudianteNuevo;
        for (int i=1; i<ListaEstudiantes.length+1; i++){
            nListaEstudiantes[i] = ListaEstudiantes[i-1];
        }
        ListaEstudiantes = nListaEstudiantes;
    }
//método para insertar un elemento al final de la lista
    public static void insertarElementoAlFinal(Estudiante ListaEstudiantes[], Estudiante estudianteNuevo){
        Estudiante nListaEstudiantes[];
        nListaEstudiantes = new Estudiante[ListaEstudiantes.length + 1];
        for (int i=0; i<ListaEstudiantes.length; i++){
            nListaEstudiantes[i] = ListaEstudiantes[i];
        }
        nListaEstudiantes[ListaEstudiantes.length] = estudianteNuevo;
        ListaEstudiantes = nListaEstudiantes;
    }// fin del método insertarElementoAlFinal
}//fin de la clase
//COMENTARIOS
//todos los métodos los he hecho static, si quiere les cambia eso. Todavía no sé para que son jaja. -R