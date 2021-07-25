package operaciones;

import java.util.Scanner;

public class ClasePadre {

    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    //Metodo Para pedir los datos al usuario
    public void PedirDatos() {
        System.out.print("Ingrese el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        valor2 = entrada.nextInt();

    }

    //Metodo para mostrar el resultado
    public void MostrarResultado() {
        System.out.println(resultado);
    }

    
}
