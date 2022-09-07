import java.util.Scanner;

public class website_from_url{
    public static void main(String[] arg){
        System.out.println("enter the url:");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine() ;
        switch(url){
            case ".com":
                System.out.println("this url stands for COMMERCIAL WEBSITE");
                break;
            case ".org":
                System.out.println("this url stands for ORGANISATION WEBSITE");
                break;
            case".in":
                System.out.println("this url stands for INDIAN WEBSITE");
                break;
            default:
                System.out.println("this url is not included");
        }


    }

}