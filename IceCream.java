//Output:-
//54321
// 5432
//  543
//   54
//    5
import java.util.*;

class IceCream{
    public static void main(String args[]){
        ascending();
    }
    public static void descending(){
        Scanner sc = new Scanner(System.in);
        print("Enter the number of rows:- ");
        int rows = sc.nextInt();
        for(int i = 0; i <= rows; i++){
            for(int k = 0; k <= i; k++){
                print(" ");
            }
            for(int j = rows; j >= i; j--){
                print("*");
            }
            print("\n");
        }
    }
    public static void ascending(){
        Scanner sc = new Scanner(System.in);
        print("Enter the number of rows:- ");
        int rows = sc.nextInt();
        for(int i = 0; i <= rows; i++){
            for(int k = 0; k <= rows - i; k++){
                print(" ");
            }
            for(int j = 1; j <= i; j++){
                print("*");
            }
            print("\n");
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