package random_quest;
import java.util.Random;
import java.util.Scanner;

import random_quest.util.Utility;

public class Main{
	public static final Random rand = new Random();
	public static void main(String[] args){

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int command;

		Status pSt = new Status("player",rand.nextInt(99)+1);
		Status eSt = new Status("enemy",rand.nextInt(99)+1);

		System.out.println("enemy appeared");

		while(true){
			System.out.printf("%s:%d %s:%d\n",pSt.getName(),pSt.getHp(), eSt.getName(),eSt.getHp());
			System.out.println("player phase");
			System.out.println("attack(0)/heal(1)/run away(2)");

			command = scan.nextInt();
			if(command == 0){
				pSt.attack(eSt);
			}else if(command == 1){
				pSt.heal();
			}else if(command == 2){
				pSt.runAway();
				break;
			}

			if(eSt.getHp() <= 0){
				System.out.println("player Win!");
				break;
			}

			Utility.line(35);
			Utility.sleep();

			System.out.println("enemy phase");
			command = rand.nextInt(2);
			if(command == 0){
				eSt.attack(pSt);
			}else if(command == 1){
				eSt.heal();
			}

			if(pSt.getHp() <= 0){
				System.out.println("player Lose...");
				break;
			}

			Utility.line(35);
			Utility.sleep();
		}
	}
}