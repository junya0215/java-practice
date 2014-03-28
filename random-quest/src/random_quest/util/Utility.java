package random_quest.util;

public class Utility {
	public static void line(int l){
		for(int i = 0; i < l; i++){
			System.out.print("-");
		}
		System.out.println();
	}

	public static void sleep(){
		try {
		    Thread.sleep(3000);
		} catch (InterruptedException e) {
			//System.out.println("end phase");
		}
	}
}
