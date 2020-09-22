import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Checkout {

	public int calculateTotalPrice(List<Product> products) {
		int countofA = 0;
		int priceofA = 50;
		int countofB = 0;
		int priceofB = 30;
		int counterC = 0;
		int priceofC = 20;

		for (Product product : products) {
			if ((String.valueOf(product.getSkuid()).equalsIgnoreCase("A")))
				countofA = countofA + 1;
			else if ((String.valueOf(product.getSkuid()).equalsIgnoreCase("B")))
				countofB = countofB + 1;
			else if ((String.valueOf(product.getSkuid()).equalsIgnoreCase("C")))
				counterC = counterC + 1;
		}
		int totalPriceofA = (countofA / 3) * 130 + (countofA % 3 * priceofA);
		int totalPriceofB = (countofB / 2) * 45 + (countofB % 2 * priceofB);
		int totalPriceofC = (counterC * priceofC);
		return totalPriceofA + totalPriceofB + totalPriceofC;

	}
}
