package œ∞Ã‚;

public class BookAttribute {
	private String booknumber;
	private String name;
	private String publisher;
	private double  price;
	public BookAttribute(String booknumber,String name,double price,String publisher) {
		this.booknumber=booknumber;
		this.name=name;
		this.price=price;
		this.publisher=publisher;
	}
	public String getBookNumber() {
		return this.booknumber;
	}
	public String getName() {
		return this.name;
	}
	public String getPublisher() {
		return this.publisher;
	}
	public double getPrice() {
		return this.price;
	}
	
	
}
