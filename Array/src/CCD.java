 import java.util.Arrays;

public class CCD {
	public static void main(String[] args) {
		int A[]={10,20,30};
		int B[]={40,50,60};
		int merge[]=new int[A.length + B.length];
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
