package AbstractFactory; 
 
import static java.lang.System.out; 
 
public class ProduceAndroidChild implements Fabrica{ 
    @Override 
    public Man createMan() { 
        out.print("Фабрика по производству АндройдовМальчиков:  "); 
        return new ManChild("Ник", 20, 12, "Черный"); 
    } 
 
    @Override 
    public Woman createWoman() { 
        out.print("Фабрика по производству АндройдовДевочек: "); 
        return new WomanChild(17, "Черный", 15, "Еленка"); 
    } 
}
