import java.util.Scanner;
import java.util.Random;
class game{
    private int computer_input;
    private int user_input;
    private int score;


      game(){
        Random r = new Random();
        computer_input = r.nextInt(0,10);
    }

    public int getComputer() {
        return computer_input;
    }

    public void setGuess(int g){
        user_input = g;
    }
    public int getGuess(){
        return user_input;
    }
    public boolean isCorrectNumber(){
        if(user_input==computer_input){
            System.out.println("Correct!");
            return true;

        }

        else if(user_input>computer_input){
            System.out.println("the number guessed is greater");
            return false;

        }
        else{
            System.out.println("the number guessed is smaller");
            return false;

        }

        }


        public int Score(){
          Scanner sc = new Scanner(System.in);
            System.out.println("ENTER YOUR GUESS NUMBER:");
          int i;
          for(i = 1; i<100; i++) {
              int guess = sc.nextInt();
              setGuess(guess);
              if(getGuess()==getComputer()){
                  isCorrectNumber();
                  break;

              }

              else {

                  isCorrectNumber();
              }
          }
            score = i;
            System.out.println("YOUR SCORE IS : "+score);

        return score;

        }

    }




public class guess_the_number {
    public static void main(String[] args) {
        game status = new game();
        status.Score();
    }
}
