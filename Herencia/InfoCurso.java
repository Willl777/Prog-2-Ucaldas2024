public class InfoCurso {
    private String nombre_seminario = "";
    private int cantidad_horas = 0;
    private Teacher informacion_profesor;

    public InfoCurso(String nombre_seminario, int cantidad_horas, Teacher informacion_profesor) {
        this.nombre_seminario = nombre_seminario;
        this.cantidad_horas = cantidad_horas;
        this.informacion_profesor = informacion_profesor;
    }
    
    //Getters
    public String getNombre_seminario() {
        return nombre_seminario;
    }

    public int getCantidad_horas() {
        return cantidad_horas;
    }

    public Teacher getInformacion_profesor() {
        return informacion_profesor;
    }

    //Setters
    public void setNombre_seminario(String nombre_seminario) {
        this.nombre_seminario = nombre_seminario;
    }

    public void setCantidad_horas(int cantidad_horas) {
        this.cantidad_horas = cantidad_horas;
    }

    public void setInformacion_profesor(Teacher informacion_profesor) {
        this.informacion_profesor = informacion_profesor;
    }
    

}