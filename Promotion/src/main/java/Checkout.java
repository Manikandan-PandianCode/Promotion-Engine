import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Checkout {

	public int calculateTotalPrice(List<Product> products) {
		int countofA = 0;
		int priceofA = 50;
		for (Product product : products) {
			if ((String.valueOf(product.getSkuid()).equalsIgnoreCase("A")))
				countofA = countofA + 1;
		}
		int totalPriceofA = (countofA / 3) * 130 + (countofA % 3 * priceofA);
		return totalPriceofA;
	}
}
