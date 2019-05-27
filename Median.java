import java.io.*;
import java.util.*;
public class Median{
     public static int middleOfThree(int a,int b,int c) { 
        if ((a<b&&b<c)||(c<b&&b<a)) 
        return b; 
        else if((b<a&&a<c)||(c<a&&a<b)) 
        return a; 
        else
        return c; 
    } 
    public static void main(String[] args) { 
        int a,b,c; 
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Three Values :");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.print("The Median Values :"); 
        System.out.println(middleOfThree(a,b,c));
    } 
} 
