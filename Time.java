import java.io.*;
import java.util.*;
public class Timeandminites{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Given To The Input seconds: ");
		int Time=s.nextInt(); 
        int p1=Time%60;
        int p2=Time/60;
        int p3=p2%60;
        p2=p2/60;
        System.out.print("The Time Is => "+p2+":"+p3+":"+p1);
		System.out.print("\n");
    }    
 }
