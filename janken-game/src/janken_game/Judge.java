package janken_game;

public class Judge {

	public static void judge(int p,int n){
		switch(p-n){
			case -1: case  2: System.out.println("You Win"); break;
			case  1: case -2: System.out.println("You Lose"); break;
			case  0: System.out.println("drow"); break;
			default: System.out.println("<<err>> End Game");
		}
	}
}
