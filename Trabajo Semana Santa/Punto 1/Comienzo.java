import java.util.List;


public class Comienzo {
    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();

        // Agregar algunos estudiantes de ejemplo
        registro.agregarEstudiante(new Estudiante("Juan Perez", "1001", "Ingeniería", 4.5));
        registro.agregarEstudiante(new Estudiante("Maria Rodriguez", "1002", "Ciencias de la Computación", 4.2));
        registro.agregarEstudiante(new Estudiante("Carlos Gonzalez", "1003", "Arquitectura", 4.0));

        // Listar estudiantes
        System.out.println("Estudiantes registrados:");
        registro.listarEstudiantes();

        // Buscar estudiantes
        System.out.println("\nBuscando estudiantes con filtro 'Maria':");
        List<Estudiante> resultados = registro.buscarEstudiantes("Maria");
        for (Estudiante e : resultados) {
            System.out.println(e);
        }

        // Eliminar un estudiante
        registro.eliminarEstudiante("1002");

        // Listar estudiantes después de eliminar
        System.out.println("\nEstudiantes registrados después de eliminar:");
        registro.listarEstudiantes();
    }
}
