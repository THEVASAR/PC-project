package Game_1;

public class Player {
	final String username;
	String name;
	double coins;
	final int UserID;
	
	public Player(final String username, String name, int UserID) {
		this.username=username;
		this.name=name;
		this.coins=500.0;
		this.UserID=UserID;
	}

}
