import java.util.ArrayList;
import java.util.List;

public class RegistroEstudiantes {
      private List<Estudiante> estudiantes;

    public RegistroEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        for (Estudiante e : estudiantes) {
            if (e.obtenerCodigo().equals(estudiante.obtenerCodigo())) {
                System.out.println("El estudiante ya está registrado.");
                return;
            }
        }
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado exitosamente.");
    }

    public void eliminarEstudiante(String codigo) {
        Estudiante estudianteAEliminar = null;
        for (Estudiante e : estudiantes) {
            if (e.obtenerCodigo().equals(codigo)) {
                estudianteAEliminar = e;
                break;
            }
        }
        if (estudianteAEliminar != null) {
            estudiantes.remove(estudianteAEliminar);
            System.out.println("Estudiante eliminado exitosamente.");
        } else {
            System.out.println("No se encontró ningún estudiante con el código especificado.");
        }
    }

    public void listarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public List<Estudiante> buscarEstudiantes(String filtro) {
        List<Estudiante> resultados = new ArrayList<>();
        for (Estudiante e : estudiantes) {
            if (e.obtenerNombre().contains(filtro) || e.obtenerCodigo().contains(filtro) || e.obtenerCarrera().contains(filtro)) {
                resultados.add(e);
            }
        }
        return resultados;
    }
    
}
