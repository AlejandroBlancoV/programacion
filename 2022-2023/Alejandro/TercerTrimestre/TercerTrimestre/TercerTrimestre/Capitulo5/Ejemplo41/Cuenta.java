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

    public void Retirar(float cantidad){
        if(Saldo>=cantidad){
            Saldo-=cantidad;
            NumeroRetiros++;
        }
    
        else
        System.out.println("no puede retirar dicha cantidad");
    }

    public void calcularInteres(){
        float InteresMensual= Saldo*(TasaAnual/12);
        Saldo+=InteresMensual;
    }

    public void extractoMensual(){
        Saldo-=Comision;
        calcularInteres();
    }

    

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return NumeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        NumeroConsignaciones = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return NumeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        NumeroRetiros = numeroRetiros;
    }

    public float getTasaAnual() {
        return TasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        TasaAnual = tasaAnual;
    }

    public float getComision() {
        return Comision;
    }

    public void setComision(float comision) {
        Comision = comision;
    }

    @Override
    public String toString() {
        return "Cuenta [Saldo=" + Saldo + ", NumeroConsignaciones=" + NumeroConsignaciones + ", NumeroRetiros="
                + NumeroRetiros + ", TasaAnual=" + TasaAnual + ", Comision=" + Comision + "]";
    }

    
}
