import java.util.*;

/*
*           F  
*         I F I        
*       T I F I C      
*     R T I F I C A    
*   E R T I F I C A T  
* C E R T I F I C A T E 
*/

/*
*       N N 
*     A N N E  
*   C A N N E R  
* S C A N N E R S
*/

public class StringTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string:-");
        String str = removeSpaces(sc.nextLine().trim().toUpperCase());

        int length = str.length();

        int midpoint = midpoint(length);

        int spaces = (length % 2 == 0) ? (length - midpoint - 1) : (length - midpoint);

            for (int row = 1; row <= midpoint; row++) {
                int letters = (length % 2 != 0)?((row * 2) - 1):(row * 2);
                int counter = 0;
                for (int space = 0; space < spaces; space++) {
                    System.out.print("  ");
                }

                for (int letter = 0; letter < letters; letter++) {
                    System.out.print(" " + str.charAt(spaces + counter));
                    counter++;
                }

                spaces--;
                counter = 0;
                System.out.println();
            }
        
        sc.close();

    }

    public static String removeSpaces(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            s += (str.charAt(i) == ' ') ? "" : str.charAt(i);
        }

        return s;
    }

    public static int midpoint(int n) {
        return (n % 2 == 0) ? (n / 2) : ((n / 2) + 1);
    }
}
