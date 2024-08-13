import entities.Player;
import enums.EPosition;

public class Main {
	public static void main(String[] args) {
		Player player1=new Player("Alperen",20,"Turkiye",1,1,50d,5d,EPosition.ST);
		System.out.println(player1);
		Player player2=new Player("Alperen",20,"Turkiye",1,1,50d,5d,EPosition.ST);
		System.out.println(player2);
	}
}