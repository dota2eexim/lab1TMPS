package FactoryMethod; 
 
public class Nick implements ManAdult { 
    private String denumire; 
    private String culoare; 
    private String capacitate; 
    private String viteza; 
 
 
    public Nick(String denumire, String culoare, String capacitate, String 
viteza) { 
        this.denumire = denumire; 
        this.culoare = culoare; 
        this.capacitate = capacitate; 
        this.viteza = viteza; 
    } 
 
    @Override 
    public String Caracteristic() { 
        return "Android: " + denumire + ", " 
                + culoare + ", " + capacitate + ", " + viteza; 
 
    } 
}
