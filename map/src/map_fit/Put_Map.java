package map_fit;

public class Put_Map{
    public static void method(int[] m,int h){
        for(int i = 0; i < m.length; i++){
            if(i % h == 5) System.out.println();
            System.out.print("*");
        }
    }
}
