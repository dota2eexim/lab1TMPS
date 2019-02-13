package AbstractFactory; 
 
import static java.lang.System.out; 
 
public class ProduceAndroidAdult  implements Fabrica{ 
    @Override 
    public Man createMan() { 
        out.print("������� �� ������������ ���������������:  "); 
        return new ManAdult(80, "�����", "���", 50); 
    } 
 
    @Override 
    public Woman createWoman() { 
        out.print("������� �� ������������ ���������������: "); 
        return new WomanAdult(20, "�����", 50, "����"); 
    } 
}
