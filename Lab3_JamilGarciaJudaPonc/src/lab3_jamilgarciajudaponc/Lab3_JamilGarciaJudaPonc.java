package lab3_jamilgarciajudaponc;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JamilGarciaJudaPonc {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Jugador> jugadores = new ArrayList();

    public static void main(String[] args) {

        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println(" 1. Persona");
            System.out.println(" 2. Equipo ");
            System.out.println(" 3. Jugadas");
            System.out.println(" 4. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:// persona
                    System.out.println(" 1. Crear Jugador");
                    System.out.println(" 2. Modificar Atributos Del jugador");
                    System.out.println(" 3. Eliminar Jugador");
                    int player = leer.nextInt();
                    switch (player) {
                        case 1:// crear Jugador
                            System.out.print(" Ingrese nombre del jugador: ");
                            String nombre = leer.next();
                            System.out.print(" Ingrese apellido del jugador");
                            String apellido = leer.next();
                            System.out.println(" Ingrese años: ");
                            int anios = leer.nextInt();
                            System.out.print(" Ingrese salario: ");
                            double salario = leer.nextDouble();
                            System.out.print(" Ingrese numero de camisa: ");
                            int camisa = leer.nextInt();
                            System.out.print(" Ingrese cuantos tiros de 3 ha realizado: ");
                            int tiros3 = leer.nextInt();
                            System.out.print(" Ingrese ingrese defensa: ");
                            int defensa = leer.nextInt();
                            System.out.print(" Ingrese tiro de media: ");
                            int media = leer.nextInt();
                            System.out.print(" Ingrese rebotes: ");
                            int rebotes = leer.nextInt();
                            System.out.print(" Ingrese bandeja: ");
                            int bandeja = leer.nextInt();
                            System.out.print(" Ingrese numero de pases: ");
                            int pases = leer.nextInt();
                            System.out.print(" Ingrese posteo: ");
                            int posteo = leer.nextInt();
                            System.out.println(" Seleccione la posicion del jugador: ");
                            System.out.println(" 1. Base");
                            System.out.println(" 2. Escolta");
                            System.out.println(" 3. Alero");
                            System.out.println(" 4. Alero-Pivot");
                            System.out.println(" 5. Centro");
                            int posPlayer = leer.nextInt();
                            double altura = 0.0;
                            switch (posPlayer) {
                                case 1://base
                                    altura = 1.93;
                                    jugadores.add(new Base(altura, camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                    System.out.println(" Jugador (Base) ha sido agregado con exito");
                                    System.out.println();
                                case 2:// escolta
                                    altura = 2.00;
                                    jugadores.add(new Escolta(altura,camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                    System.out.println(" Jugador (Escolta) ha sido agregado con exito");
                                    System.out.println();
                                    
                                    break;

                                case 3:// alero

                                    altura = 2.05;
                                    jugadores.add(new Alero(altura,camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                    System.out.println(" Jugador (Alero) ha sido agregado con exito");
                                    System.out.println();
                                    break;

                                case 4:// alero-pivot
                                    altura = 2.10;
                                    jugadores.add(new AleroPivot(altura,camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                    System.out.println(" Jugador (Alero-Pivot) ha sido agregado con exito");
                                    System.out.println();

                                    break;

                                case 5:// Centro
                                    altura = 2.13;
                                    jugadores.add(new Centro(altura,camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                    System.out.println(" Jugador (Centro) ha sido agregado con exito");
                                    System.out.println();

                                    break;
                                default:
                                    System.out.println(" Opcion incorrecta");
                                    System.out.println();
                            }

                          

                            break;

                        case 2:// Modificar atributos del jugador

                            break;

                        case 3:// Eliminar Jugador

                            break;
                        default:
                            System.out.println(" Opcion incorrecta");
                            System.out.println();
                    }

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
