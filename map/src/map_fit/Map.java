package map_fit;

import java.util.Scanner;

class Map{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        final int w,h;

        System.out.println("mapの幅と高さを指定");

        w = scan.nextInt();
        h = scan.nextInt();

        final int[] map = new int[w*h];

        Put_Map.method(map,h);



    }
}