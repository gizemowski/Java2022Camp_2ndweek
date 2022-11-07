
public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(4, 5);
		int sonuc1 = dortIslem.Carp(5, 4);
		int sonuc2 = dortIslem.Bol(52, 4);
		int sonuc3 = dortIslem.Cikar(5, 4);

		System.out.println(sonuc);
		System.out.println(sonuc1);
		System.out.println(sonuc2);
		System.out.println(sonuc3);

	}

}
