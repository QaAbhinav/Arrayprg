
public class RepetativeCharInString {
	public static void main(String[] args) 
	{  
		String str = "hello world";  
		int[] count = new int[str.length()];   
		char str1[] = str.toCharArray();            
		for(int i = 0; i <str.length(); i++) 
		{  
			count[i] = 1;  
			for(int j = i+1; j <str.length(); j++) 
			{  
				if(str1[i] == str1[j])
				{  
					count[i]++;  
					str1[j] = '0';  
				}  
			}              
			if(str1[i] != ' ' && str1[i] != '0')  
				System.out.println(str1[i] + "-" + count[i]);  
		}  
	}  

}


