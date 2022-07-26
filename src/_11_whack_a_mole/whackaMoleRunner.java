package _11_whack_a_mole;

import java.util.Random;

public class whackaMoleRunner {
	
	public static void main(String[] args) {
		int rand = new Random().nextInt(24);
		whackaMole whack = new whackaMole();
		whack.drawButtons(rand);
	}
}
