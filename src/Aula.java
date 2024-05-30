import java.util.List;

public class Aula {
    private Integer numeroAula;
    private Integer capacidad;
    private List<Reserva> reservas;

    public Aula() {
    }
    public Aula(Integer numeroAula, Integer capacidad, List<Reserva> reservas) {
        this.numeroAula = numeroAula;
        this.capacidad = capacidad;
        this.reservas = reservas;
    }

}