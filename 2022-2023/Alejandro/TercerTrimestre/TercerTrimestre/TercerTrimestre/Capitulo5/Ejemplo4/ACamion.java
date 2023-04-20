package Capitulo5.Ejemplo4;

import java.awt.Color;

public class ACamion extends AbstractoVehiculo {

// Los mismos constructores y metodos que en la clase
// Camion
// Tambien cambiamos el nombre de los constructores

public float Impuesto(){
return (super.DimeCilindrada()/30 + super.DimePotencia()*20 + super.DimeNumRuedas()*20 + DimeNumeroDeEjes()*50);
}

}
