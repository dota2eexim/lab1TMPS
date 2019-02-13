package AbstractFactory;

public class WomanAdult extends Woman { 
    private String denumire; 
 
    public WomanAdult(int viteza, String culoare, int altitudine, String 
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
