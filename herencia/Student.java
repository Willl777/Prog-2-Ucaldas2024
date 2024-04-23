public class Student extends Persona{

    private String Student_id = " ";




    public Student(String user_name, String lastName, String document, String gender,String Student_id) {
        super(user_name, lastName, document, gender);
        //Xd1|
        this.Student_id = Student_id;

    }
    @Override

  public String toString(){
    return super.toString()+ "\nStudent ID: "+ this.Student_id;

  }   

    
}
