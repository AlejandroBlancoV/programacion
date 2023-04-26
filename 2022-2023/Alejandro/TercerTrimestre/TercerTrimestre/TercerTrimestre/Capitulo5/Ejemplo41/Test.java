package Capitulo5.Ejemplo41;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Test {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial");

        float saldoInicialAhorros= sc.nextFloat();
        System.out.println("Ingrese tasa de interes");
        float tasaAhorros= sc.nextFloat();

        CuentaAhorros cuenta1= new CuentaAhorros(tasaAhorros, saldoInicialAhorros);
        System.out.println("Ingrese cantidad a consignar");
        float cantidadDepositar
    
    
}
}