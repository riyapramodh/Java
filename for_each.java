import java.util.Scanner;
public class for_each {
    public static void main(String[] args) {
        System.out.println("TO CALCULATE AVERAGE MARKS OF STUDENTS:");

        float []marks ={29f, 67.5f, 90.25f, 100, 50.5f};
        float sum = 0;
        for(float element:marks){
            sum = sum+ element;
        }
        float average = sum/marks.length;
        System.out.println(average);

        }
    }

