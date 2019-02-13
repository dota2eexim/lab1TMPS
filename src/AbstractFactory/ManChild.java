package AbstractFactory;

public class ManChild extends Man { 
    private String denumire; 
    private int kilos; 
    public static final String SPACE = ", "; 
 
    public ManChild(String denumire, int kilos, int viteza, String 
culoare) { 
        super(viteza, culoare); 
        this.denumire = denumire; 
        this.kilos = kilos; 
    } 
 
    @Override 
    public String Caracteristic() { 
        return denumire + SPACE + getCuloare() + ", " 
                + getViteza() + ", " + kilos; 
    } 
 
}
