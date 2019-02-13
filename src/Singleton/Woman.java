package Singleton; 
 
 
public class Woman { 
    private String denumire; 
    private int nrHands; 
    private String culoare; 
    private int kilos; 
    private static Woman woman; 
 
    private Woman(String denumire, int nrHands, String culoare, int 
kilos) { 
        this.denumire = denumire; 
        this.nrHands = nrHands; 
        this.culoare = culoare; 
        this.kilos = kilos; 
    } 
    public static Woman getInstance() { 
        if (woman == null) { 
            woman = new Woman("����", 35, "�����",20); 
        } 
        return woman; 
    } 
    public String carateristic() { 
        return "�������: " + denumire + ", " + culoare + ", " 
                + nrHands + ", " + kilos; 
    } 
}
