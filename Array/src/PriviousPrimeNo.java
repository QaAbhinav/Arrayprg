import java.util.Scanner;

public class PriviousPrimeNo {
		public static void priviousprimeno(int n) {
			boolean temp=false;
			while(!temp){
				temp=true;
				n--;
				for (int i = 2; i < n; i++) {
					if(n%i==0){
						temp=false;
						break;
					}
				}
				if(temp){
					System.out.println("Perivious prime no is "+n);
				}
				}
			}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number: ");
			int n=sc.nextInt();
			if(n<1){
				System.out.println("Please Enter Valid No");
			}
			else{
				priviousprimeno(n);
			}
		}

	}




