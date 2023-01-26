public class Estudiante {
    //atributos Estudiante
    String nombre;
    String apellidos;
    int cedula;
    String carne;
    double promedioPonderado;
    String carrera;
    int edad;

    //métodos Estudiante

    //constructor de la clase
    public Estudiante(String nombre, String apellidos, int cedula, String carne, double promedioPonderado,
            String carrera, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.carne = carne;
        this.promedioPonderado = promedioPonderado;
        this.carrera = carrera;
        this.edad = edad;
    }//fin del constructor

    //constructor por default
    public Estudiante(){
        this.nombre = "";
        this.apellidos = "";
        this.cedula = 0;
        this.carne = "";
        this.promedioPonderado = 0;
        this.carrera = "";
        this.edad = 0;
    }//fin del constructor

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setPromedioPonderado(double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //fin setters

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public String getCarne() {
        return carne;
    }

    public double getPromedioPonderado() {
        return promedioPonderado;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getEdad() {
        return edad;
    }
    //fin getters

}//fin de la clase