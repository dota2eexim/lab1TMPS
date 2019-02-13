package MainClass; 
 
import AbstractFactory.*; 
import BuilderPattern.ManBuilder; 
import BuilderPattern.ManSuper; 
import BuilderPattern.ManAdult; 
import FactoryMethod.ProduceMan; 
import PrototypePattern.CloneFactory; 
import PrototypePattern.Nick;
 
import static java.lang.System.out; 
 
public class MainClass { 
    public static void main(String[] args) { 
        Fabrica Fabrica = new ProduceAndroidAdult(); 
        out.print("Abstract Factory Design Pattern. "); // Abstract Factory Design Pattern. 
        out.println("Создание Взрослых Андройдов"); 
        YourAndroid(Fabrica); 
        out.print("\n"); 
        out.print("Abstract Factory Pattern. "); 
        out.println("Создание Маленьких Андройдов"); 
        Fabrica = new ProduceAndroidChild(); 
        YourAndroid(Fabrica); 
 
        out.print("\n"); // Factory Method Design Pattern 
        out.println("Factory Method Pattern....."); 
        ProduceMan men = new FactoryMethod.ProduceManAdult(); 
        FactoryMethod.ManAdult menAdult = men.createManAdult("Nick"); 
        out.println(menAdult.Caracteristic()); 
        menAdult = men.createManAdult("John"); 
        out.println(menAdult.Caracteristic()); 
 
        out.print("\n"); 
        out.println("Builder Pattern....."); // Builder pattern 
        ManBuilder builder = new ManAdult(); 
        ManSuper manSuper = new ManSuper(builder); 
        out.print(manSuper.construct()); 
 
        out.println("\n"); 
        out.println("Singleton Pattern..... "); //Singleton Pattern 
        Singleton.Woman woman = Singleton.Woman.getInstance(); 
        out.print(woman.carateristic()); 
 
        out.println("\n"); 
        out.println("Prototype Pattern...");  // Prototype Pattern 
        CloneFactory factory = new CloneFactory(); 
        Nick nick = new Nick(); 
        Nick clonedAndroid = (Nick) factory.getClone(nick); 
        System.out.println(nick); 
        System.out.println(clonedAndroid); 
    } 
 
    private static void YourAndroid(Fabrica Fabrica) { 
        Man man = Fabrica.createMan(); 
        out.println(man.Caracteristic()); 
 
        Woman woman = Fabrica.createWoman(); 
        out.println(woman.ArataCaracteristi()); 
    } 
 
} 
 
