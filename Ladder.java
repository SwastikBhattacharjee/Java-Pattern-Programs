public class Ladder
{  
//function to print the desired ladder Pattern  
static void ladder(int n)  
{  
for (int i = 0; i <= n; i++)  
{  
//prints the sub-pattern-1  
//n+1 time  
System.out.println("*   *");  
System.out.println("*   *");  
if (i < n)  
{  
//prints the sub-pattern-2 .i.e step of ladder  
//n times  
System.out.println("*****");  
}  
}  
}  
//driver Code  
public static void main(String args[])  
{  
//n is the number of steps  
int n = 7;  
//function calling  
ladder(n);  
}  
}  