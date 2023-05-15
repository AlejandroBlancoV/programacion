package Deportes;

public class Test {
    public static void main(String[] args) {
        PartidoFutbolLigaEspañola malo= new PartidoFutbolLigaEspañola();
        malo.setEquipoLocal("Celta");
        malo.setEquipoVisitante("Valencia");
        malo.setGolesEquipoLocal(1);
        malo.setGolesEquipoVisitante(2);
        System.out.println("Tiempo de juego: "+PartidoFutbol.duracionPartidoFutbol);
       System.out.println(malo.toString());


       PartidoBaloncestoEuroLiga pbel= new PartidoBaloncestoEuroLiga();
       pbel.setEquipoLocal("Partizan");
       pbel.setEquipoVisitante("Barcelona");
       pbel.setCestasEquipoLocal(89);
       pbel.setCestasEquipoVisitante(92);
       System.out.println("Tiempo de juego: "+PartidoBaloncesto.duracionPartidoBaloncesto);
       System.out.println(pbel.toString());


       PartidoTenisMontecarlo ptm= new PartidoTenisMontecarlo();
       ptm.setEquipoLocal("Angela Merkel");
       ptm.setEquipoVisitante("GYiocobitch");
       ptm.setJuegosLocal(3);
       ptm.setJuegosVisitante(5);
       System.out.println(ptm.toString());
       
        
    

    }
}
