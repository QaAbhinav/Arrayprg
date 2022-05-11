import java.util.Scanner;

public class NextPalindromNo {
	public static void nextpalindromno(int n) {
	int sum=0;
	int rem=0;
	int temp;
	
	while(true){
		n++;
		temp=n;
		sum=rem=0;
		while(temp>0){
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
			}
		if(sum==n){
			System.out.println("Next Pallindrome no is "+n);
			break;
		}			}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
		if(n<=1){
			System.out.println("Please Enter Valid No");
		}
		else{
			nextpalindromno(n);
		}
	}

}

