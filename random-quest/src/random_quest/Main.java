package random_quest;
import java.util.Random;
import java.util.Scanner;

public class Main{
	public static final Random rand = new Random();
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int command;

		Status pSt = new Status("player",rand.nextInt(99)+1);
		Status eSt = new Status("enemy",rand.nextInt(99)+1);

		System.out.println("敵が現れた!!");

		while(true){
			System.out.printf("%s:%d %s:%d\n",pSt.getName(),pSt.getHp(), eSt.getName(),eSt.getHp());
			System.out.println("playerのターン");
			System.out.println("攻撃(0)/回復(1)/逃げる(2)");

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
				System.out.println("俺の勝ち!");
				break;
			}

			line(35);

			System.out.println("敵のターン");
			command = rand.nextInt(2);
			if(command == 0){
				eSt.attack(pSt);
			}else if(command == 1){
				eSt.heal();
			}

			if(pSt.getHp() <= 0){
				System.out.println("俺の負け!");
				break;
			}

			line(35);
		}
	}


	public static void line(int l){
		for(int i = 0; i < l; i++){
			System.out.print("-");
		}
		System.out.println();
	}
}