package Capitulo5.Ejemplo41;

public class CuentaCorriente extends Cuenta{

   public CuentaCorriente(float TasaAnual, float Saldo) {
        super(TasaAnual, Saldo);
        //TODO Auto-generated constructor stub
    }

float Sobregiro=0;

   @Override
   public void Retirar(float cantidad) {
       if(Saldo>=cantidad){
        Saldo-=cantidad;
        NumeroRetiros++;
       }
       else{
        Sobregiro=cantidad-Saldo;
        Saldo=0;
        NumeroRetiros++;
       }

   }

   @Override
   public void Consignar(float cantidad) {
      if(Sobregiro>0){
        if(cantidad-Sobregiro>=0){
            super.Consignar(cantidad-Sobregiro);
        Sobregiro=0;
        }
        else{
            Sobregiro-=cantidad;
        }
        
      }
      else{
        super.Consignar(cantidad);
      }

   }

@Override
public String toString() {
    return "CuentaCorriente [Sobregiro=" + Sobregiro + "Saldo=" + Saldo + ", NumeroConsignaciones=" + NumeroConsignaciones + ", NumeroRetiros="
    + NumeroRetiros + ", TasaAnual=" + TasaAnual + ", Comision=" + Comision + "]";
}

   

    
}
