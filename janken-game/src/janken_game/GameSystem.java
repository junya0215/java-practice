package janken_game;

public class GameSystem {

	public static void judge(int p,int n){
		switch(p-n){
			case -1: System.out.println("You Win"); break;
			case  2: System.out.println("You Win"); break;
			case  0: System.out.println("drow"); break;
			case  1: System.out.println("You Lose"); break;
			case -2: System.out.println("You Lose"); break;
			default: System.out.println("<<err>> End Game");
		}
	}

	public static void sleep(){
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	}

}
