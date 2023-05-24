package Capitulo5.Ejemplo83;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton Cilindro;
    private JButton Piramide;
    private JButton Esfera;

    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras");
        setSize(350, 160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    private void inicio(){
        contenedor= getContentPane();
        contenedor.setLayout(null);

        Cilindro = new JButton("Cilindro");
        Cilindro.setBounds(20, 50, 80, 23);
        Cilindro.addActionListener(this);

        Esfera = new JButton("Esfera");
        Esfera.setBounds(120, 50, 80, 23);
        Esfera.addActionListener(this);


        Piramide = new JButton("Pirámide");
        Piramide.setBounds(220, 50, 80, 23);
        Piramide.addActionListener(this);

        contenedor.add(Cilindro);
        contenedor.add(Esfera);
        contenedor.add(Piramide);
    }
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Cilindro) {
            VentanaCilindro cilindro= new VentanaCilindro();
            cilindro.setVisible(true);
        } else if (e.getSource() == Piramide) {
            VentanaPiramide piramide= new VentanaPiramide();
            piramide.setVisible(true);
        } else if (e.getSource() == Esfera) {
            VentanaEsfera esfera= new VentanaEsfera();
            esfera.setVisible(true);
        }
    }

}

