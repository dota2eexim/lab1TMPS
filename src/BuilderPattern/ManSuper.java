package BuilderPattern; 
 
public class ManSuper { 
    private ManBuilder builder; 
 
    public ManSuper(ManBuilder builder) { 
        this.builder = builder; 
    } 
 
    public Man construct() { 
        builder.setDenumire("JohnieSuper"); 
        builder.setCuloare("Gold"); 
        builder.setKilos(100); 
        builder.setNrHands(2); 
        return builder.caracteristica(); 
    } 
}
