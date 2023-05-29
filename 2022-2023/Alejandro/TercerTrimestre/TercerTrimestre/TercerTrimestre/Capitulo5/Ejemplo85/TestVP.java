package Capitulo5.Ejemplo85;

public class TestVP {
    public static void main(String[] args) {
    VentanaPrincipal miVentanaPrincipal;
    Hotel trivago= new Hotel();
        miVentanaPrincipal= new VentanaPrincipal(trivago);
        miVentanaPrincipal.setVisible(true);
        miVentanaPrincipal.setResizable(false );
    }
    
}
