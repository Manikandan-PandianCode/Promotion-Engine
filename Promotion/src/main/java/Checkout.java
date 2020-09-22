import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Checkout {

	public void addProductInCart(int numberofItems) {
		List<Product> products = new ArrayList<Product>();
		Scanner skuInput = new Scanner(System.in);
		for (int i = 1; i < numberofItems; i++) {
			System.out.println("Enter the SKUids " + i + "Out of " + numberofItems);
			char skuid = skuInput.next().charAt(0);
			Product product = new Product(skuid);
			products.add(product);
		}
	}
}
