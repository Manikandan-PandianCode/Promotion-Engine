
public class Product {
	Product() {

	}

	Product(char skuid) {
		this.skuid = skuid;
	}

	private char skuid;

	public char getSkuid() {
		return skuid;
	}

	public void setSkuid(char skuid) {
		this.skuid = skuid;
	}
}
