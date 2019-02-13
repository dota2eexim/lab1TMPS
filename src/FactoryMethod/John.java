package FactoryMethod; 
 
public class John implements ManAdult { 
    private String denumire; 
    private String culoare; 
    private String capacitate; 
    private String viteza; 
 
 
    public John(String denumire, String culoare, String capacitate, 
String viteza) { 
        this.denumire = denumire; 
        this.culoare = culoare; 
        this.capacitate = capacitate; 
        this.viteza = viteza; 
    } 
 
    @Override 
    public String Caracteristic() { 
        return "Automobilul: " + denumire + ", " 
                + culoare + ", " + capacitate + ", " + viteza; 
 
    } 
}