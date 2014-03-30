package simulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        final int w = 8,h = 5;

        //マップ表示
        char[] map =(
                "########" +
                "# p    #" +
                "#      #" +
                "#      #" +
                "########").toCharArray();

        int pp = getIndexOf('p',map);

        while(true){
            displayMap(w,h,map);


            //pを操作
            System.out.println("上(0)右(1)下(2)左(3)");
            int move = scan.nextInt();


            switch(move){
                case 0: if(map[pp-w] != '#'){ map[pp-w] = 'p'; map[pp] = ' '; pp -= w;}break;
                case 1: if(map[pp+1] != '#'){ map[pp+1] = 'p'; map[pp] = ' '; pp += 1;}break;
                case 2: if(map[pp+w] != '#'){ map[pp+w] = 'p'; map[pp] = ' '; pp += w;}break;
                case 3: if(map[pp-1] != '#'){ map[pp-1] = 'p'; map[pp] = ' '; pp -= 1;}break;
            }
        }


    }

    public static void displayMap(int w,int h,char[] m){
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(m[j+i*w]);
            }
            System.out.print("\n");
        }
    }

    public static int getIndexOf(char s,char[] m){
       int i;
       for(i = 0; i < m.length; i++){
           if(m[i] == s) break;
       }
        return i;
    }
}
