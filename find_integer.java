import java.util.Scanner;
public class find_integer {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER TO BE SEARCHED IF PRESENT OR NOT:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr ={10,20,30,40,50};
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==num){
                System.out.print("YES THE NUMBER IS PRESENT AT THE INDEX :");
                System.out.println(i);
                break;
            }

            }

            System.out.println("THE NUMBER IS NOT PRESENT");

        }
    }

