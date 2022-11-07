
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
			
	}

	public static void sayiBulmaca() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int numbertoFind = 1;
		boolean isthereanumber = false;
		for (int number : numbers) {

			if (numbertoFind == number) {
				isthereanumber = true;
				break;
			}
		}
		String mesaj = "";
		if (isthereanumber) {
			mesaj = numbertoFind + " sayısı dizinin içindedir.";
			mesajVer(mesaj);

		} else {
			System.out.println(numbertoFind + " sayısı dizinin içerisinde bulunmamaktadır.");
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}
}
