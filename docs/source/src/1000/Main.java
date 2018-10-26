import java.util.*;

public class Main
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		while (!(a == 0 && b == 0))
		{
			int sum;
			sum = a + b;
			System.out.println (sum);
			a = scanner.nextInt();
			b = scanner.nextInt();
		}
	}
}