package assignments;
import java.util.*;
public class ReverseNumber {
	public static void main(String[]args)
	{

	int num,reverse=0;



	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the number");

	num = sc.nextInt();

	while(num!=0)
	{

	int digit = num%10;

	reverse = reverse*10 +digit;

	num=num/10;

	}

	System.out.println("The reverse of the number:" +reverse);
	
	}
}
