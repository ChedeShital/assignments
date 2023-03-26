package assignments;

public class gretest_number {
	public static void main(String[] args) {
		int a = 10;
		int b = 34;
		int c = 12;
		
		int larger,temp;
		
		temp = a>b?a:b;
		
		larger = c>temp?c:temp;
		System.out.println("The largest number is: "+larger);
	}

}
