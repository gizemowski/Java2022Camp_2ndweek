package oop1;

import java.io.ObjectInputStream.GetField;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(3);
		product2.setUnitPrice(4500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(4);
		product3.setUnitPrice(3500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer1 = new IndividualCustomer();
		individualCustomer1.setId(1);
		individualCustomer1.setCustomerNumber("434343434");
		individualCustomer1.setPhoneNumber("5544444444");
		individualCustomer1.setCustomerFirstName("Gizem");
		individualCustomer1.setCustomerLastName("Dikici");
		IndividualCustomer individualCustomer2 = new IndividualCustomer();
		individualCustomer2.setId(2);
		individualCustomer2.setCustomerNumber("324343434");
		individualCustomer2.setPhoneNumber("5544454444");
		individualCustomer2.setCustomerFirstName("Arif");
		individualCustomer2.setCustomerLastName("Dikici");;
		IndividualCustomer individualCustomer3 = new IndividualCustomer();
		individualCustomer3.setId(3);
		individualCustomer3.setCustomerNumber("334343434");
		individualCustomer3.setPhoneNumber("5543444444");
		individualCustomer3.setCustomerFirstName("Mete");
		individualCustomer3.setCustomerLastName("Dikici");
		
//		Customer[] customers= {individualCustomer1,individualCustomer2,individualCustomer3};
//		for (Customer customer : customers) {
//			System.out.println(customer.getId());
//			System.out.println(customer.getCustomerNumber());
//			System.out.println(customer.getPhoneNumber());
//			
//		
//		}
		
		CorporateCustomer corporateCustomer1 = new CorporateCustomer();
		corporateCustomer1.setId(4);
		corporateCustomer1.setCompanyName("Kodlama.io");
		corporateCustomer1.setPhoneNumber("5333333333");
		corporateCustomer1.setTaxNumber("22222222222");
		corporateCustomer1.setCustomerNumber("54321");
		
		CorporateCustomer corporateCustomer2 = new CorporateCustomer();
		corporateCustomer2.setId(5);
		corporateCustomer2.setCompanyName("Kodlamaa.io");
		corporateCustomer2.setPhoneNumber("5332333333");
		corporateCustomer2.setTaxNumber("22222222222");
		corporateCustomer2.setCustomerNumber("55321");
		
		Customer[] customers= {individualCustomer1,individualCustomer2,individualCustomer3,corporateCustomer1,corporateCustomer2};
		for (Customer customer : customers) {
			System.out.println(customer.getId());
			System.out.println(customer.getCustomerNumber());
			System.out.println(customer.getPhoneNumber());
	
		}
	}

}
