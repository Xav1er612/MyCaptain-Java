import java.util.*;
public class GradeCalculation
{
    public static void main(String args[])
    {
        int mark[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
        for(i=0; i<6; ++i) { 
           System.out.print("Marks of Subject: ");
           mark[i] = scanner.nextInt();
           total = total + mark[i];
        }
        scanner.close();
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}