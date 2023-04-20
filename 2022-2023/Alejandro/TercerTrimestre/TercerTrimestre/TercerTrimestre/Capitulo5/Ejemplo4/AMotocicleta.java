package Capitulo5.Ejemplo4;

import java.awt.Color;

public class AMotocicleta extends AbstractoVehiculo {

// Los mismos constructores y metodos que en la clase
// Motocicleta
// Tambien cambiamos el nombre de los constructores

public float Impuesto(){
return (super.DimeCilindrada()/30 +
super.DimePotencia()*30);
}
}
