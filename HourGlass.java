import java.util.*; 

public class HourGlass
{
  public static void main(String[] args)
  { 
      Scanner sc = new Scanner(System.in);
      println("Enter the number of rows you need:- ");
      int num = sc.nextInt();
     for(int i=1; i<=num; i++)
     {
         for(int k=1; k<=i-1; k++)
         {
             System.out.print(" ");
         } 
         for(int j=1; j<=num-i+1; j++)
         {
             System.out.print("* ");
         } 
         System.out.println();
     }
     for(int i=num-1; i>=1; i--)
     {
         for(int k=1; k<=i-1; k++)
         {
             System.out.print(" ");
         } 
         for(int j=i; j<=num; j++)
         {
             System.out.print("* ");
         } 
         System.out.println();
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