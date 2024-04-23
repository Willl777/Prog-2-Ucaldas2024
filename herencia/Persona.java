public class Persona{
protected String user_name = "";
protected String LastName = "";
protected String Document = "";
protected String gender="";
public Persona(String user_name, String lastName, String document, String gender) {
    this.user_name = user_name;
    this.LastName = lastName;
    this.Document = document;
    this.gender = gender;
}
public String getUser_name() {
    return user_name;
}
public String getLastName() {
    return LastName;
}
public String getDocument() {
    return Document;
}
public String getGender() {
    return gender;
}
public void setUser_name(String user_name) {
    this.user_name = user_name;
}
public void setLastName(String lastName) {
    LastName = lastName;
}
public void setDocument(String document) {
    Document = document;
}
public void setGender(String gender) {
    this.gender = gender;
}

@Override
public String toString() {
    return "Persona [user_name=" + user_name + ", LastName=" + LastName + ", Document=" + Document + ", gender="   + gender + "]";


}


}