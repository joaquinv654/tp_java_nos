import java.time.LocalDate; //Formato: 2024-05-27
import java.time.LocalTime; //Formato 15:30

public class Reserva {
    private int codigoReserva;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String tipoReserva;
    private String quienReserva;
    public Reserva(int codigoReserva, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, String tipoReserva,
            String quienReserva) {
        this.codigoReserva = codigoReserva;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipoReserva = tipoReserva;
        this.quienReserva = quienReserva;
    }
    public Reserva() {
    }
    

}
