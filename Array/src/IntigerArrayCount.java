import java.util.Arrays;

public class IntigerArrayCount
{
	public static void main (String[] args) {
		int[] arr = {1,2,2,5,6,7,9,7,5};
		int size = arr.length;
		count(arr,size);
	}
	static void count(int[] arr,int n)
	{
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			int count = 1;
			while(i < n-1 && arr[i] == arr[i + 1]) {
				i++;
				count++;
			}
			System.out.println(arr[i] + "-" + count);
			count++;
		}
	}
}

