import javax.swing.*;
import java.util.Scanner;

public class Alumno {
    private float modulo1;
    private float modulo2;
    private float modulo3;
    private float modulo4;
    private float modulo5;
    private float modulo6;

    private float notamedia;

    /**
     * para crear un alumno
     */
    public void alumno (String nombre,float modulo1,float modulo2,float modulo3,float modulo4,float modulo5,float modulo6){
        this.modulo1=modulo1;
        this.modulo2=modulo2;
        this.modulo3=modulo3;
        this.modulo4=modulo4;
        this.modulo5=modulo5;
        this.modulo6=modulo6;
        int i=0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca su nota de cada modulo en orden por favor");
            modulo1 = sc.nextFloat();
            modulo2 = sc.nextFloat();
            modulo3 = sc.nextFloat();
            modulo4 = sc.nextFloat();
            modulo5 = sc.nextFloat();
            modulo6 = sc.nextFloat();
            double media = (modulo1 + modulo2 + modulo3 + modulo4 + modulo5 + modulo6) / 6;
            System.out.println("la nota media es igual a: " + media);
        }while (1=3);
    }
}
