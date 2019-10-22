package noob;

import java.util.Random;
import java.util.Scanner;
//A.Selim OZTEN 041801114

/*the program creates a random number which is 0, 2 or 1 and prompts the user to make a guess and checks it by the rules.
(it is basically plays rock paper scissors with the user)*/

public class RoSciPap {

	public static void main(String[] args) {

		// scanner an random libraries been imported and a random number created.
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		// random number generated
		int random = rand.nextInt(3);

		// in order to get results in range of switch an addition made.
		random = random + 1;

		// input requested in order to check
		System.out.println("[please enter your move][rock=1, paper=2, scissor=3] :");
		int move = scan.nextInt();

		// switch case defined in order to check the users move and compare it to the
		// computers move.
		switch (random) {

		case 1:
			// for case one computer is rock.
			if (move == 1) {
				System.out.println("[both you and the computer have rock no points for no one]");
			} else if (move == 2) {
				System.out.println("[computer had rock and you have paper you won]");
			} else if (move == 3) {
				System.out.println("[computer had rock and you have scissors you lose]");
			} else {
				System.out.println("[dude pls enter a valid move]");
			}
			break;
		case 2:
			// for case two computer is paper.
			if (move == 1) {
				System.out.println("[computer had paper and you have rock you lose]");
			} else if (move == 2) {
				System.out.println("[both you and the computer have rock no points for no one]");
			} else if (move == 3) {
				System.out.println("[computer had paper and you have scissors you win]");
			} else {
				System.out.println("[dude pls enter a valid move]");
			}
			break;
		case 3:
			// for case tree computer is scissors.
			if (move == 1) {
				System.out.println("[computer had scissors and you have rock you win]");
			} else if (move == 2) {
				System.out.println("[computer had scissors and you have paper you lose]");
			} else if (move == 3) {
				System.out.println("[both you and the computer have rock no points for no one]");
			} else {
				System.out.println("[dude pls enter a valid move]");
			}
			break;
		}

	}

}
