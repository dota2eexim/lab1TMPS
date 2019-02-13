package BuilderPattern; 
 
public interface ManBuilder { 
    void setDenumire(String denumire); 
    void setNrHands(int nrHand); 
    void setCuloare(String culoare); 
    void setKilos(int kilos); 
 
    Man caracteristica(); 
 
}
