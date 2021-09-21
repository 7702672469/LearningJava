import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
public class HangmanGame<i> {
    static List<String> Fruits = new ArrayList<String>();
    static String s;
    private static int index = 0;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("Fruits.txt");
        Scanner sc = new Scanner(file);
        int count = 0;
        int matchedCount=0;
        while (sc.hasNextLine()) {
            s = sc.next();
           Fruits.add(s);
            count++;
        }
        System.out.println(count);
        int random = (int) (Math.random() * (count - 0) + 0);
        String randomFruit = Fruits.get(random);
        System.out.println(randomFruit);
        System.out.println(randomFruit.length());
        String s1;
        s1 = randomFruit;
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = '_';
        }
        count=0;
        System.out.print("Guess the random fruit");
        for(char c: ch)
            System.out.print(c);
        for(int j=1;j<=10;j++)
        {
         Scanner sc1=new Scanner(System.in);
         char guessLetter=sc1.next().charAt(0);
         while(count<randomFruit.length())
         {
             if(Character.compare(guessLetter,randomFruit.charAt(count))==0)
             {
                 matchedCount=matchedCount+1;
                 ch[count]=guessLetter;
                 System.out.println("letter matched:try to guess again:)");
                 for(char c: ch)
                     System.out.print(c);
                 break;
             }
             count++;
         }
            if(matchedCount==randomFruit.length())
            {
                s1= new String(ch);
                if(s1.equalsIgnoreCase(randomFruit))
                {
                    System.out.println("you won!!!!!!!");
                    break;
                }
            }
         count=0;
            System.out.println("No. of attempts left:"+(10-j));
        }
    }
}


