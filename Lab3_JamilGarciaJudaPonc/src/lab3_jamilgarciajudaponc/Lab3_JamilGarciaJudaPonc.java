package lab3_jamilgarciajudaponc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab3_JamilGarciaJudaPonc {

    static Scanner leer = new Scanner(System.in);
    static Random ran = new Random();

    static ArrayList<Persona> jugadores = new ArrayList();
    static ArrayList agenteLibre = new ArrayList();

    static ArrayList<Medico> medicos = new ArrayList();
    static ArrayList<Entrenador> entrenadores = new ArrayList();
    static ArrayList<DuenioDeEquipo> duenio = new ArrayList();
    static ArrayList lisjug = new ArrayList();
    static ArrayList lismed = new ArrayList();
    static ArrayList lisDue = new ArrayList();
    static ArrayList lisent = new ArrayList();

    public static void main(String[] args) {

        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println(" 1. Persona");
            System.out.println(" 2. Equipo ");
            System.out.println(" 3. Jugadas");
            System.out.println(" 4. Simulacion");
            System.out.println(" 5. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:// persona
                    System.out.println(" 1. Crear Persona");
                    System.out.println(" 2. Modificar Atributos de persona");
                    System.out.println(" 3. Despedir persona");
                    int player = leer.nextInt();
                    switch (player) {
                        case 1:// crear persona
                            System.out.println(" 1. Crear Jugador");
                            System.out.println(" 2. Crear Medico");
                            System.out.println(" 3. Crear Dueño de equipo");
                            System.out.println(" 4. Crear Entrenador");
                            int personas = leer.nextInt();
                            switch (personas) {
                                case 1:// crear jugador
                                    System.out.print(" Ingrese nombre del jugador: ");
                                    String nombre = leer.next();
                                    System.out.print(" Ingrese apellido del jugador: ");
                                    String apellido = leer.next();
                                    System.out.print(" Ingrese años: ");
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

                                            break;
                                        case 2:// escolta
                                            altura = 2.00;
                                            jugadores.add(new Escolta(altura, camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                            System.out.println(" Jugador (Escolta) ha sido agregado con exito");
                                            System.out.println();

                                            break;

                                        case 3:// alero

                                            altura = 2.05;
                                            jugadores.add(new Alero(altura, camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                            System.out.println(" Jugador (Alero) ha sido agregado con exito");
                                            System.out.println();
                                            break;

                                        case 4:// alero-pivot
                                            altura = 2.10;
                                            jugadores.add(new AleroPivot(altura, camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                            System.out.println(" Jugador (Alero-Pivot) ha sido agregado con exito");
                                            System.out.println();

                                            break;

                                        case 5:// Centro
                                            altura = 2.13;
                                            jugadores.add(new Centro(altura, camisa, tiros3, defensa, media, rebotes, bandeja, pases, posteo, nombre, apellido, anios, salario));
                                            System.out.println(" Jugador (Centro) ha sido agregado con exito");
                                            System.out.println();

                                            break;
                                        default:
                                            System.out.println(" Opcion incorrecta");
                                            System.out.println();
                                    }
                                    break;

                                case 2:// crear medico
                                    System.out.print(" Ingrese nombre del medico: ");
                                    String nombree = leer.next();
                                    System.out.print(" Ingrese apellido del medico: ");
                                    String apellidoo = leer.next();
                                    System.out.print(" Ingrese años: ");
                                    int anioss = leer.nextInt();
                                    System.out.print(" Ingrese salario: ");
                                    double salarioo = leer.nextDouble();
                                    System.out.print(" Ingrese colegio: ");
                                    String colegio = leer.next();
                                    System.out.println(" Seleccione que tipo de medico: ");
                                    System.out.println(" 1. Medico general");
                                    System.out.println(" 2. Medico Cirujano");
                                    System.out.println(" 3. Medico teraputa");
                                    int medicos = leer.nextInt();
                                    switch (medicos) {
                                        case 1:// medico general

                                            System.out.println("");
                                            int nEnfermedades = 0;
                                            jugadores.add(new MedGeneral(nEnfermedades, colegio, nombree, apellidoo, anioss, salarioo));

                                            System.out.println(" Medico general agregado con exito");
                                            System.out.println();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (jugadores.get(i) instanceof Medico) {
                                                    System.out.println(jugadores.get(i));

                                                }
                                            }
                                            break;

                                        case 2:// medico cirujano
                                            int nCirujias = 0;
                                            jugadores.add(new MedCirujano(nCirujias, colegio, nombree, apellidoo, anioss, salarioo));
                                            System.out.println(" Medico cirujano agregado con exito");
                                            System.out.println();

                                            break;

                                        case 3://medico terapeuta
                                            int terapias = 0;
                                            jugadores.add(new MedTera(terapias, colegio, nombree, apellidoo, anioss, salarioo));
                                            System.out.println(" Medico terapeuta agregado con exito");
                                            System.out.println();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (jugadores.get(i) instanceof Medico) {
                                                    System.out.println(jugadores.get(i));

                                                }

                                            }

                                            break;

                                        default:
                                            throw new AssertionError();
                                    }

                                    break;

                                case 3:// crear dueño de equipo
                                    System.out.print(" Ingrese nombre del dueño: ");
                                    String nombreee = leer.next();
                                    System.out.print(" Ingrese apellido del dueño: ");
                                    String apellidooo = leer.next();
                                    System.out.print(" Ingrese años: ");
                                    int aniosss = leer.nextInt();
                                    System.out.print(" Ingrese salario: ");
                                    double salariooo = leer.nextDouble();
                                    System.out.print(" Ingrese net Worth");
                                    int net = leer.nextInt();
                                    System.out.println(" Ingrese ciudad: ");
                                    String ciudad = leer.next();
                                    jugadores.add(new DuenioDeEquipo(net, ciudad, nombreee, apellidooo, aniosss, salariooo));
                                    for (int i = 0; i < jugadores.size(); i++) {
                                        if (jugadores.get(i) instanceof DuenioDeEquipo) {
                                            System.out.println(jugadores.get(i));

                                        }

                                    }

                                    break;

                                case 4:// crear entrenador
                                    String desicion = "";
                                    System.out.print(" Ingrese nombre del entrenador: ");
                                    String name = leer.next();
                                    System.out.print(" Ingrese apellido del dueño: ");
                                    String apell = leer.next();
                                    System.out.print(" Ingrese años: ");
                                    int year = leer.nextInt();
                                    System.out.println(" Fue jugador [si/no]: ");
                                    System.out.println(" 1. Si");
                                    System.out.println(" 2. No");
                                    int desiciones = leer.nextInt();
                                    switch (desiciones) {
                                        case 1:
                                            desicion = "si";
                                            break;

                                        case 2:
                                            desicion = "no";

                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                    int salary = 0;
                                    System.out.println(" Ingrese jugada favorita");
                                    String favorita = leer.next();
                                    System.out.println(" Que tipo de entrendor es: ");
                                    System.out.println(" 1. Entrenador principal");
                                    System.out.println(" 2. Asistente de entrenador");
                                    System.out.println(" 3. Preparador fisico");
                                    int entrenar = leer.nextInt();
                                    switch (entrenar) {
                                        case 1:
                                            salary = 2000000000;
                                            jugadores.add(new Entrenador(desicion, favorita, name, apell, year, salary));
                                            break;

                                        case 2:
                                            salary = 1000000000;
                                            jugadores.add(new Entrenador(desicion, favorita, name, apell, year, salary));
                                            break;

                                        case 3:
                                            salary = 800000000;
                                            jugadores.add(new Entrenador(desicion, favorita, name, apell, year, salary));
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (jugadores.get(i) instanceof Entrenador) {
                                                    System.out.println(jugadores.get(i));
                                                }

                                            }
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }

                                    break;
                                default:
                                    System.out.println(" Opcion Incorrecta");
                                    System.out.println();
                            }

                            break;

                        case 2:// Modificar atributos de persona
                            if (jugadores.isEmpty()) {
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
                                    int modifyy = leer.nextInt();
                                    String salidass = "";
                                    switch (modifyy) {
                                        case 1:// modificar Nombre
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean name = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numLista = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numLista == i) {
                                                    name = false;
                                                    break;
                                                } else {
                                                    name = true;
                                                }

                                            }
                                            if (name == false) {
                                                System.out.print(" Ingrese un nuevo nombre: ");
                                                String newNombre = leer.next();
                                                ((Jugador) jugadores.get(numLista)).setNombre(newNombre);
                                                System.out.println(" Nombre del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 2:// modificar Apellido
                                            System.out.println(" Opcion modificar: Apellido del jugador");
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean apellidoo = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numApellido = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numApellido == i) {
                                                    apellidoo = false;
                                                    break;
                                                } else {
                                                    name = true;
                                                }

                                            }
                                            if (apellidoo == false) {
                                                System.out.print(" Ingrese un nuevo apellido: ");
                                                String newApellido = leer.next();
                                                jugadores.get(numApellido).setApellido(newApellido);
                                                System.out.println(" Apellido del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 3:// modificar Años
                                            System.out.println(" Opcion modificar: años del jugador");
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean anioss = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numAnio = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numAnio == i) {
                                                    anioss = false;
                                                    break;
                                                } else {
                                                    anioss = true;
                                                }

                                            }
                                            if (anioss == false) {
                                                System.out.print(" Ingrese un año: ");
                                                int newAnio = leer.nextInt();
                                                jugadores.get(numAnio).setAnios(newAnio);
                                                System.out.println(" años del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 4:// modificar salario
                                            System.out.println(" Opcion modificar: salario del jugador");
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean salarioo = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numSalario = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numSalario == i) {
                                                    salarioo = false;
                                                    break;
                                                } else {
                                                    salarioo = true;
                                                }

                                            }
                                            if (salarioo == false) {
                                                System.out.print(" Ingrese un nuevo salario: ");
                                                double newSalario = leer.nextDouble();
                                                jugadores.get(numSalario).setSalario(newSalario);
                                                System.out.println(" Salario del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 5:// modificar numero de camisa

                                            System.out.println(" Opcion modificar: Numero de camisa");
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean shirt = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numCamisaa = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numCamisaa == i) {
                                                    shirt = false;
                                                    break;
                                                } else {
                                                    shirt = true;
                                                }

                                            }
                                            if (shirt == false) {
                                                System.out.print(" Ingrese un nuevo numero de camisa: ");
                                                int newCamisa = leer.nextInt();
                                                ((Jugador) jugadores.get(numCamisaa)).setCamisaNum(newCamisa);
                                                System.out.println(" numero de camisa del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 6:// modificar tiro de 3
                                            System.out.println(" Opcion modificar: Tiros de 3");
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean tiros3 = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numTiros3 = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numTiros3 == i) {
                                                    tiros3 = false;
                                                    break;
                                                } else {
                                                    tiros3 = true;
                                                }

                                            }
                                            if (tiros3 == false) {
                                                System.out.print(" Ingrese tiros de 3: ");
                                                int newTiros3 = leer.nextInt();
                                                ((Jugador) jugadores.get(numTiros3)).setTirosDe3(newTiros3);
                                                System.out.println(" Tiros de 3 del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 7:// modificar Defensa
                                            System.out.println(" Opcion modificar: Defensa");
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean defense = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numDefense = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numDefense == i) {
                                                    defense = false;
                                                    break;
                                                } else {
                                                    defense = true;
                                                }

                                            }
                                            if (defense == false) {
                                                System.out.print(" Ingrese defensa: ");
                                                int newDefensa = leer.nextInt();
                                                ((Jugador) jugadores.get(numDefense)).setDefensa(newDefensa);
                                                System.out.println(" Defensa del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 8:// modificar Tiro de media
                                            System.out.println(" Opcion modificar: Tiros de media");
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean media = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numMedia = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numMedia == i) {
                                                    media = false;
                                                    break;
                                                } else {
                                                    media = true;
                                                }

                                            }
                                            if (media == false) {
                                                System.out.print(" Ingrese tiros de media: ");
                                                int newMedia = leer.nextInt();
                                                ((Jugador) jugadores.get(numMedia)).setTiroMedia(newMedia);
                                                System.out.println(" Tiros de media del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 9:// modificar rebote
                                            System.out.println(" Opcion modificar: Rebotes");
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean reboot = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numRebote = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numRebote == i) {
                                                    reboot = false;
                                                    break;
                                                } else {
                                                    reboot = true;
                                                }

                                            }
                                            if (reboot == false) {
                                                System.out.print(" Ingrese rebotes: ");
                                                int newRebote = leer.nextInt();
                                                ((Jugador) jugadores.get(numRebote)).setRebote(newRebote);
                                                System.out.println(" Rebotes del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 10:// modificar bandeja
                                            System.out.println(" Opcion modificar: Bandeja");
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean bandej = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numBan = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numBan == i) {
                                                    bandej = false;
                                                    break;
                                                } else {
                                                    bandej = true;
                                                }

                                            }
                                            if (bandej == false) {
                                                System.out.print(" Ingrese bandeja: ");
                                                int newBandeja = leer.nextInt();
                                                ((Jugador) jugadores.get(numBan)).setBandeja(newBandeja);
                                                System.out.println(" Bandeja del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 11:// modificar pases
                                            System.out.println(" Opcion modificar: Pases");
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean pass = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numPass = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numPass == i) {
                                                    pass = false;
                                                    break;
                                                } else {
                                                    pass = true;
                                                }

                                            }
                                            if (pass == false) {
                                                System.out.print(" Ingrese pases: ");
                                                int newPases = leer.nextInt();
                                                ((Jugador) jugadores.get(numPass)).setPases(newPases);
                                                System.out.println(" Pases del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }
                                            break;

                                        case 12:// modificar posteo
                                            System.out.println(" Opcion modificar: posteo");
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean posteoo = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numPosteo = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numPosteo == i) {
                                                    posteoo = false;
                                                    break;
                                                } else {
                                                    posteoo = true;
                                                }

                                            }
                                            if (posteoo == false) {
                                                System.out.print(" Ingrese posteo: ");
                                                int newPosteo = leer.nextInt();
                                                ((Jugador) jugadores.get(numPosteo)).setPosteo(newPosteo);
                                                System.out.println(" Posteo del jugador modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        default:

                                            System.out.println(" Opcion Incorrecta");
                                            System.out.println();
                                    }

                                    break;

                                case 2://Modificar atributos de medicos
                                    System.out.println(" Seleccione que desea modificar de medico");
                                    System.out.println(" 1. Nombre");
                                    System.out.println(" 2. Apellido");
                                    System.out.println(" 3. Años");
                                    System.out.println(" 4. Salario");
                                    System.out.println(" 5. colegio");
                                    int opci = leer.nextInt();
                                    switch (opci) {
                                        case 1:
                                            System.out.println("    Listado de Jugadores");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Medico) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean name = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del medico: ");
                                            int numLista = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numLista == i) {
                                                    name = false;
                                                    break;
                                                } else {
                                                    name = true;
                                                }

                                            }
                                            if (name == false) {
                                                System.out.print(" Ingrese un nuevo nombre: ");
                                                String newNombre = leer.next();
                                                ((Medico) jugadores.get(numLista)).setNombre(newNombre);
                                                System.out.println(" Nombre del medico modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }
                                            break;

                                        case 2:

                                            System.out.println("    Listado de Medicos");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Medico) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean namee = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del medico: ");
                                            numLista = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numLista == i) {
                                                    namee = false;
                                                    break;
                                                } else {
                                                    namee = true;
                                                }

                                            }
                                            if (namee == false) {
                                                System.out.print(" Ingrese un nuevo apellido: ");
                                                String newApellido = leer.next();
                                                ((Medico) jugadores.get(numLista)).setNombre(newApellido);
                                                System.out.println(" Apellido del medico modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }
                                            break;

                                        case 3:
                                            System.out.println(" Opcion modificar: años del medico");
                                            System.out.println("    Listado de Medicos");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Medico) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean anioss = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del medico: ");
                                            int numAnio = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numAnio == i) {
                                                    anioss = false;
                                                    break;
                                                } else {
                                                    anioss = true;
                                                }

                                            }
                                            if (anioss == false) {
                                                System.out.print(" Ingrese un año: ");
                                                int newAnio = leer.nextInt();
                                                ((Medico) jugadores.get(numAnio)).setAnios(newAnio);
                                                System.out.println(" años del medico modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 4:
                                            System.out.println(" Opcion modificar: salario del medico");
                                            System.out.println("    Listado de medicos");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Medico) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean salarioo = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del medico: ");
                                            int numSalario = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numSalario == i) {
                                                    salarioo = false;
                                                    break;
                                                } else {
                                                    salarioo = true;
                                                }

                                            }
                                            if (salarioo == false) {
                                                System.out.print(" Ingrese un nuevo salario: ");
                                                double newSalario = leer.nextDouble();
                                                ((Medico) jugadores.get(numSalario)).setSalario(newSalario);
                                                System.out.println(" Salario del medico modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;

                                        case 5:
                                            System.out.println(" Opcion modificar: colegio del medico");
                                            System.out.println("    Listado de Medicos");
                                            salidass = "";
                                            for (Object o : jugadores) {
                                                if (o instanceof Jugador) {
                                                    salidass += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                                }

                                            }
                                            System.out.println(salidass);

                                            boolean cole = false;

                                            System.out.println();
                                            System.out.print(" Ingrese numero de lista del jugador: ");
                                            int numCole = leer.nextInt();
                                            for (int i = 0; i < jugadores.size(); i++) {
                                                if (numCole == i) {
                                                    cole = false;
                                                    break;
                                                } else {
                                                    cole = true;
                                                }

                                            }
                                            if (cole == false) {
                                                System.out.print(" Ingrese un nuevo colegio: ");
                                                String newColegio=leer.next();
                                                ((Medico)jugadores.get(numCole)).setColegio(newColegio);
                                                System.out.println(" Colegio del medico ha modificado con exito");
                                                System.out.println();

                                            } else {
                                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                                System.out.println();

                                            }

                                            break;
                                        default:
                                            System.out.println(" Opcion incorrecta");
                                            System.out.println();
                                    }

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

                        case 3:// Despedir persona
                            System.out.println(" Seleccione que personal desea despedir");
                            System.out.println(" 1. Jugador ");
                            System.out.println(" 2. Medicos ");
                            System.out.println(" 3. Dueño ");
                            System.out.println(" 4. Entrenador ");
                            int position = leer.nextInt();
                            switch (position) {
                                case 1:
                                    String ends = "";

                                    for (Object o : jugadores) {
                                        if (o instanceof Jugador) {
                                            ends += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                        }

                                    }
                                    System.out.println(ends);

                                    boolean posteoo = false;

                                    System.out.println();
                                    System.out.print(" Ingrese numero de lista del jugador: ");
                                    int numPosteo = leer.nextInt();
                                    for (int i = 0; i < jugadores.size(); i++) {
                                        if (numPosteo == i) {
                                            posteoo = false;
                                            break;
                                        } else {
                                            posteoo = true;
                                        }

                                    }
                                    if (posteoo == false) {
                                        agenteLibre.add(jugadores.get(numPosteo));
                                        jugadores.remove(numPosteo);
                                        System.out.println(" Jugador ha sido despedido");
                                        System.out.println();

                                        System.out.println(" Lista de agentes libres");
                                        for (int i = 0; i < agenteLibre.size(); i++) {
                                            System.out.println(agenteLibre.get(i));

                                        }

                                    } else {
                                        System.out.println(" Error!!! Posicion seleccionada no existe");
                                        System.out.println();

                                    }

                                    break;

                                case 2:
                                    String endi = "";
                                    for (Object o : jugadores) {
                                        if (o instanceof Medico) {
                                            endi += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                        }

                                    }
                                    System.out.println(endi);

                                    boolean pasti = false;

                                    System.out.println();
                                    System.out.print(" Ingrese numero de lista del jugador: ");
                                    numPosteo = leer.nextInt();
                                    for (int i = 0; i < jugadores.size(); i++) {
                                        if (jugadores.get(i) instanceof Medico) {
                                            if (numPosteo == i) {
                                                pasti = false;
                                                break;
                                            } else {
                                                pasti = true;
                                            }
                                        }

                                    }
                                    if (pasti == false) {
                                        agenteLibre.add(jugadores.get(numPosteo));
                                        jugadores.remove(numPosteo);
                                        System.out.println(" Jugador ha sido despedido");
                                        System.out.println();

                                        System.out.println(" Lista de agentes libres");
                                        for (int i = 0; i < agenteLibre.size(); i++) {
                                            System.out.println(agenteLibre.get(i));

                                        }

                                    } else {
                                        System.out.println(" Error!!! Posicion seleccionada no existe");
                                        System.out.println();

                                    }

                                    break;

                                case 3:
                                    endi = "";
                                    for (Object o : jugadores) {
                                        if (o instanceof DuenioDeEquipo) {
                                            endi += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                        }

                                    }
                                    System.out.println(endi);

                                    boolean pastii = false;

                                    System.out.println();
                                    System.out.print(" Ingrese numero de lista del jugador: ");
                                    numPosteo = leer.nextInt();
                                    for (int i = 0; i < jugadores.size(); i++) {
                                        if (jugadores.get(i) instanceof DuenioDeEquipo) {
                                            if (numPosteo == i) {
                                                pastii = false;
                                                break;
                                            } else {
                                                pastii = true;
                                            }
                                        }

                                    }
                                    if (pastii == false) {
                                        agenteLibre.add(jugadores.get(numPosteo));
                                        jugadores.remove(numPosteo);
                                        System.out.println(" Jugador ha sido despedido");
                                        System.out.println();

                                        System.out.println(" Lista de agentes libres");
                                        for (int i = 0; i < agenteLibre.size(); i++) {
                                            System.out.println(agenteLibre.get(i));

                                        }

                                    } else {
                                        System.out.println(" Error!!! Posicion seleccionada no existe");
                                        System.out.println();

                                    }

                                    break;

                                case 4:
                                    endi = "";
                                    for (Object o : jugadores) {
                                        if (o instanceof Entrenador) {
                                            endi += " [" + jugadores.indexOf(o) + "] " + o + "\n";
                                        }

                                    }
                                    System.out.println(endi);

                                    boolean enti = false;

                                    System.out.println();
                                    System.out.print(" Ingrese numero de lista del jugador: ");
                                    numPosteo = leer.nextInt();
                                    for (int i = 0; i < jugadores.size(); i++) {
                                        if (jugadores.get(i) instanceof Entrenador) {
                                            if (numPosteo == i) {
                                                enti = false;
                                                break;
                                            } else {
                                                enti = true;
                                            }
                                        }

                                    }
                                    if (enti == false) {
                                        agenteLibre.add(jugadores.get(numPosteo));
                                        jugadores.remove(numPosteo);
                                        System.out.println(" Jugador ha sido despedido");
                                        System.out.println();

                                        System.out.println(" Lista de agentes libres");
                                        for (int i = 0; i < agenteLibre.size(); i++) {
                                            System.out.println(agenteLibre.get(i));

                                        }

                                    } else {
                                        System.out.println(" Error!!! Posicion seleccionada no existe");
                                        System.out.println();

                                    }

                                    break;
                                default:
                                    throw new AssertionError();
                            }

                            break;
                        default:
                            System.out.println(" Opcion incorrecta");
                            System.out.println();
                    }

                    break;

                case 2:// Equipo
                    System.out.println();
                    System.out.println("Creacion Del Equipo: ");
                    System.out.println();
                    System.out.println("Ingrese el nombre del equipo: ");
                    String nomEquip = leer.nextLine();
                    nomEquip = leer.nextLine();
                    System.out.println("Ingrese el año de fundacion: ");
                    int anioFun = leer.nextInt();
                    System.out.println("Ingrese el numero de campeonatos ganados: ");
                    int ncamp = leer.nextInt();

                    System.out.println("Ingrese el personal que desea agregar: ");
                    System.out.println(" 1. Jugador"
                            + " 2. Medico"
                            + " 3. Dueño del equipo"
                            + " 4. Entrenador");
                    int opcEquip = leer.nextInt();
                    switch (opcEquip) {

                        case 1://Jugador
                            String salida = "";
                            for (Object o : jugadores) {
                                if (o instanceof Jugador) {
                                    salida += "[" + jugadores.indexOf(o) + "] " + o + "\n";
                                }
                            }
                            System.out.println(salida);

                            boolean jugador = false;

                            System.out.println();
                            System.out.print(" Ingrese posicion para fichar jugador: ");
                            int jugadorAg = leer.nextInt();

                            for (int i = 0; i < jugadores.size(); i++) {
                                if (jugadorAg == i) {
                                    jugador = false;
                                } else {
                                    jugador = true;
                                }

                            }

                            if (jugador == false) {
                                System.out.println("Seleccione posicion de jugador a fichar: ");
                                System.out.println(" 1. Base");
                                System.out.println(" 2. Escolta");
                                System.out.println(" 3. Alero");
                                System.out.println(" 4. Alero-Pivot");
                                System.out.println(" 5. Centro");
                                int posJ = leer.nextInt();

                                switch (posJ) {
                                    case 1:
                                        for (Object o : jugadores) {
                                            if (o instanceof Base) {
                                                salida += "[" + jugadores.indexOf(o) + "] " + o + "\n";
                                            }
                                        }

                                        System.out.println("Seleccione un jugador para fichar: ");
                                        int posJug = leer.nextInt();
                                        lisjug.add(jugadores.get(posJug));
                                        break;
                                    case 2:
                                        for (Object o : jugadores) {
                                            if (o instanceof Escolta) {
                                                salida += "[" + jugadores.indexOf(o) + "] " + o + "\n";
                                            }
                                        }

                                        System.out.println("Seleccione un jugador para fichar: ");
                                        posJug = leer.nextInt();
                                        lisjug.add(jugadores.get(posJug));
                                        break;
                                    case 3:
                                        for (Object o : jugadores) {
                                            if (o instanceof Alero) {
                                                salida += "[" + jugadores.indexOf(o) + "] " + o + "\n";
                                            }
                                        }

                                        System.out.println("Seleccione un jugador para fichar: ");
                                        posJug = leer.nextInt();
                                        lisjug.add(jugadores.get(posJug));
                                        break;
                                    case 4:
                                        for (Object o : jugadores) {
                                            if (o instanceof AleroPivot) {
                                                salida += "[" + jugadores.indexOf(o) + "] " + o + "\n";
                                            }
                                        }

                                        System.out.println("Seleccione un jugador para fichar: ");
                                        posJug = leer.nextInt();
                                        lisjug.add(jugadores.get(posJug));
                                        break;
                                    case 5:
                                        for (Object o : jugadores) {
                                            if (o instanceof Centro) {
                                                salida += "[" + jugadores.indexOf(o) + "] " + o + "\n";
                                            }
                                        }

                                        System.out.println("Seleccione un jugador para fichar: ");
                                        posJug = leer.nextInt();
                                        lisjug.add(jugadores.get(posJug));
                                        break;
                                    default:
                                        System.out.println("Opcion Incrrecta!!");
                                        ;
                                }

                            } else {
                                System.out.println(" Error!!! Posicion seleccionada no existe");
                                System.out.println();

                            }

                            break;
                        case 2: //Medico
                            salida = "";
                            for (Object o : medicos) {
                                if (o instanceof Medico) {
                                    salida += "[" + medicos.indexOf(o) + "] " + o + "\n";
                                }
                            }
                            System.out.println(salida);

                            boolean medico = false;

                            System.out.println();
                            System.out.print(" Ingrese posicion para fichar medico: ");
                            int medicoAg = leer.nextInt();

                            for (int i = 0; i < jugadores.size(); i++) {
                                if (medicoAg == i) {
                                    medico = false;
                                } else {
                                    medico = true;
                                }

                            }

                            if (medico == false) {
                                System.out.println("Seleccione posicion de medico a fichar: ");
                                System.out.println(" 1. General");
                                System.out.println(" 2. Cirujia");
                                System.out.println(" 3. Terapueto");
                                int posM = leer.nextInt();

                                switch (posM) {
                                    case 1:
                                        for (Object o : medicos) {
                                            if (o instanceof MedGeneral) {
                                                salida += "[" + medicos.indexOf(o) + "] " + o + "\n";
                                            }
                                        }
                                        System.out.println("Seleccione un medico para fichar: ");
                                        int posMed = leer.nextInt();
                                        lismed.add(jugadores.get(posMed));
                                        break;
                                    case 2:
                                        for (Object o : medicos) {
                                            if (o instanceof MedCirujano) {
                                                salida += "[" + medicos.indexOf(o) + "] " + o + "\n";
                                            }
                                        }
                                        System.out.println("Seleccione un medico para fichar: ");
                                        posMed = leer.nextInt();
                                        lismed.add(jugadores.get(posMed));
                                        break;

                                    case 3:
                                        for (Object o : medicos) {
                                            if (o instanceof MedTera) {
                                                salida += "[" + medicos.indexOf(o) + "] " + o + "\n";
                                            }
                                        }
                                        System.out.println("Seleccione un medico para fichar: ");
                                        posMed = leer.nextInt();
                                        lismed.add(medicos.get(posMed));
                                        break;
                                    default:
                                        System.out.println("Opcion Incorrecta");
                                        ;

                                        break;
                                }
                            }

                        case 3:
                            salida = "";
                            for (Object o : duenio) {
                                if (o instanceof DuenioDeEquipo) {
                                    salida += "[" + medicos.indexOf(o) + "] " + o + "\n";
                                }
                            }
                            System.out.println("Seleccione un Dueño para fichar: ");
                            int posDue = leer.nextInt();
                            lisDue.add(duenio.get(posDue));
                            break;
                        case 4: //Entrenador
                            salida = "";
                            for (Object o : entrenadores) {
                                if (o instanceof Entrenador) {
                                    salida += "[" + entrenadores.indexOf(o) + "] " + o + "\n";
                                }
                            }
                            System.out.println("Seleccione un entrenador para fichar: ");
                            int posEnt = leer.nextInt();
                            lisDue.add(entrenadores.get(posEnt));
                            break;
                        default:
                            System.out.println("Opcion Incorrecta!!");
                    }

                    break;

                case 3:// Jugadas
                    System.out.println("Ingrese el nombre de la jugada a crear");
                    String nomjugada = leer.next();
                    System.out.println("Ingrese la probabilidad de exito");
                    int probab = leer.nextInt();
                    Jugadas Jugada = new Jugadas();
                    Jugada.setJugar(nomjugada);
                    Jugada.setProb(probab);
                    
                    break;
                    
                case 4: //Simulacion
                    int lesion = ran.nextInt(100);
                    if (lesion < 40){
                        System.out.println("Jugador lesionado");
                        MedCirujano mc = new MedCirujano();
                        MedTera mt = new MedTera();
                        mc.setNCirujias(mc.getNCirujias() + 1);
                        mt.setNTerapias(mt.getNTerapias()+ 1);
                    }
                    int enfermo = ran.nextInt(100);
                    if (enfermo < 30){
                        System.out.println("jugador enfermo");
                        MedGeneral mg = new MedGeneral();
                        mg.setNEnfreme(mg.getNEnfreme()+1);
                    }
                    break;
                case 5:// Salir

                    System.exit(4);
                    break;
                default:
                    System.out.println(" Opcion incorrecta");
            }

        }

    }

}
