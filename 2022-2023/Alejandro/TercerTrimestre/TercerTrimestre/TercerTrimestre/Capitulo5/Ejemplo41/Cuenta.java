package Capitulo5.Ejemplo41;

public class Cuenta {
    protected float Saldo;
    protected int NumeroConsignaciones=0;
    protected int NumeroRetiros=0;
    protected float TasaAnual;
    protected float Comision=0;

    public Cuenta(float TasaAnual, float Saldo){
        this.Saldo=Saldo;
        this.TasaAnual=TasaAnual;
    }

    public void Consignar(float cantidad){
        Saldo+=cantidad;
        NumeroConsignaciones++;
    }

    public void Retirar(int cantidad){
        if(Saldo>=cantidad){
            Saldo-=cantidad;
            NumeroRetiros++;
        }
    
        else
        System.out.println("no puede retirar dicha cantidad");
    }

    public calcularInteres(){
        float TasaMensual= TasaAnual/12;
        float InteresMensual= Saldo*TasaMensual;
        Saldo+=InteresMensual;
    }
}
