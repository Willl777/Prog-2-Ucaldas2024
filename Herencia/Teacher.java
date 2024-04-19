public class Teacher extends Person {
    
    private float salario_profesor = 0f;

    public Teacher(String name, String numer, String email, float salario_profesor) {
        super(name, numer, email);
        this.salario_profesor = salario_profesor;
    }

    public Teacher(String name, String numer, String email) {
        super(name, numer, email);
    }


    
    

}
