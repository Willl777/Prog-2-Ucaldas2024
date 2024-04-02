class Estudiante {
    private String nombre;
    private String codigo;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String codigo, String carrera, double promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public String obtenerCarrera() {
        return carrera;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public String toString() {
        return "Estudiante {" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }
} 
    

