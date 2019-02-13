package PrototypePattern; 
 
 
public class Nick implements Man { 
    public Man makeCopy() { 
        System.out.println("Nick..."); 
        Nick androidObject = null; 
        try { 
            androidObject = (Nick) super.clone(); 
        } 
        catch (CloneNotSupportedException e) { 
            e.printStackTrace(); 
        } 
        return androidObject; 
    } 
    public String toString(){ 
        return "Андройд Nick"; 
    } 
}
