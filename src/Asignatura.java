import java.time.LocalDate; //Formato: 2024-05-27
import java.time.LocalTime; //Formato 15:30

public class Asignatura {
    private String codAsignatura;
    private String nombreAsignatura;
    private LocalDate fechaInicioCursada;
    private LocalDate fechaFinCursada;
    private String dia;
    private LocalTime horarioInicio;
    private LocalTime horarioFin;
    private Integer cantAlumInscriptos;

    public Asignatura(String codAsignatura, String nombreAsignatura, LocalDate fechaInicioCursada,
            LocalDate fechaFinCursada, String dia, LocalTime horarioInicio, LocalTime horarioFin,
            Integer cantAlumInscriptos) {
        this.codAsignatura = codAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.fechaInicioCursada = fechaInicioCursada;
        this.fechaFinCursada = fechaFinCursada;
        this.dia = dia;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
        this.cantAlumInscriptos = cantAlumInscriptos;
    }
    public Asignatura() {
    }
    
}
