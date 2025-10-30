package game.simple;
import java.util.Random;

public class GmaeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player(100,100,100);
		Dragon dragon = new Dragon (30,20,50);
		Thief thief = new Thief(30,20,50);
		Mouse mouse = new Mouse(30,20,50);
		
		Random rand = new Random();
		Enemy[] enemys = {dragon,thief,mouse};
		
		while(player.IsAlive()) {
			int val = rand.nextInt(enemys.length);
//			if(val==0) {
//				dragon.Attack(player);
//			}
//			else if(val==1) {
//				thief.Attack(player);
//			}
//			else {
//				mouse.Attack(player);
//			}
			enemys[val].Attack(player);

		}
	}
	
}


