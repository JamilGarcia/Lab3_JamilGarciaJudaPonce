
package lab3_jamilgarciajudaponc;


public class Jugadas {
    
    private String jugar;
    private int prob;

    public Jugadas() {
       
    }

    public Jugadas(String jugar, int prob) {
        this.jugar = jugar;
        this.prob = prob;
    }

    public String getJugar() {
        return jugar;
    }

    public void setJugar(String jugar) {
        this.jugar = jugar;
    }

    public int getProb() {
        return prob;
    }

    public void setProb(int prob) {
        
        if (prob <=  100 || prob >= 1){
        this.prob = prob;
        }
        this.prob = 0;
        
    }

    @Override
    public String toString() {
        return "Jugadas{" + "jugar=" + jugar + ", prob=" + prob + '}';
    }
    
    
    
}
