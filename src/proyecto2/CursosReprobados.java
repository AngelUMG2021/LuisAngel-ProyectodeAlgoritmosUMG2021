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
public class CursosReprobados//El programa utiliza la clase CursosReprobados.   
{//Inicio de la clase CursosReprobados.
    private String Semestre_Pertenece_Curso;//Declaración de Variables de la Clase CursosReprobados.
    private int Codigo_del_Curso;//Declaración de Variables de la Clase CursosReprobados.
    private String Nombre_del_Curso_;//Declaración de Variables de la Clase CursosReprobados. 
    private int Zona_Obtenida_Estudiante;//Declaración de Variables de la Clase CursosReprobados. 
    private int Nota_de_Examen_Final;//Declaración de Variables de la Clase CursosReprobados.
    private int Fecha_Reprobo_Curso;//Declaración de Variables de la Clase CursosReprobados.
    
    //Acá inicia la Creación del Constructor.
    public CursosReprobados(String Semestre_Pertenece_Curso, int Codigo_del_Curso, String Nombre_del_Curso_, int Zona_Obtenida_Estudiante, int Nota_de_Examen_Final, int Fecha_Reprobo_Curso) {
        this.Semestre_Pertenece_Curso = Semestre_Pertenece_Curso;
        this.Codigo_del_Curso = Codigo_del_Curso;
        this.Nombre_del_Curso_ = Nombre_del_Curso_;
        this.Zona_Obtenida_Estudiante = Zona_Obtenida_Estudiante;
        this.Nota_de_Examen_Final = Nota_de_Examen_Final;
        this.Fecha_Reprobo_Curso = Fecha_Reprobo_Curso;
    }//Acá finaliza la Creación del Constructor.
    
    //Acá inicia la creación de los Métodos Getters y Setters.
    public String getSemestre_Pertenece_Curso() {
        return Semestre_Pertenece_Curso;
    }

    public void setSemestre_Pertenece_Curso(String Semestre_Pertenece_Curso) {
        this.Semestre_Pertenece_Curso = Semestre_Pertenece_Curso;
    }

    public int getCodigo_del_Curso() {
        return Codigo_del_Curso;
    }

    public void setCodigo_del_Curso(int Codigo_del_Curso) {
        this.Codigo_del_Curso = Codigo_del_Curso;
    }

    public String getNombre_del_Curso_() {
        return Nombre_del_Curso_;
    }

    public void setNombre_del_Curso_(String Nombre_del_Curso_) {
        this.Nombre_del_Curso_ = Nombre_del_Curso_;
    }

    public int getZona_Obtenida_Estudiante() {
        return Zona_Obtenida_Estudiante;
    }

    public void setZona_Obtenida_Estudiante(int Zona_Obtenida_Estudiante) {
        this.Zona_Obtenida_Estudiante = Zona_Obtenida_Estudiante;
    }

    public int getNota_de_Examen_Final() {
        return Nota_de_Examen_Final;
    }

    public void setNota_de_Examen_Final(int Nota_de_Examen_Final) {
        this.Nota_de_Examen_Final = Nota_de_Examen_Final;
    }

    public int getFecha_Reprobo_Curso() {
        return Fecha_Reprobo_Curso;
    }

    public void setFecha_Reprobo_Curso(int Fecha_Reprobo_Curso) {
        this.Fecha_Reprobo_Curso = Fecha_Reprobo_Curso;
    }//Acá finaliza la creación de los Métodos Getters y Setters.    
}//Fin de la clase CursosAprobados.