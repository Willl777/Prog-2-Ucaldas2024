import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    ArrayList <InfoCurso> Materias = new ArrayList<>(); 
    Scanner scn =new Scanner(System.in);
    private String StudentN;
    private float Promedio;

    public Student(String name, String numer, String email, String Students, float Promedio) {
        super(name, numer, email);
        this.StudentN = Students;
        this.Promedio = Promedio;
    }


    

    public void  inscripcion(ArrayList <InfoCurso> Programacion,ArrayList <InfoCurso> Fisica,  ArrayList<InfoCurso> Matematicas ){
    System.out.println(" Nombre de seminario - Programacion: ");
    String Semi=scn.nextLine();

    System.out.println(" Nombre de seminario - Fisica: ");
    String Semi2=scn.nextLine();

    System.out.println(" Nombre de seminario - Matematicas: ");
    String Semi3=scn.nextLine();

    for (int i=0; i<Programacion.size(); i++){
       if ((Programacion.get(i).getNombre_seminario()).equals(Semi)){
        Materias.add(Programacion.get(i));
    }
    }

    for (int i=0; i<Fisica.size(); i++){
        if ((Fisica.get(i).getNombre_seminario()).equals(Semi2)){
            Materias.add(Fisica.get(i));
        }
        }
        

    for (int i=0; i<Matematicas.size(); i++){
        if ((Matematicas.get(i).getNombre_seminario()).equals(Semi3)){
            Materias.add(Matematicas.get(i));
        }
        }

    

    
    }



    public void Semninaros(){
        for (int i=0; i<Materias.size();i++){
            System.out.println(Materias.get(i).getNombre_seminario());

        }

    }
    
}
