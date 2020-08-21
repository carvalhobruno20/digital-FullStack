package produtos;

public class Produtos {
	private String name;
	private double price;
	private int quantity;

	public Produtos(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	public double 
	totalValueInStock() {
		return this.price * this.quantity;
	}

	public void addProducts(int quant) {
		this.quantity += quant;
		printData();
	}

	public void removeProducts(int quant) {
		this.quantity -= quant;
		printData();
	}

	public void printData() {
		System.out.println(String.format("Updated data: %s, $ %s, %s units, Total: $ %s\n", getName(), getPrice(),
				getQuantity(), totalValueInStock()));
	}

}
