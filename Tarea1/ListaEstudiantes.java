public class ListaEstudiantes {
    //atributo lista de objetos de la clase Estudiante
    Estudiante lista[];

    //setter y getter
    public void setLista(Estudiante[] lista) {
        this.lista = lista;
    }
    public Estudiante[] getLista() {
        return lista;
    }
    //fin setter y getter

    //método para imprimir la lista de estudiantes
    public static void imprimirListaEstudiantes(Estudiante[] listaEstudiantesP){
        try{
            for (int i=0; i<listaEstudiantesP.length; i++){
                //impresión sugerida 2
                System.out.println("Expediente #" + i+1 );
                System.out.println("Nombre: " + listaEstudiantesP[i].getNombre());
                System.out.println("Apellidos: " + listaEstudiantesP[i].getApellidos());
                System.out.println("Cédula: " + listaEstudiantesP[i].getCedula());
                System.out.println("Carné: " + listaEstudiantesP[i].getCarne());
                System.out.println("Promedio Ponderado: " + listaEstudiantesP[i].getPromedioPonderado());
                System.out.println("Carrera: " + listaEstudiantesP[i].getCarrera());
                System.out.println("Edad: " + listaEstudiantesP[i].getEdad());
            }
        }
        catch(Exception ex){//REVISAR ESTA EXCEPCION!!
            throw ex;
        }
    }//fin del método imprimirListaEstudiantes

    //método para insertar un elemento al final de la lista
    public static Estudiante[] insertarElementoAlFinal(Estudiante listaInicial[], Estudiante estudianteNuevo){
        Estudiante nLista[] = new Estudiante[listaInicial.length + 1];
        for (int i=0; i<listaInicial.length ; i++){
            nLista[i] = listaInicial[i];
        }
        nLista[listaInicial.length] = estudianteNuevo;
        listaInicial = nLista;
        return nLista;
    }// fin del método insertarElementoAlFinal
    
}//fin clase
