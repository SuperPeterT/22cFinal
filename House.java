import java.text.DecimalFormat;

public class House {
	private final String street;
	private final String owner;
	private int zip;
	private int year;
	private String bedroom; // bedrooms
	private double price;
	
	
	
	
	
	public House(String street, String owner) {
		this.street = street;
		this.owner = owner;
		this.zip = -1;
		this.year = -1;
		this.price = 0;
		this.bedroom = "no bedroom";
		
	}
	
	
	
	
	
	
	
	
	public House(String street, String owner, int zip,int year, String bedroom, double price) {
		this.street = street;
		this.owner = owner;
		this.zip = zip;
		this.year = year;
		this.price = price;
		this.bedroom = bedroom;
	}
	
	
	/** ACCESSORS */
	
	public String getStreet() {
		return street;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getZip() {
		return zip;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getBedroom() {
		return bedroom;
	}
	
	
	
	
	
	@Override
	public String toString() {
		DecimalFormat d = new DecimalFormat("###,###.0");
		String result = "Street: " + street + "\nOwner: " + owner + "\nZip Code: " + zip + "\nYear: " + year + "\nBedroom Count: "
		+ bedroom + "\nPrice: $" + d.format(price) + "\n";
		return result;
	}
	
	
	
	// EQUALS //
	@Override public boolean equals(Object o) {
		if (o == this) {
			return true;
		} 
		else if (!(o instanceof House)) {
			return false;
		}
		else {
			House otherHouse = (House) o;
			return otherHouse.street.equals(street) && otherHouse.owner.equals(owner);
		}

	}
	
	@Override public int hashCode() {
		String key = street + owner;
		int sum = 0;
		for (int i = 0; i < key.length(); i++) {
			sum += (int) key.charAt(i);
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
