import java.util.ArrayList;

public class impleContenerod implements Contenedor{


    public ArrayList<Estudiante> ListaEstudiantes=new ArrayList<>();

    public impleContenerod(){
        this.ListaEstudiantes.add (new Estudiante("Miguel","2222"));
        this.ListaEstudiantes.add (new Estudiante("Jose","3333"));
        this.ListaEstudiantes.add (new Estudiante("Wil","4444"));
        

    }
   public ArrayList <Estudiante> obEstudiantes(){ 
     return this.ListaEstudiantes;
    }
}
    

