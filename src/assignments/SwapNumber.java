package assignments;

public class SwapNumber {
	
	public static void main(String[] args) {
		int i=10, j=7;
		 
		System.out.printf("Before swap i=%d j=%d",i,j);   

		i=j+i;

		j=i-j;

		i=i-j;
		{

		System.out.printf("\nAfter swap i=%d j=%d",i,j);   
		}
	}

}
