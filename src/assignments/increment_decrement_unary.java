package assignments;

public class increment_decrement_unary {
	public static void main(String[] args) {
		int i1 = 10;

		int j = i1++ + ++i1;

		System.out.println(j);
		
		int i2 = 10;

		int k = ++i2 + ++i2 + ++i2 + i2++;

		System.out.println(k);

int i3 = 10;

int m = ++i3 + i3++ +i3++ + i3++ + i3-- +i3-- + --i3;

System.out.println(m);
	}

}
