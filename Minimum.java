import java.io.*;
import java.util.Scanner;
public class Minimum{
    public static void main(String args[]){
        int n,min;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The Value :");
        n=s.nextInt();
        int a[] = new int[n];
        for( int i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
        for( int i=0;i<n;i++)
        {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
              min=a[i];
              a[i]=a[j];
              a[j]=min;
        }
        }
        }
                System.out.println("The Mainimum Value Of The Number Is :"+a[0]);
            }
        }
