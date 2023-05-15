package Deportes;

public class PartidoBaloncestoEuroLiga implements PartidoBaloncesto{
    String equipoLocal;
    String equipoVisitante;
    int puntosEquipoLocal;
    int puntosEquipoVisitante;
    @Override
    public void setEquipoLocal(String nombreEquipo) {
       this.equipoLocal=nombreEquipo;
    }
    @Override
    public void setEquipoVisitante(String nombreEquipo) {
        this.equipoVisitante=nombreEquipo;

    }
    @Override
    public void setCestasEquipoLocal(int marcador) {
        this.puntosEquipoLocal=marcador;
    }
    @Override
    public void setCestasEquipoVisitante(int marcador) {
       this.puntosEquipoVisitante=marcador;
    }
    @Override
    public String toString() {
        return "PartidoBaloncestoEuroLiga [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
                + ", puntosEquipoLocal=" + puntosEquipoLocal + ", puntosEquipoVisitante=" + puntosEquipoVisitante + "]";
    }

    
}
