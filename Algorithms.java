import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException 
    {
        f = new File("words.txt");
        int twoLetters = twoLetters();
        int longestTie = longestTie();
        System.out.println(twoLetters);
        System.out.println(longestTie);
        s.close();
    }

    public static int twoLetters() throws FileNotFoundException
    {
        s = new Scanner(f);
        int twoLetters = 0;
        while (s.hasNext()) 
        {
            String str = s.next();
            if (str.length() == 2)
                twoLetters++;
        }
        return twoLetters;
    }

    public static int longestTie() throws FileNotFoundException
    {
        s = new Scanner(f);
        int longestTie = 0;
        int longest = 0;
        while (s.hasNext()) 
        {
            String str = s.next();
            if (str.length() > longest)
            {
                longest = str.length();
            }
        }
        while(s.hasNext())
        {
            String str = s.next();
            if(str.length() == longest)
            {
                longestTie++;
            }
        }
        return longestTie;
    }
}
