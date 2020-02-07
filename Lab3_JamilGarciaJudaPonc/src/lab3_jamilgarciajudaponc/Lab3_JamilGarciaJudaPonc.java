package lab3_jamilgarciajudaponc;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JamilGarciaJudaPonc {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println(" 1. Persona");
            System.out.println(" 2. Equipo ");
            System.out.println(" 3. Jugadas");
            System.out.println(" 4. Salir");
            int opcion=leer.nextInt();
            switch (opcion) {
                case 1:// persona
                    
                    break;
                    
                case 2:// Equipo
                    
                    
                    break;
                    
                    
                case 3:// Jugadas
                    
                    break;
                    
                case 4:// Salir
                    
                    System.exit(4);
                    break;
                default:
                    System.out.println(" Opcion incorrecta");
            }

        }

    }

}
