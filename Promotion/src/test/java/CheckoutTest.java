import org.junit.Test;
import org.mockito.InjectMocks;

public class CheckoutTest {
	@InjectMocks
	Checkout checkoutTest = new Checkout();

	@Test
	public void testScenarioA() {
		checkoutTest.addProductInCart(1);
	}
}
