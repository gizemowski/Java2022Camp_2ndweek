public class Main {

	// private static int sayi1;
	public static void main(String[] argumans) {
		// referance type
		CustomerManager customerManeger = new CustomerManager();
		customerManeger.Add();
		customerManeger.Remove();
		customerManeger.Update();

		// value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		

		System.out.println(sayi2);

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2[0] = sayilar1[0];
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);

	}


}
