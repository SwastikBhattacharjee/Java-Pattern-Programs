/*
 *    *
 *   * *
 *  *   *
 * *     *
 *  *   *
 *   * *
 *    *
 */
import java.util.*;

class Rhombus{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        println("Enter the size of the rhombus you need[Minimum value is 5]: ");
        int size = sc.nextInt();
        while (size < 5) {
            println("Enter the size of the rhombus you need[Minimum value is 5]: ");
            size = sc.nextInt();
        }
        int space = 1;
        if(size % 2 == 0){
            space = (size/2);
        }
        else{
            space = (size/2)+1;
        }
        int space2 = 0;
        int stop = 1;
        for (int i = 0; i < size; i++) {
            if(space > 0){
                for (int j = 0; j < space; j++) {
                    if(space > 0){
                        print(" ");
                    }
                    else{
                        break;
                    }
                }
                space -= 1;
                for (int j = 1; j <= stop; j++) {
                    if(j == 1){
                        print("*");
                    }
                    else if(j == stop){
                        print("*");
                    }
                    else{
                        print(" "); 
                    }
                }
                if(stop == 1){
                    stop += 1;
                }
                else{
                    stop += 2;
                }
                println("\n");
            }
            else{
                for (int j = 0; j < space2; j++) {
                    if(space2 > 0){
                        print(" ");
                    }
                    else{
                        break;
                    }
                }
                space2 += 1;
                for (int j = 1; j <= stop; j++) {
                    if(j == 1){
                        print("*");
                    }
                    else if(j == stop){
                        print("*");
                    }
                    else{
                        print(" "); 
                    }
                }
                if(stop == 0){
                    stop -= 1;
                }
                else{
                    stop -= 2;
                }
                println("\n");
            }
        }

    }
    public static void print(String text){
        System.out.print(text);
    }
    public static void print(int text){
        System.out.print(text);
    }
    public static void println(String text){
        System.out.println(text);
    }
    public static void println(int text){
        System.out.println(text);
    }
}