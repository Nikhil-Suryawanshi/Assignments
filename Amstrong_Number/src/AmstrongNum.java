import java.util.Scanner;
public class AmstrongNum {
	
	static boolean isAmstrong(int num,int digit){
		/*System.out.println("The Number '"+num);
		System.out.println("The digit '"+digit);*/
		
		int temp=num,remainder=0,sum=0;
		while(num>0) {
			remainder=num%10;
			sum += Math.pow(remainder, digit);
			//System.out.println(sum);
			num/=10;
		}
		
		
		if(temp==sum) {
		return true;
		}
		else return false;
	}
	
	static int findDigits(int num) {
		int digit=0;
		while(num>0) {
			num/=10;
			digit++;
		}
		//System.out.println(digit);
		return digit;
	}
	
	public static void main(String args[]) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Range: ");
		System.out.println("(Starting Number) From:");
		num1=sc.nextInt();
		System.out.println("(Last Number) To:");
		num2=sc.nextInt();
		
		for(int i=num1;i<=num2;i++) {
			if(isAmstrong(i,findDigits(i))) {
				System.out.print(i+" ,");
			}
		}
	}
	
	
	

}
