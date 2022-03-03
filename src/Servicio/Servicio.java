package Servicio;

import Entidades.NIF;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    NIF nif = new NIF();

    public NIF crearNif() {

        System.out.print("Ingrese su DNI: ");
        nif.setDNI(leer.nextInt());
        System.out.println(nif.getDNI());

        return nif;
    }

    public void calcularletra(NIF nif) {
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println(letra[3]);

        int let = nif.getDNI() % 23;

        nif.setLetra(letra[let]);

        System.out.println(nif.getDNI() + "-" + nif.getLetra());

    }

    public NIF mostrar() {

        System.out.println("Su NIF es: " + nif.getDNI() + "-" + nif.getLetra());

        return null;
    }

}
