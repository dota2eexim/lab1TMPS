package AbstractFactory;

public class WomanChild extends Woman { 
    private String denumire; 
 
    public WomanChild(int viteza, String culoare, int altitudine, String 
denumire) { 
        super(viteza, culoare, altitudine); 
        this.denumire = denumire; 
    } 
    @Override 
    public String ArataCaracteristi() { 
        return denumire + ", " + getCuloare()+ ", " 
                + getViteza()+ ", " + getAltitudine(); 
    } 
}
