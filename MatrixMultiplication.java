import java.util.Scanner;

public class MatrixMultiplication 
{   
    public static void main(String args[])
    {
        int i,j,p,q,x,y,k;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number of row of Matrix A:");
        p = in.nextInt();
        System.out.println("Enter number of column of Matrix A:");
        q = in.nextInt();

        int a[][]=new int[p][q];
        System.out.println("Enter the elements of the matrix A:");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter number of row of Matrix B:");
        x = in.nextInt();
        System.out.println("Enter number of column of Matrix B:");
        y = in.nextInt();

        int b[][]=new int[x][y];
        System.out.println("Enter the elements of the matrix B:");
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                b[i][j] = in.nextInt();
            }
        }

        System.out.println("Elements of the matrix A are:");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Elements of the matrix B are:");
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        if(q == x)
        {
            int c[][]=new int[p][y];
            for(i=0;i<p;i++)
        {
            for(j=0;j<y;j++)
            {
                for(k=0;k<x;k++)
                {
                c[i][j]+= a[i][k]*b[k][j] ;
                }
            }
        }

        System.out.println("Elements of the matrix C are:");
        for(i=0;i<p;i++)
        {
            for(j=0;j<y;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        }
        else
        {
            System.out.println("Given Matrix cannot be multiplied.");
        }
        
    }
}
