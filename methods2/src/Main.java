
public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün hava çok güzel.";
		//String yenimesaj = mesaj.substring(0,4);//yeni bir mesaj oluşturdu 4.karaktere kadar
		String yenimesaj = sehirVer(); 
		System.out.println(yenimesaj);
		int sayi = total(7,5);
		//sayi=3+total();
		System.out.println(sayi);
		int toplam = total2(2,4,6);
		System.out.println(toplam);

		
		
	}
	public static void insert() {
		System.out.println("Eklendi");
	}
	public static void delete() {
		System.out.println("Silindi");
	}
	public static void update() {
		System.out.println("Güncellendi");
	}
	public static int total(int sayi1,int sayi2) {
		return sayi1+sayi2;
		
	}
	public static int total2(int... sayilar) {
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}
}

