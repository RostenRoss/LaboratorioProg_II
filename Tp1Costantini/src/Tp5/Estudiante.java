package main.com;

public class Estudiante {
    private String nombre;
    private Long nrEstudiante;
    private Double notaMedia;
    private Facultad facultad;

    public Estudiante(String nombre, Long nrEstudiante, Double notaMedia, Facultad facultad){
        this.nombre=nombre;
        this.nrEstudiante=nrEstudiante;
        this.notaMedia=notaMedia;
        this.facultad=facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNrEstudiante() {
        return nrEstudiante;
    }

    public void setNrEstudiante(Long nrEstudiante) {
        this.nrEstudiante = nrEstudiante;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }


    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
   
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nrEstudiante=" + nrEstudiante +
                ", notaMedia=" + notaMedia +
                ", facultad='" + facultad.getNombreFacultad()+"'}";
    }


    
}
