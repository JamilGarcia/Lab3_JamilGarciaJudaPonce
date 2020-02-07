package lab3_jamilgarciajudaponc;

public class EntrenadorPrin extends Entrenador{
    private int salario; 

    public EntrenadorPrin() {
    }

    public EntrenadorPrin(String Jugo, Jugadas jugada) {
        super(Jugo, jugada);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "EntrenadorPrin{" + "salario=" + salario + '}';
    }
    
    
    
}
