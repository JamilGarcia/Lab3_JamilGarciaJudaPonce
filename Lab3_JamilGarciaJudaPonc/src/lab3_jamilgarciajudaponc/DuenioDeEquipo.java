package lab3_jamilgarciajudaponc;

public class DuenioDeEquipo extends Persona{
    
    private int NetWorth;
    private String nacio;

    public DuenioDeEquipo(int NetWorth, String nacio, String nombre, String apellido, int anios, double salario) {
        super(nombre, apellido, anios, salario);
        this.NetWorth = NetWorth;
        this.nacio = nacio;
    }

    

    public int getNetWorth() {
        return NetWorth;
    }

    public void setNetWorth(int NetWorth) {
        this.NetWorth = NetWorth;
    }

    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }

    @Override
    public String toString() {
        return super.toString() +  "DuenioDeEquipo{" + "NetWorth=" + NetWorth + ", nacio=" + nacio + '}';
    }

   
    
}
