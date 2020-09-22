import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;

public class CheckoutTest {
	@InjectMocks
	Checkout checkoutTest = new Checkout();

	@Test
	public void testPromotion1() {
		List<Product> listProduct = new ArrayList();
		Product producta = new Product();
		producta.setSkuid('A');
		Product producta1 = new Product();
		producta1.setSkuid('A');
		Product producta2 = new Product();
		producta2.setSkuid('A');

		listProduct.add(producta);
		listProduct.add(producta1);
		listProduct.add(producta2);
		int totalPrice = checkoutTest.calculateTotalPrice(listProduct);
		assertEquals(130, totalPrice);
	}
	
	@Test
	public void testPromotion2() {
		List<Product> listProduct = new ArrayList();
		Product producta = new Product();
		producta.setSkuid('C');
		Product producta1 = new Product();
		producta1.setSkuid('D');

		listProduct.add(producta);
		listProduct.add(producta1);
		int totalPrice = checkoutTest.calculateTotalPrice(listProduct);
		assertEquals(30, totalPrice);
	}

	@Test
	public void testScenarioA() {
		List<Product> listProduct = new ArrayList();
		Product producta = new Product();
		producta.setSkuid('A');
		Product producta1 = new Product();
		producta1.setSkuid('B');
		Product producta2 = new Product();
		producta2.setSkuid('C');

		listProduct.add(producta);
		listProduct.add(producta1);
		listProduct.add(producta2);
		int totalPrice = checkoutTest.calculateTotalPrice(listProduct);
		assertEquals(100, totalPrice);
	}
	
	@Test
	public void testScenarioB() {
		List<Product> listProduct = new ArrayList();
		Product product1 = new Product();
		product1.setSkuid('A');
		Product product2 = new Product();
		product2.setSkuid('A');
		Product product3 = new Product();
		product3.setSkuid('A');
		Product product4 = new Product();
		product4.setSkuid('A');
		Product product5 = new Product();
		product5.setSkuid('A');
		Product product6 = new Product();
		product6.setSkuid('B');
		Product product7 = new Product();
		product7.setSkuid('B');
		Product product8 = new Product();
		product8.setSkuid('B');
		Product product9 = new Product();
		product9.setSkuid('B');
		Product product10 = new Product();
		product10.setSkuid('B');
		Product product11 = new Product();
		product11.setSkuid('C');

		listProduct.add(product1);
		listProduct.add(product2);
		listProduct.add(product3);
		listProduct.add(product4);
		listProduct.add(product5);
		listProduct.add(product6);
		listProduct.add(product7);
		listProduct.add(product8);
		listProduct.add(product9);
		listProduct.add(product10);
		listProduct.add(product11);
		int totalPrice = checkoutTest.calculateTotalPrice(listProduct);
		assertEquals(370, totalPrice);
	}
	
	@Test
	public void testScenarioC() {
		List<Product> listProduct = new ArrayList();
		Product product1 = new Product();
		product1.setSkuid('A');
		Product product2 = new Product();
		product2.setSkuid('A');
		Product product3 = new Product();
		product3.setSkuid('A');
		Product product4 = new Product();
		product4.setSkuid('B');
		Product product5 = new Product();
		product5.setSkuid('B');
		Product product6 = new Product();
		product6.setSkuid('B');
		Product product7 = new Product();
		product7.setSkuid('B');
		Product product8 = new Product();
		product8.setSkuid('B');
		Product product9 = new Product();
		product9.setSkuid('C');
		Product product10 = new Product();
		product10.setSkuid('D');

		listProduct.add(product1);
		listProduct.add(product2);
		listProduct.add(product3);
		listProduct.add(product4);
		listProduct.add(product5);
		listProduct.add(product6);
		listProduct.add(product7);
		listProduct.add(product8);
		listProduct.add(product9);
		listProduct.add(product10);
		int totalPrice = checkoutTest.calculateTotalPrice(listProduct);
		assertEquals(280, totalPrice);
	}
}
