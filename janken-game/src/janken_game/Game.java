package janken_game;

import java.util.Random;
import java.util.Scanner;


class Game{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		Random  rand = new Random();

		String[] hands = {"goo","choki","par"};

		int player,npc;

		System.out.println("GAME START!");

		while(true){
			System.out.println("手を選んでください[グー(0) チョキ(1) パー(2)]");
			player = scan.nextInt();
			npc    = rand.nextInt(3);

			//judge
			System.out.printf("player:%s npc:%s\n",hands[player],hands[npc]);
			GameSystem.sleep();

			System.out.println("--------------------------");
			GameSystem.judge(player,npc);
			if(player != npc){
				break;
			}
		}



	}
}