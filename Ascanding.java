import java.io.*;
import java.util.Scanner;
public class Sorted{
    public static void main(String args[]){
        int n,temp;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The Value :");
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
                System.out.println("Ascending Order Of The Numbers :");
                 for(int i=0;i<n;i++){
                     System.out.println(a[i]);
            }
    }
}
