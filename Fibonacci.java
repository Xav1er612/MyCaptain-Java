import java.util.*;

public class Fibonacci
{  
 static int number1=0,number2=1,number3=0;    
 static void FibonacciSeries(int c)
 {    
    if(c>0)
    {    
         number3 = number1 + number2;    
         number1 = number2;    
         number2 = number3;    
         System.out.print(" "+number3);   
         FibonacciSeries(c-1);    
    }    
 }    
 public static void main(String args[])
 {    
  int c;
  Scanner in= new Scanner (System.in);
  System.out.println("Enter number for elements: ");
  c = in.nextInt();
  System.out.print(number1+" "+number2);    
  FibonacciSeries(c-2);   
 }  
}