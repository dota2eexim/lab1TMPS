package AbstractFactory;

public abstract class Man { 
    private int viteza; 
    private String culoare; 
 
    public Man(int viteza, String culoare) { 
        this.viteza = viteza; 
        this.culoare = culoare; 
    } 
 
    public int getViteza() { 
        return viteza; 
    } 
 
    public String getCuloare() { 
        return culoare; 
    } 
 
    public abstract String Caracteristic(); 
}
