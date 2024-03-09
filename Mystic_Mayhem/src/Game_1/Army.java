package Game_1;

public class Army {
	String name;
	double price;
	int attack;
	int defence;
	int health;
	int speed;
	Equipment eq;
	public Army(String name, double price, int attack, int defence, int health, int speed) {
		this.name=name;
		this.price=price;
		this.attack=attack;
		this.defence=defence;
		this.health=health;
		this.speed=speed;
	}
	public void Eq_adding() {
		if(eq!= null) {
			this.price+=eq.price*0.2;
			this.attack+=eq.attack;
			this.defence+=eq.defence;
			this.health+=eq.health;
			this.speed+=eq.speed;
		}
	}

}
