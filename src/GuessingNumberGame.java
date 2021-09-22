import java.util.Scanner;
public class GuessingNumberGame {

    public static void main(String[] args) {
        int max=100;
        int min=1;
        int random=(int)(Math.random()*(max-min)+min);
        System.out.println("Guess any number between 1 and 100 to win the game");
        for(int i=0;i<10;i++) {
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            if (num==random) {
                System.out.println("you won the game!!");
                break;
            }
             if(random>num) {
                    System.out.println("its greater :" + num);
                }
            if(random<num){
                    System.out.println("its lesser than:.."+num);
                }
System.out.println("your chances left are:"+((10-i)-1));
        }


    }
}
