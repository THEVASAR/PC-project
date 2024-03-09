package Game_1;
import java.util.*;

public class Gameplay {

	public static void main(String[] args) {
		Player player_1=new Player("one", "one123", 123);
		Player player_2=new Player("two", "one456", 456);
		
		Archer Archer_1=new Archer("Shooter", 80, 11, 4, 6, 9);
		Archer Archer_2=new Archer("Ranger", 115, 14, 5, 8, 10);
		Archer Archer_3=new Archer("Sunfire", 160, 15, 5, 7, 14);
		Archer Archer_4=new Archer("Zing", 200, 16, 9, 11, 14);
		
		Knight Knight_1=new Knight("Squire", 80, 11, 4, 6, 9);
		Knight Knight_2=new Knight("Shooter", 80, 11, 4, 6, 9);
		Knight Knight_3=new Knight("Shooter", 80, 11, 4, 6, 9);
		Knight Knight_4=new Knight("Shooter", 80, 11, 4, 6, 9);
		
	}

}
