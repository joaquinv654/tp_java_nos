public class CursoExtension {
    private String codigo;
    private String descripcion; 
    private Integer cantInscriptos; 
    private Integer cantClases;
    private Float costoCurso;

    public CursoExtension(String codigo, String descripcion, Integer cantInscriptos, Integer cantClases,
            Float costoCurso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantInscriptos = cantInscriptos;
        this.cantClases = cantClases;
        this.costoCurso = costoCurso;
    }
    public CursoExtension() {
    }

}