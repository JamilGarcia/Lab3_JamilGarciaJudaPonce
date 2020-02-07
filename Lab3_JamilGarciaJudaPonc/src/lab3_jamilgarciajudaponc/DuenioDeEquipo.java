package lab3_jamilgarciajudaponc;

public class DuenioDeEquipo {
    
    private int NetWorth;
    private String nacio;

    public DuenioDeEquipo(int NetWorth, String nacio) {
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
        return "DuenioDeEquipo{" + "nacio=" + nacio + '}';
    }
    
}
