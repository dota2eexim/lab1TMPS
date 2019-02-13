package FactoryMethod; 
 
import java.util.InputMismatchException; 
 
public class ProduceManAdult implements ProduceMan { 
    @Override 
    public ManAdult createManAdult(String denumire) { 
        if (denumire.equals("Nick")) { 
            return new Nick("Nick", "Белый", "45", "15"); 
        } 
        if (denumire.equals("John")) { 
            return new John("John", "Красный", "25", "14"); 
        } 
        throw new InputMismatchException("Не существует такого андройда:"  +denumire); 
    } 
}
