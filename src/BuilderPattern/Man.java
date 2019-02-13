package BuilderPattern; 
 
public class Man { 
    private int nrHand; 
    private String culoare; 
    private int kilos; 
    private String denumire; 
 
    public String getDenumire() { 
        return denumire; 
    } 
 
    public void setDenumire(String denumire) { 
        this.denumire = denumire; 
    } 
 
    public void setNrHands(int nrHand) { 
        this.nrHand = nrHand; 
    } 
 
    public String getCuloare() { 
        return culoare; 
    } 
 
    public void setCuloare(String culoare) { 
        this.culoare = culoare; 
    } 
 
    public void setKilos(int kilos) { 
        this.kilos = kilos; 
    } 
 
    public String toString() { 
        return "Aндройд: " + denumire + ", " 
                + culoare + ", " + nrHand + ", " +kilos; 
    } 
}
