package Deportes;

public class PartidoTenisMontecarlo implements PartidoTenis{
    String equipoLocal;
    String equipoVisitante;
    int juegosEquipoLocal;
    int juegosEquipoVisitante;
    @Override
    public void setEquipoLocal(String nombreEquipo) {
        this.equipoLocal=nombreEquipo;
    }
    @Override
    public void setEquipoVisitante(String nombreEquipo) {
        this.equipoVisitante=nombreEquipo;
    }
    @Override
    public void setJuegosLocal(int juegos) {
        this.juegosEquipoLocal=juegos;
    }
    @Override
    public void setJuegosVisitante(int juegos) {
        this.juegosEquipoVisitante=juegos;
       
    }
    @Override
    public String toString() {
        return "PartidoTenisMontecarlo [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
                + ", juegosEquipoLocal=" + juegosEquipoLocal + ", juegosEquipoVisitante=" + juegosEquipoVisitante + "]";
    }


    
}
