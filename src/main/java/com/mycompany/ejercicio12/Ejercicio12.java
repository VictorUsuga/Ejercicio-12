
package com.mycompany.ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
        double RFuente, SBruto, SNeto; 
        SBruto = 48*5000;
        RFuente = SBruto*0.125;
        SNeto = SBruto-RFuente;
        System.out.println("El salario bruto es: " + SBruto);
        System.out.println("La retencion en la fuente es de: " + RFuente);
        System.out.println("El salario neto es: " + SNeto);
    }
}
