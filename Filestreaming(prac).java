import java.util.Scanner;
import java.io.File;
public class rev{
    public static void main(String[] args) {
        File myFile = new File("testfile.txt");
        try{
            myFile.createNewFile();
        }
        catch(Exception e){
            System.out.println("no file created");
            e.printStackTrace();

        }
//        try{
//            FileWriter myFileWriter = new FileWriter("testfile.txt");
//            myFileWriter.write (str:"this is my first file using java YAAY ");
//            myFileWriter.close();
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
        try {
            File myFile1 = new File("test2.txt");
            Scanner sc = new Scanner(myFile1);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try{
            File myFile2 = new File("test2.txt");
            if(myFile2.delete()){
                System.out.println("it has been deleted:"+myFile2.getName());
            }
            else{
                System.out.println("an error has occurred");
            }
        }
        catch (Exception e){
            System.out.println("error");
            e.printStackTrace();
        }

    }
}



//
FileOutputStream fos = new FileOutputString();
String text = "nananan";
fos.write(text);
fos.flush();
fos.close();
