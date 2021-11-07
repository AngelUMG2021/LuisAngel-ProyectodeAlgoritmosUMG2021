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
public class CursosAprobados//El programa utiliza la clase CursosAprobados.  
{//Inicio de la clase CursosAprobados.
    private String Semestre_Curso;//Declaración de Variables de la Clase CursosAprobados.
    private String Nombre_Curso;//Declaración de Variables de la Clase CursosAprobados 
    private String Fecha_Aprobación_Curso;//Declaración de Variables de la Clase CursosAprobados
    private int Codigo_Curso;//Declaración de Variables de la Clase CursosAprobados
    private int Nota_Obtenida;//Declaración de Variables de la Clase CursosAprobados 
    private int Nota_Examen_Final;//Declaración de Variables de la Clase CursosAprobados 
    
    //Acá inicia la Creación del Constructor.
    public CursosAprobados(String Semestre_Curso, String Nombre_Curso, String Fecha_Aprobación_Curso, int Codigo_Curso, int Nota_Obtenida, int Nota_Examen_Final) {
        this.Semestre_Curso = Semestre_Curso;
        this.Nombre_Curso = Nombre_Curso;
        this.Fecha_Aprobación_Curso = Fecha_Aprobación_Curso;
        this.Codigo_Curso = Codigo_Curso;
        this.Nota_Obtenida = Nota_Obtenida;
        this.Nota_Examen_Final = Nota_Examen_Final;
    }//Acá finaliza la Creación del Constructor.
    
    //Acá inicia la creación de los Métodos Getters y Setters.
    public String getSemestre_Curso() {
        return Semestre_Curso;
    }

    public void setSemestre_Curso(String Semestre_Curso) {
        this.Semestre_Curso = Semestre_Curso;
    }

    public String getNombre_Curso() {
        return Nombre_Curso;
    }

    public void setNombre_Curso(String Nombre_Curso) {
        this.Nombre_Curso = Nombre_Curso;
    }

    public String getFecha_Aprobación_Curso() {
        return Fecha_Aprobación_Curso;
    }

    public void setFecha_Aprobación_Curso(String Fecha_Aprobación_Curso) {
        this.Fecha_Aprobación_Curso = Fecha_Aprobación_Curso;
    }

    public int getCodigo_Curso() {
        return Codigo_Curso;
    }

    public void setCodigo_Curso(int Codigo_Curso) {
        this.Codigo_Curso = Codigo_Curso;
    }

    public int getNota_Obtenida() {
        return Nota_Obtenida;
    }

    public void setNota_Obtenida(int Nota_Obtenida) {
        this.Nota_Obtenida = Nota_Obtenida;
    }

    public int getNota_Examen_Final() {
        return Nota_Examen_Final;
    }

    public void setNota_Examen_Final(int Nota_Examen_Final) {
        this.Nota_Examen_Final = Nota_Examen_Final;
    }//Acá finaliza la creación de los Métodos Getters y Setters. 
}//Fin de la clase CursosAprobados.
