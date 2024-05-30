import java.time.LocalTime; //Formato 15:30

public class Evento {
    private Integer codEvento;
    private String descripcion;
    private Integer cantMaxima;
    private String tipoEvento;

    public Evento(Integer codEvento, String descripcion, Integer cantMaxima, String tipoEvento) {
        this.codEvento = codEvento;
        this.descripcion = descripcion;
        this.cantMaxima = cantMaxima;
        this.tipoEvento = tipoEvento;
    }
    public Evento() {
    }

}

