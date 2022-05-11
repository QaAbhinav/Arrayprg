
public class Sorting {

public static void main(String[] args)
 {
	int id[]={11,12,65,44,88};
	int temp;
	for (int i=0;i < id.length; i++)
	{
		for (int j=i+1; j < id.length; j++)
		{
		if(id[i]>id[j])
		{
			temp=id[i];
			id[i]=id[j];
			id[j]=temp;
		}
		}
	}
	
	System.out.println("smallest no of array is "+id[0]);
	System.out.println("highest no of array is "+id[id.length-1]);
	System.out.println(" 3rd highest no of array is "+id[id.length-3]);
	System.out.println("second highest no of array is "+id[id.length-2]);
	System.out.println(" 2nd smallest no of array is "+id[id.length-4]);
	//for (int i=0;i<id.length;i++){
		//System.out.println(id[i]);
		}
	}

