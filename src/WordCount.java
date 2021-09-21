import java.io.File;
import java.io.FileNotFoundException;
import  java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        int count=0;
      File file=new File("personalData.txt");
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()==true) {
                String Line=sc.nextLine();
                count=count+Line.split(" ").length;
            }
            System.out.println("LineCountFinal:"+count);
    }
}
