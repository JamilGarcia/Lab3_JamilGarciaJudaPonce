package lab3_jamilgarciajudaponc;

public class Base {

    private double altura;

    public Base() {
    }

    public Base(double altura) {
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
        return "Base{" + "altura=" + altura + '}';
    }

}
