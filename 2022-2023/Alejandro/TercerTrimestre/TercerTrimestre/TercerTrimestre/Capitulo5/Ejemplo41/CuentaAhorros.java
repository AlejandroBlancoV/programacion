package Capitulo5.Ejemplo41;

import javax.swing.text.html.parser.Element;

public class CuentaAhorros extends Cuenta{

    private boolean Activa;

    public CuentaAhorros(float TasaAnual, float Saldo) {
        super(TasaAnual, Saldo);
        //TODO Auto-generated constructor stub

        if(this.Saldo>10000)
        this.Activa=true;
        else
        this.Activa=false;
    }
    

    @Override
    public void Consignar(float cantidad) {
        if(estaActiva())
        super.Consignar(cantidad);
        else
        System.out.println("la cuenta no está activa");
    }

    @Override
    public void Retirar(float cantidad) {
        if(estaActiva())
        super.Retirar(cantidad);
        else
        System.out.println("la cuenta no está activa");
    }

    @Override
    public void extractoMensual() {
        if(estaActiva()){
            if(NumeroRetiros>4){
                Comision+=1000*(NumeroRetiros-4);
                super.extractoMensual();
            }
            else{
                super.extractoMensual();
            }
        }
        else{
            System.out.println("la cuenta no está activa");
    
            }
       
    }


    @Override
    public String toString() {
        return "CuentaAhorros [Activa=" + Activa + "Saldo=" + Saldo + ", NumeroConsignaciones=" + NumeroConsignaciones + ", NumeroRetiros="
        + NumeroRetiros + ", TasaAnual=" + TasaAnual + ", Comision=" + Comision + "]";
    }

    
public boolean estaActiva(){
    return Activa;
}
}

