import java.util.Arrays;
import java.util.Scanner;

public class Fhbhj {
	public static void main(String[] args) {
		int x,y;
		System.out.println("enter size of array A:");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("enter the element of array A");
		int A[]=new int[x];
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("enter size of array B:");
		y=sc.nextInt();
		System.out.println("enter the element of array B");
		int B[]=new int[y];
		for(int i=0;i<B.length;i++)
		{
			B[i]=sc.nextInt();
		}
		int merge[]=new int[A.length+B.length];
		for(int i=0;i<A.length;i++)
		{
			merge[i]=A[i];
		}

		for(int i=0;i<B.length;i++)
		{
			merge[i+A.length]=B[i];
		
		}
		for(int i=0;i<merge.length;i++)
		{
			System.out.println(merge[i]+"");
		}
		System.out.println("\n");
		System.out.println(Arrays.toString(merge));
	}
}









