package AbstractFactory;

public class ManAdult extends Man { 
    private String denumire; 
    private int kilos; 
 
 
    public ManAdult(int viteza, String culoare, String denumire, int 
    		kilos) { 
        super(viteza, culoare); 
        this.denumire = denumire; 
        this.kilos = kilos; 
    } 
 
    @Override 
    public String Caracteristic() { 
        return denumire + ", " + getCuloare() + ", " 
                + getViteza() + ", " + kilos; 
    } 
}