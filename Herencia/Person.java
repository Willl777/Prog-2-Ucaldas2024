public class Person {

protected String name;
protected String numer;
protected String email;
public Person(String name, String numer, String email) {
    this.name = name;
    this.numer = numer;
    this.email = email;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name; 
}
public String getNumer() {
    return numer;
}
public void setNumer(String numer) {
    this.numer = numer;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
@Override
public String toString() {
    return "Person [name=" + name + ", numer=" + numer + ", email=" + email + "]";
}


}