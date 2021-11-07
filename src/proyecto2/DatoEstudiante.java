/*
 * Clase Independiente para los métodos Getters y Setters y atributos correspondientes. 
 * Así como la creación del constructor.
 * Este programa fué realizado por: Luis Angel Díaz Alvarado. 
 */
package proyecto2;//Nombre del paquete que identifica a este programa.

/**
 *
 * @author Luis Angel Díaz
 */
public class DatoEstudiante//El programa utiliza la clase DatoEstudiante. 
{//Inicio de la clase DatoEstudiante.
    private String Nombres;//Declaración de Variables de la Clase DatoEstudiante.
    private String Apellidos;//Declaración de Variables de la Clase DatoEstudiante. 
    private String Sexo;//Declaración de Variables de la Clase DatoEstudiante.
    private String Carrera;//Declaración de Variables de la Clase DatoEstudiante.
    private String Carne;//Declaración de Variables de la Clase DatoEstudiante.
    private int Edad;//Declaración de Variables de la Clase DatoEstudiante.
    private int Créditos;//Declaración de Variables de la Clase DatoEstudiante.
    private int Cursos_Aprobados;//Declaración de Variables de la Clase DatoEstudiante.
    
    //Acá inicia la Creación del Constructor.
    public DatoEstudiante(String Nombres, String Apellidos, String Sexo, String Carrera, String Carne, int Edad, int Créditos, int Cursos_Aprobados) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Sexo = Sexo;
        this.Carrera = Carrera;
        this.Carne = Carne;
        this.Edad = Edad;
        this.Créditos = Créditos;
        this.Cursos_Aprobados = Cursos_Aprobados;
    }//Acá finaliza la Creación del Constructor.
    
    //Acá inicia la creación de los Métodos Getters y Setters.
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCarne() {
        return Carne;
    }

    public void setCarne(String Carne) {
        this.Carne = Carne;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getCréditos() {
        return Créditos;
    }

    public void setCréditos(int Créditos) {
        this.Créditos = Créditos;
    }

    public int getCursos_Aprobados() {
        return Cursos_Aprobados;
    }

    public void setCursos_Aprobados(int Cursos_Aprobados) {
        this.Cursos_Aprobados = Cursos_Aprobados;
    } //Acá finaliza la creación de los Métodos Getters y Setters.              

    boolean getCarnet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//Fin de la clase DatoEstudiante.
