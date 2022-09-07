import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {
        System.out.println("TO GENERATE A RANDOM NUMBER BY THE COMPUTER FRO PLAYING THE GAME");
        int min = 1;
        int max = 3;
        System.out.println("THE RANDOM VALUE FROM "+min+"TO"+max+"IS:");
        int random_val = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_val);
        if(random_val==1){
            System.out.println("THE COMPUTER DISPLAYS ROCK");
        }
        else if(random_val == 2){
            System.out.println("THE COMPUTER DISPLAYS PAPER");
        }
        else{
            System.out.println("THE COMPUTER DISPLAYS SCISSOR");
        }
        System.out.println("THE USER IS REQ TO ENTER ANY  NUMBER 1, 2 OR 3 TO PLAY THE GAME:");
        Scanner sc = new Scanner(System.in);
        int user_val = sc.nextInt();

        if(user_val == 1){
            System.out.println("THE USER DISPLAYS ROCK");
        }
        else if(user_val == 2){
            System.out.println("THE USER DISPLAYS PAPER");
        }
        else if(user_val == 3){
            System.out.println("THE COMPUTER DISPLAYS SCISSOR");
        }
        else{
            System.out.println("THE USER HAS PERFORMED AN INVALID OPERATION!!!");
        }
        if(random_val == 1 && user_val == 1){
            System.out.println("NO SIDE WINS");
        }
        else if(random_val == 1 && user_val == 2){
            System.out.println("THE USER WINS:PAPER OVER ROCK");
        }
        else if(random_val == 1 && user_val == 3) {
            System.out.println("THE COMPUTER WINS:ROCK OVER SCISSOR");
        }
        else if(random_val == 2 && user_val == 1) {
            System.out.println("THE COMPUTER WINS:PAPER OVER ROCK");
        }
        else if(random_val == 3 && user_val == 1) {
            System.out.println("THE USER WINS:PAPER OVER ROCK");
        }
        else if(random_val == 2 && user_val == 2) {
            System.out.println("NO ONE WINS");
        }
        else if(random_val == 2 && user_val == 3) {
            System.out.println("THE USER WINS:SCISSOR OVER PAPER");
        }
        else if(random_val == 3 && user_val == 2) {
            System.out.println("THE COMPUTER WINS:SCISSORS OVER PAPER");
        }
        else if(random_val == 3 && user_val == 3) {
            System.out.println("NO ONE WINS");
        }
        else{
            System.out.println("INVALID");
        }
    }
}
