import java.io.*;
import java.util.*;
public class Numeric{
    public static void main(String args[]){
        String str;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Input :");
        str=s.nextLine();
        boolean numeric=true;
        numeric=str.matches("-?\\d+(\\.\\d+)?");
        if(numeric)
            System.out.println("YES "+str+" is a number");
        else
            System.out.println("NO "+str+ " is not a number");
    }
}
