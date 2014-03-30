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
            do{
                System.out.println("Please choose one[goo(0) choki(1) par(2)]");
                player = scan.nextInt();
                if(player < 0 || player >= 3)
                    System.out.println("Please input again.");
            }while(player < 0 || player >= 3);
            npc    = rand.nextInt(3);

            //judge
            System.out.printf("player:%s npc:%s\n",hands[player],hands[npc]);
            sleep();

            System.out.println("--------------------------");
            Judge.judge(player,npc);
            if(player != npc){
                break;
            }
        }

    }

    public static void sleep(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }
}