import java.util.Scanner;

public class MatrixAddition
{
    public static void main(String args[])
    {
        int i,j,p,q,x,y;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number of rows of matrix A:");
        p = in.nextInt();
        System.out.println("Enter number of column of matix A:");
        q = in.nextInt();

        int a[][] = new int[p][q];
        System.out.println("Enter the elements of matirx A:");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                a[i][j]= in.nextInt();
            }
        }

        System.out.println("Enter number of rows of matrix B:");
        x = in.nextInt();
        System.out.println("Enter number of columns of matrix B:");
        y = in.nextInt();

        int b[][]=new int[x][y];
        System.out.println("Enter the elements of matrix B:");
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                b[i][j]=in.nextInt();
            }
        }

        System.out.println("The elements of matrix A are:");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The elements of matrix B are:");
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        if(p==x && q==y)
        {
            int c[][]= new int[p][y];
            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
                {
                    c[i][j]= a[i][j] + b[i][j];
                }
            }

            System.out.println("Addition of the given two matrix is:");
            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
                {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("The given two matrix cannot be added.");
        }

        
    }
}