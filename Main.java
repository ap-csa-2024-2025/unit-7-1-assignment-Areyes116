import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        
        System.out.println("Please enter words, enter STOP to stop the loop.");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            words.add(input);
        }
        
        System.out.println(words.size());
        System.out.println(words);
        
        if (words.size() > 2)
        {
            words.set(words.size() - 1, words.get(0)); // Replace last index with first
            words.remove(0); // Remove first index
        }
        
        System.out.println(words);
    }
}