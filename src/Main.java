import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int kenar1,kenar2;

		System.out.print("1. Kenarı Giriniz:");
		kenar1 = kb.nextInt();

		System.out.print("2. Kenarı Giriniz:");
		kenar2 = kb.nextInt();

		double kenar3  = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

		System.out.println("Hipotenüs :" + kenar3);

	}
}