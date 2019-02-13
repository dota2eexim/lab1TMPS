package AbstractFactory; 
 
import static java.lang.System.out; 
 
public class ProduceAndroidChild implements Fabrica{ 
    @Override 
    public Man createMan() { 
        out.print("������� �� ������������ ������������������:  "); 
        return new ManChild("���", 20, 12, "������"); 
    } 
 
    @Override 
    public Woman createWoman() { 
        out.print("������� �� ������������ ����������������: "); 
        return new WomanChild(17, "������", 15, "������"); 
    } 
}
