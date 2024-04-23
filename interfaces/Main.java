import java.util.ArrayList;

public class Main {
public static void main(String[] args) {

      impleContenerod instance= new impleContenerod();


      ArrayList <Estudiante> ListaEstudiantes= instance.obEstudiantes();


        for (Estudiante estudiante: ListaEstudiantes ){
           System.out.println(" Nombre : " + estudiante.getStudentnam() +" Codigo :" + estudiante.getStudentcod());

    }
}
     
}