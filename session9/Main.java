public class Main {
public static Seminarios Seminarios2= new Seminarios();
public static Student Student2= new Student("WIL", "46954", "david.@", "Wil", 5);

    public static void main(String[] args) {
        Seminarios2.addseminariopROG();
        Seminarios2.addseminarioFIC();
        Seminarios2.addseminarioMAT();

        Seminarios2.imprimir();

       Student2.inscripcion(Seminarios2.cursos,Seminarios2.cursos2,Seminarios2.cursos3);
       Student2.Semninaros();


    }
    
}