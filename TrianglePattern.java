//Output:-
//54321
// 5432
//  543
//   54
//    5
import java.util.*;
import java.io.*;
class TrianglePattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        print("Enter the number of rows:- ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = rows; j >= i; j--){
                print(j);
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