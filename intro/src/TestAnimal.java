import animal.animal;
import animal.chat;
import animal.chien;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal a1=new animal(15,"bgbbb");
animal c1=new chat();
System.out.println(c1.Parle());
animal ch1=new chien();
System.out.println(ch1.Parle());
System.out.println(animal.nbrAnimal);

	}

}
