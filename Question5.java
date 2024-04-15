import java.util.Dictionary;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Question5 {
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the
     * user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     * e.g.
     * > 5
     * > 2
     * > 4
     * > 1
     * > 3
     * > 4
     * 4
     * 
     * e.g.
     * > 4
     * > 2
     * > 2
     * > 3
     * > 3
     * 2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    int num = in.nextInt();
    int[] arr = new int[num];
    int[] count = new int[num];
    HashMap<Integer,Integer> dictionary = new HashMap<Integer,Integer>();
    
    for (int i = 0; i < num; i++) {
      // System.out.print("Enter a number: ");
      arr[i] = in.nextInt();
    }
    for (int number : arr) {
        if (dictionary.containsKey(number)) {
            dictionary.put(number, dictionary.get(number) + 1);
        } else {
            dictionary.put(number, 1);
        }
    }
    int mode = 0;
    int maxFrequency = 0;

    for (Map.Entry<Integer, Integer> entry : dictionary.entrySet()) {
        int number = entry.getKey();
        int frequency = entry.getValue();

        if (frequency > maxFrequency) {
            maxFrequency = frequency;
            mode = number;
        }
    }    
    System.out.println(mode);

  }
}
