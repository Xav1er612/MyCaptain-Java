import java.util.Scanner;

public class MinutesToYears
{

    public static void main(String[] Strings)
	{
        double minInYear = 365*24*60;
            Scanner input = new Scanner(System.in);
                System.out.print("Input the number of minutes: ");
        double min = input.nextDouble();
        long years = (long) (min / minInYear);
        int days = (int) (min / 60 / 24) % 365;
                System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
	}
}