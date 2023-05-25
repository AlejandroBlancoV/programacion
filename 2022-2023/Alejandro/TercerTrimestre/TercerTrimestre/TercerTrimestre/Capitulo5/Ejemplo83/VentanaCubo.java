package Capitulo5.Ejemplo83;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VentanaCubo extends JFrame implements ActionListener{
    private Container contenedor;

	private JLabel lado, volumen, superficie;
	// Campos de texto a ingresar
	private JTextField campoRadio, campoAltura, campoLado;
	// Botón para realizar los cálculos numéricos
	private JButton calcular;

public VentanaCubo(){
    inicio();
    setTitle("Cubo");
    setSize(280, 210);
    setLocationRelativeTo(null);
    setResizable(false);
}


private void inicio(){
    contenedor=getContentPane();
    contenedor.setLayout(null);

    lado=new JLabel();
    lado.setText("Lado (cm):");
    lado.setBounds(20, 20, 135, 23);

    campoLado= new JTextField();
    campoLado.setBounds(100, 20, 135, 23);

    calcular= new JButton();
    calcular.setText("Calcular");
    calcular.setBounds(100, 80, 135, 23);
    calcular.addActionListener(this);

    volumen= new JLabel();
    volumen.setText("Volumen (cm3):");
    volumen.setBounds(20, 110, 135, 23);

    superficie= new JLabel();
    superficie.setText("superficie (cm2):");
    superficie.setBounds(20, 140, 135, 23);

    contenedor.add(lado);
    contenedor.add(campoLado);
    contenedor.add(calcular);
    contenedor.add(volumen);
    contenedor.add(superficie);
    


}

    @Override
    public void actionPerformed(ActionEvent e) {
       
		boolean error = false; 
		double lado = 0;
		try {
			
			lado = Double.parseDouble(campoLado.getText());
			Cubo cubo= new Cubo(lado);
			
			// Se calcula y muestra el volumen
			volumen.setText("Volumen (cm3): " + String.format("%.2f", cubo.calcularVolumen()));
			// Se calcula y muestra la superficie
			superficie.setText("Superficie (cm2): " + String.format("%.2f", cubo.calcularSuperficie()));
		} catch (Exception j) {
			error = true; // Si ocurre una excepción
		} finally {
			if (error) { /* Si ocurre una excepción, se muestra un mensaje de error */
				JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
    }
    
}
