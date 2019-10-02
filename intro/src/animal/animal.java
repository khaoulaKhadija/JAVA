package animal;

public class animal {
	public static int nbrAnimal=0;
	public int getAge() {
		return age;
	}







	public void setAge(int age) {
		this.age = age;
	}







	public String getNom() {
		return nom;
	}







	public void setNom(String nom) {
		this.nom = nom;
	}







	public int getPoids() {
		return poids;
	}







	public void setPoids() {
		this.poids = (int)(Math.random());
	}







	public double getSpeed() {
		return speed;
	}







	public void setSpeed(double speed) {
		this.speed = speed;
	}







	public int getId() {
		return id;
	}







	public void setId(int id) {
		this.id = id;
	}







	private int age;
	private String nom;
	private int poids;
	private double speed;
	private int id;
	
	
	
	public animal() {
		this.nbrAnimal++;

	}
	
	
	
public animal(int age,String nom) {
	this.nbrAnimal++;
	this.age=age;
	this.nom=nom;
	

}
public String toString() {
	return "animal"+this.nom+""+this.age+""+this.poids+"";
}
public String Parle() {
	return "wwwwwww";
}
}
