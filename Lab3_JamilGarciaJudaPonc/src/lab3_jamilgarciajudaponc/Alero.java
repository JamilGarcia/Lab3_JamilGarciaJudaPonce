package lab3_jamilgarciajudaponc;

public class Alero extends Jugador {

    private double altura;

    public Alero() {
        super();
    }

    public Alero(double altura, int camisaNum, int tirosDe3, int defensa, int tiroMedia, int rebote, int bandeja, int pases, int posteo, String nombre, String apellido, int anios, double salario) {
        super(camisaNum, tirosDe3, defensa, tiroMedia, rebote, bandeja, pases, posteo, nombre, apellido, anios, salario);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + " Posicion-> " + "Alero " + " altura= " + altura;
    }

}
