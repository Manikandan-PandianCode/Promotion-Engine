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
		int s = checkoutTest.calculateTotalPrice(listProduct);
		assertEquals(130, s);
	}

	
}
