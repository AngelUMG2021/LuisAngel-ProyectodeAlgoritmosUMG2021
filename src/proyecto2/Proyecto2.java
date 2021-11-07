/*
 * Bienvenido al Programa para realizar el análisis de datos de los estudiantes de cierta universidad.
 * Este programa pretende ayudar para el ingreso de los datos de los estudiantes, 
 * datos que serán almacenados en un archivo para ser utilizados posteriormente. 
 * Los requerimientos al iniciar el programa son especificados, siendo estos: 
 * Los datos que se solicitarán de cada estudiante, Listado de cursos aprobados y Listado de cursos reprobados. 
 * Al abrir el programa mostrará dos opciones, la primera servirá para hacer el ingreso de datos de estudiantes,
 * y la segunda opción servirá para realizar el análisis de los datos que se encuentren almacenados en el archivo.  
 * Este programa fué realizado por: Luis Angel Díaz Alvarado. 
 */
package proyecto2;//Nombre del paquete que identifica a este programa.
import java.util.Scanner;//Import, indica al compilador, busca Scanner y lo asocia con la clase creada.
/**
 *
 * @author Luis Angel Díaz
 */
public class Proyecto2 //El programa utiliza la clase Proyecto2, Una clase "public" da la posibilidad que desde cualquier otra clase, debe ser primero accesible el "package".
{//Inicio de la clase Proyecto2.

    /**
     * @param args the command line arguments
     */
    //Con el método main empieza la ejecución de la aplicación en Java.
    public static void main(String[] args)
    {//Inicio del método main. 
       Scanner entrada=new Scanner (System.in);//Scanner: Lee los datos, indicando de donde se leeran.
       int Eleccion;//Declaración de Variable, da a acceso a elegir las opciones del menú mediante el ingreso de números.
        System.out.println("Bienvenido al Análisis de Datos de Estudiantes Universitarios");//Presentación en el menú.
        System.out.println("Ingrese mediante el número la opción que desea realizar:");//Indicaciones a realizar en el menú.
        System.out.println("1.-Ingreso de Datos");//Instrucción hacia el usuario.
        System.out.println("2.-Análisis de Datos");//Instrucción hacia el usuario.
        System.out.println("3.-Salir");//Instrucción hacia el usuario.
        Eleccion= entrada.nextInt ();//Lee el dato que ha ingresado el usuario. 
        switch  (Eleccion)//Switch es una instrucción de selección mútiple que realiza distintas acciones, con base en los posibles valores de una expresión como: byte, short, int o char.
        {//Inicio de la Instrucción.
            case 1://Case: Lista de todo lo que se desea que aparezca en el menú.
         String Nombres;//Declaración de Variables.
         String Apellidos;//Declaración de Variables. 
         String Sexo;//Declaración de Variables.
         String Carrera;//Declaración de Variables.
         String Carne;//Declaración de Variables.
         int Edad;//Declaración de Variables.
         int Créditos;//Declaración de Variables. 
         int Cursos_Aprobados;//Declaración de Variables.
         
         String Semestre_Curso;//Declaración de Variables.
         String Nombre_Curso;//Declaración de Variables. 
         String Fecha_Aprobación_Curso;//Declaración de Variables. 
         int Codigo_Curso;//Declaración de Variables. 
         int Nota_Obtenida;//Declaración de Variables. 
         int Nota_Examen_Final;//Declaración de Variables.
         
         String Semestre_Pertenece_Curso;//Declaración de Variables.
         int Codigo_del_Curso;//Declaración de Variables.
         String Nombre_del_Curso_;//Declaración de Variables. 
         int Zona_Obtenida_Estudiante;//Declaración de Variables. 
         int Nota_de_Examen_Final;//Declaración de Variables.
         int Fecha_Reprobo_Curso;//Declaración de Variables.
         
            System.out.println("Ingrese su Nombre, sin dejar espacios. Ejemplo: CarlosJosue:");//Indicador.
            Nombres= entrada.next ();//Ingreso del dato departe del usuario.
            System.out.println("Ingrese sus Apellidos, sin dejar espacios. Ejemplo: AlvaradoReyes:");//Indicador.
            Apellidos= entrada.next ();//Ingreso del dato departe del usuario. 
            System.out.println("Ingrese su número de Carné, Ejemplo:7590-21-3489:");//Indicador.
            Carne= entrada.next ();//Ingreso del dato departe del usuario.
            System.out.println("Ingrese su Edad, colocar en números:");//Indicador.
            Edad= entrada.nextInt ();//Ingreso del dato departe del usuario.
            System.out.println("Ingrese su Sexo:");//Indicador.
            Sexo= entrada.next ();//Ingreso del dato departe del usuario.
            System.out.println("Ingrese el nombre de la Carrera completa, sin dejar espacios. Ejemplo: PsicolgiaClinica:");//Indicador.
            Carrera= entrada.next ();//Ingreso del dato departe del usuario.
            System.out.println("Ingrese el total de Créditos Obtenidos, colocar en números:");//Indicador.
            Créditos= entrada.nextInt ();//Ingreso del dato departe del usuario.
            System.out.println("Ingrese la Cantidad de cursos aprobados, colocar en números:");//Indicador.
            Cursos_Aprobados= entrada.nextInt ();//Ingreso del dato departe del usuario. 
            
            System.out.println("A continuación, los siguientes datos se deben ingresar por cada curso aprobado por el estudiante:");//Instrucciones.
            System.out.println("Ingrese el semestre al que pertenece el curso, Ejemplo:Primero:");//Indicador.
            Semestre_Curso= entrada.next ();//Ingreso del dato departe del usuario. 
            System.out.println("Ingrese el Nombre del curso completo, sin dejar espacios. Ejemplo: AlgebraLineal:");//Indicador.
            Nombre_Curso= entrada.next ();//Ingreso del dato departe del usuario.  
            System.out.println("Ingrese el Código de curso:");//Indicador.
            Codigo_Curso = entrada.nextInt ();//Ingreso del dato departe del usuario. 
            System.out.println("Ingrese su zona obtenida:");//Indicador.
            Nota_Obtenida= entrada.nextInt ();//Ingreso del dato departe del usuario. 
            System.out.println("Ingrese la nota de Examen Final obtenida:");//Indicador.
            Nota_Examen_Final= entrada.nextInt ();//Ingreso del dato departe del usuario.
            System.out.println("Ingrese la fecha Aprobación del curso, Ejempo:12-03-2021:");//Indicador.
            Fecha_Aprobación_Curso= entrada.next ();//Ingreso del dato departe del usuario.
            
            System.out.println("A continuación, los siguientes datos se deben ingresar por cada curso reprobado por el estudiante:");//Instrucciones.
            System.out.println("Ingrese el semestre al que pertenece el curso, Ejemplo:Primero:");//Indicador.
            Semestre_Pertenece_Curso= entrada.next ();//Ingreso del dato departe del usuario.
            System.out.println("Ingrese el Código de curso:");//Indicador.
            Codigo_del_Curso= entrada.nextInt ();//Ingreso del dato departe del usuario. 
            System.out.println("Ingrese el Nombre del curso completo, sin dejar espacios. Ejemplo: AlgebraLineal :");//Indicador.
            Nombre_del_Curso_= entrada.next ();//Ingreso del dato departe del usuario. 
            System.out.println("Ingrese su zona obtenida:");//Indicador.
            Zona_Obtenida_Estudiante= entrada.nextInt ();//Ingreso del dato departe del usuario. 
            System.out.println("Ingrese la nota de Examen Final obtenida:");//Indicador.
            Nota_de_Examen_Final= entrada.nextInt ();//Ingreso del dato departe del usuario. 
            System.out.println("Ingrese la fecha en que Reprobó el curso, Ejempo:12032021:");//Indicador.
            Fecha_Reprobo_Curso= entrada.nextInt ();//Ingreso del dato departe del usuario.
            
         DatoEstudiante nuevo=new DatoEstudiante(Nombres, Apellidos, Sexo, Carrera, Carne, Edad, Créditos, Cursos_Aprobados);
         CursosAprobados nuevocurso=new  CursosAprobados(Semestre_Curso, Nombre_Curso, Fecha_Aprobación_Curso, Codigo_Curso, Nota_Obtenida, Nota_Examen_Final);
         CursosReprobados nuevocursorepro=new CursosReprobados(Semestre_Pertenece_Curso, Codigo_del_Curso, Nombre_del_Curso_, Zona_Obtenida_Estudiante, Nota_de_Examen_Final, Fecha_Reprobo_Curso);
         System.out.println("Los datos son: ");//Presentación de los datos obtenidos con la recolección anterior.
         System.out.println(nuevo.getNombres());//Dato del nombre del estudiante.
         System.out.println(nuevo.getApellidos());//Dato de los Apellidos del estudiante. 
         System.out.println(nuevo.getCarne());//Dato del carné del estudiante.  
         System.out.println(nuevo.getEdad());//Dato de la edad del estudiante. 
         System.out.println(nuevo.getSexo());//Dato de la sexo del estudiante. 
         System.out.println(nuevo.getCarrera());//Dato de la carrera del estudiante. 
         System.out.println(nuevo.getCréditos());//Dato del Total de Créditos obtenidos del estudiante.
         System.out.println(nuevo.getCursos_Aprobados());//Dato del Total de Cursos Aprobados del estudiante.
         System.out.println(nuevocurso.getSemestre_Curso());//Dato del Semestre al que pertenece el curso.
         System.out.println(nuevocurso.getNombre_Curso());//Dato del nombre del curso.
         System.out.println(nuevocurso.getCodigo_Curso());//Dato del código del curso.
         System.out.println(nuevocurso.getNota_Obtenida());//Dato de la zona obtenida del curso.
         System.out.println(nuevocurso.getNota_Examen_Final());//Dato de la nota de Examen Final obtenida por el estudiante.
         System.out.println(nuevocurso.getFecha_Aprobación_Curso());//Dato de la fecha de aprobación del curso.
         System.out.println(nuevocursorepro.getSemestre_Pertenece_Curso());//Dato del semestre al que pertenece el curso.
         System.out.println(nuevocursorepro.getCodigo_del_Curso());//Dato del código de curso.
         System.out.println(nuevocursorepro.getNombre_del_Curso_());//Dato del nombre del curso.
         System.out.println(nuevocursorepro.getZona_Obtenida_Estudiante());//Dato de la zona obtenida por el estudiante.
         System.out.println(nuevocursorepro.getNota_de_Examen_Final());//Dato de la nota de examen final obtenida por el estudiante.
         System.out.println(nuevocursorepro.getFecha_Reprobo_Curso());//Dato en que Fecha se reprobó el curso.
        
         break;          
         // Hasta acá se llega con el código por problemas de tiempo, así mismo es lo que pude entender en la realización de este programa a desarrollar. :)                                  
       }//Fin de la Instrucción.      
    }//Fin del método main.   
}//Fin de la clase Proyecto2.
