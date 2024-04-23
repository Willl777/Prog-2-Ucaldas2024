import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Seminarios {
    ArrayList <InfoCurso> cursos=new ArrayList <InfoCurso>();
    ArrayList <InfoCurso> cursos2=new ArrayList <InfoCurso>();
    ArrayList <InfoCurso> cursos3=new ArrayList <InfoCurso>();

    public void addseminariopROG(){
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\david\\OneDrive\\Documentos\\prog2\\txt\\Programacion.txt"));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split(",");
                if(bloques.length == 5) {
                    String nombre_seminario = bloques[0];
                    int horas_seminario = Integer.parseInt(bloques[1]);
                    String nombre_profesor = bloques[2];
                    String telefono_profesor = bloques[3];
                    String correo_profesor = bloques[4];
                    cursos.add(new InfoCurso(nombre_seminario, horas_seminario, new Teacher(nombre_profesor, telefono_profesor, correo_profesor)));

                }            
            }
        
        lector.close();
        }
        catch(IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
        
    }
    public void addseminarioFIC(){
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\david\\OneDrive\\Documentos\\prog2\\txt\\Fisica.txt"));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split(",");
                if(bloques.length == 5) {
                    String nombre_seminario = bloques[0];
                    int horas_seminario = Integer.parseInt(bloques[1]);
                    String nombre_profesor = bloques[2];
                    String telefono_profesor = bloques[3];
                    String correo_profesor = bloques[4];
                    cursos2.add(new InfoCurso(nombre_seminario, horas_seminario, new Teacher(nombre_profesor, telefono_profesor, correo_profesor)));

                }            
            }
        
        lector.close();
        }
        catch(IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
        
    }
    public void addseminarioMAT(){
        try {
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\david\\OneDrive\\Documentos\\prog2\\txt\\Matematicas.txt"));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String [] bloques = linea.split(",");
                if(bloques.length == 5) {
                    String nombre_seminario = bloques[0];
                    int horas_seminario = Integer.parseInt(bloques[1]);
                    String nombre_profesor = bloques[2];
                    String telefono_profesor = bloques[3];
                    String correo_profesor = bloques[4];
                    cursos3.add(new InfoCurso(nombre_seminario, horas_seminario, new Teacher(nombre_profesor, telefono_profesor, correo_profesor)));

                }            
            }
        
        lector.close();
        }
        catch(IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
        
    }

    /*
    public void addseminarioFISICA(){
        cursos2.add(new InfoCurso("Fisica 1", 5 , new Teacher ("Juan" , "656" ,  "juam.@" )));
        cursos2.add(new InfoCurso("Fisica 2", 5 , new Teacher ("Angie" , "666" ,  "Ang123.@" )));
        cursos2.add(new InfoCurso("Fisica 3", 5 , new Teacher ("Martin" , "534466" ,  "taco1233w.@" )));
        
        
    /*
     * 
     *
    public void addseminarioMATE(){
        cursos2.add(new InfoCurso("calculo 1", 5 , new Teacher ("Marco" , "6546" ,  "marcoo.@" )));
        cursos2.add(new InfoCurso("calculo 2", 5 , new Teacher ("Arturo" , "34366" ,  "faco123.@" )));
        cursos2.add(new InfoCurso("calculo 3", 5 , new Teacher ("David" , "534466" ,  "taco1233.@" )));
        

    }
    */
    public void imprimir(){

        System.out.println("Seminario de prog:");
            for(int i=0; i<cursos.size();i++){
        System.out.println(cursos.get(i).getNombre_seminario());
        }

        System.out.println("Seminario de fisica:");
        
           for(int i=0;i<cursos2.size();i++){
            System.out.println(cursos2.get(i).getNombre_seminario());
        }

        System.out.println("Seminario de Matematicas");
           for(int i=0;i<cursos3.size();i++){
                System.out.println(cursos3.get(i).getNombre_seminario());
        }
            
    }
}



