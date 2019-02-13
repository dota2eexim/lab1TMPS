package AbstractFactory;

public abstract class Woman { 
    private int viteza; 
    private String culoare; 
    int altitudine; 
 
    public Woman(int viteza, String culoare, int altitudine) { 
        this.viteza = viteza; 
        this.culoare = culoare; 
        this.altitudine = altitudine; 
    } 
 
    public int getViteza() { 
        return viteza; 
    } 
 
    public String getCuloare() { 
        return culoare; 
    } 
 
    public int getAltitudine() { 
        return altitudine; 
    } 
 
    public abstract String ArataCaracteristi(); 
 
}
