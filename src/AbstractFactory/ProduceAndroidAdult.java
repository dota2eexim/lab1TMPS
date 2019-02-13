package AbstractFactory; 
 
import static java.lang.System.out; 
 
public class ProduceAndroidAdult  implements Fabrica{ 
    @Override 
    public Man createMan() { 
        out.print("Фабрика по производству МужчинАндройдов:  "); 
        return new ManAdult(80, "Белый", "Дон", 50); 
    } 
 
    @Override 
    public Woman createWoman() { 
        out.print("Фабрика по производству ЖенщинАндройдов: "); 
        return new WomanAdult(20, "Белый", 50, "Анна"); 
    } 
}
