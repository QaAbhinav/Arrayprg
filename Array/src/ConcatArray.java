
public class ConcatArray {
	public static void main(String[] args) {
		int [] a={3,2,1};
		int [] b={6,5,4};
		int [] c= new int[a.length+b.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i];	
		}
		for (int i = 0; i < b.length; i++) {
			c[i+a.length]=b[i];
		}
		System.out.println("Merged array element");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println("Array elements after sorting:");  
		for (int i = 0; i < c.length; i++)   
		{  
			for (int j = i + 1; j < c.length; j++)   
			{  
				int tmp = 0;  
				if (c[i] > c[j])   
				{  
					tmp = c[i];  
					c[i] = c[j];  
					c[j] = tmp;  
				}  
			}  
			System.out.println(c[i]);  
		}  
	}  

}




