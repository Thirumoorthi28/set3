import java.io.*;
import java.util.*;
public class ArrayIndex{
    public static void main(String args[]){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The Input :");
        n=s.nextInt();
        System.out.println("Enter The Elements:");
        int a[] =new int[n];
        for(int i=0;i<n;i++){
        a[i]=s.nextInt();
        }
        for (int i=0;i<n;++i){
        System.out.println("Element At The Index " + a[i] +": " +i );
      }
   }
}
