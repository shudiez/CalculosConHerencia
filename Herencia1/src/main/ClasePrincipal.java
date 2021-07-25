package main;

import operaciones.ClaseHija_Suma;
import operaciones.ClaseHija_Resta;

public class ClasePrincipal {

    public static void main(String[] args) {

        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Sumar();
        System.out.print("El rsultado de la suma es: ");
        mensajeroSuma.MostrarResultado();

        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Restar();
        System.out.print("El rsultado de la resta es: ");
        mensajeroResta.MostrarResultado();

    }

}
