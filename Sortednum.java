
import java.util.Scanner;
public class Sortnum{
public static void main(String args[]){
    int n,i,j,temp;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter The Values :");
	n=s.nextInt();
	int[] a=new int[n];
	for(i=0;i<n;i++){
	a[i]=s.nextInt();
	}
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
		if(a[i]>a[j]){
		    temp=a[i];
			a[i]=a[j];
		    a[j]=temp;
			}
		}
	}
	System.out.println("The Order Of The Numbers :");
	for(i=0;i<n;i++){
	System.out.print(a[i]+ " ");
	}
	}
}
