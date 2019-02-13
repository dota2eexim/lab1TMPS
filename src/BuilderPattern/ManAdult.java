package BuilderPattern; 
 
public class ManAdult implements ManBuilder { 
    private Man man; 
 
    public ManAdult() { 
    	man = new Man(); 
    } 
 
    @Override 
    public void setDenumire(String denumire) { 
    	man.setDenumire(denumire); 
    } 
 
    @Override 
    public void setNrHands(int nrHand) { 
    	man.setNrHands(nrHand); 
    } 
 
    @Override 
    public void setCuloare(String culoare) { 
    	man.setCuloare(culoare); 
    } 
 
    @Override 
    public void setKilos(int kilos) { 
    	man.setKilos(kilos); 
    } 
 
    @Override 
    public Man caracteristica() { 
        return man; 
    } 
}