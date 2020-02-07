package lab3_jamilgarciajudaponc;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JamilGarciaJudaPonc {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Jugador> persona = new ArrayList();

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
                                    persona.add(new Base(altura, camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                    System.out.println(" Jugador (Base) ha sido agregado con exito");
                                    System.out.println();
                                    
                                    break;
                                case 2:// escolta
                                    altura = 2.00;
                                    persona.add(new Escolta(altura, camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                    System.out.println(" Jugador (Escolta) ha sido agregado con exito");
                                    System.out.println();

                                    break;

                                case 3:// alero

                                    altura = 2.05;
                                    persona.add(new Alero(altura, camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                    System.out.println(" Jugador (Alero) ha sido agregado con exito");
                                    System.out.println();
                                    break;

                                case 4:// alero-pivot
                                    altura = 2.10;
                                    persona.add(new AleroPivot(altura, camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                    System.out.println(" Jugador (Alero-Pivot) ha sido agregado con exito");
                                    System.out.println();

                                    break;

                                case 5:// Centro
                                    altura = 2.13;
                                    persona.add(new Centro(altura, camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                    System.out.println(" Jugador (Centro) ha sido agregado con exito");
                                    System.out.println();

                                    break;
                                default:
                                    System.out.println(" Opcion incorrecta");
                                    System.out.println();
                            }

                            break;

                        case 2:// Modificar atributos de persona
                            if (persona.isEmpty()) {
                                System.out.println(" No hay persona Registradas hasta el momento");
                                System.out.println();
                                break;

                            }
                            System.out.println(" Seleccione que desea modificar: ");
                            System.out.println(" 1. Atributos del Jugador ");
                            System.out.println(" 2. Atributps del Medico");
                            System.out.println(" 3. Atributos de dueño del equipo");
                            System.out.println(" 4. Atributos del Entrenador");
                            int hijas = leer.nextInt();
                            switch (hijas) {
                                case 1://Modificar atributos de jugador
                                    System.out.println(" Seleccione que desea modificar del jugador");
                                    System.out.println(" 1. Nombre");
                                    System.out.println(" 2. Apellido");
                                    System.out.println(" 3. Años");
                                    System.out.println(" 4. Salario");
                                    System.out.println(" 5. Numero de camisa");
                                    System.out.println(" 6. Tiros de 3");
                                    System.out.println(" 7. Defensa ");
                                    System.out.println(" 8. Tiro de media");
                                    System.out.println(" 9. Rebote");
                                    System.out.println(" 10. Bandeja");
                                    System.out.println(" 11. Pases");
                                    System.out.println(" 12. posteo");
                                    System.out.println(" 13. Altura");
                                    int modifyy = leer.nextInt();
                                    switch (modifyy) {
                                        case 1:// modificar Nombre
                                            String salidass = "";
                                            for (Object o : persona) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + persona.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            System.out.print(" Ingrese posicion para modificar el nombre: ");
                                            int posNombre = leer.nextInt();
                                            boolean name = false;
                                            for (int i = 0; i < persona.size(); i++) {
                                                if (posNombre == i) {
                                                    name = false;
                                                } else {
                                                    name = true;
                                                }

                                            }
                                            if (name == false) {
                                                System.out.print(" Ingrese un nuevo nombre: ");
                                                String newNombre = leer.next();
                                                persona.get(posNombre).setNombre(newNombre);
                                                System.out.println(" Nombre del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 2:// modificar Apellido

                                            break;

                                        case 3:// modificar Años

                                            break;

                                        case 4:// modificar salario

                                            break;

                                        case 5:// modificar numero de camisa

                                            break;

                                        case 6:// modificar tiro de 3

                                            break;

                                        case 7:// modificar Defensa

                                            break;

                                        case 8:// modificar Tiro de media

                                            break;

                                        case 9:// modificar rebote

                                            break;

                                        case 10:// modificar bandeja

                                            break;

                                        case 11:// modificar pases

                                            break;

                                        case 12:// modificar posteo

                                            break;

                                        case 13:// modificar altura

                                            break;

                                        default:

                                            System.out.println(" Opcion Incorrecta");
                                            System.out.println();
                                    }

                                    break;

                                case 2://Modificar atributos de medicos

                                    break;

                                case 3://Modificar atributos del dueño de equipo

                                    break;

                                case 4://Modificar atributos del entrenador

                                    break;
                                default:
                                    System.out.println(" opcion incorrecta");
                                    System.out.println();
                            }

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
