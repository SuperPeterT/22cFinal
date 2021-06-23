import java.text.DecimalFormat;

public class Customer {

	private String first_name;
	private String last_name;
	private String login;
	private String password;
	private String address;
	private String city;
	private String state;
	private String zip; // or int
	private List<Order> orders;

	// Constructor
	public Customer() {
		this.first_name = "";
		this.last_name = "";
		this.login = "";
		this.password = "";
		this.address = "";
		this.city = "";
		this.state = "";
		this.zip = "";
	}

	public Customer(String fname, String lname, String login, String password, String address, String city,
			String state, String zip, List<Order> orderList) {
		this.first_name = fname;
		this.last_name = lname;
		this.login = login;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.orders = orderList;

	}

	// Getter
	public String getName() {
		return this.first_name + " " + this.last_name;
	}

	public String getFirstName() {
		return this.first_name;
	}

	public String getLastName() {
		return this.last_name;
	}

	public String getLogin() {
		return this.login;
	}

	public String getPassword() {
		return this.password;
	}

	public String getFullAddress() {
		return this.address + "\n" + this.city + ", " + this.state + "-" + this.zip;
	}

	public List<Order> getOrders() {
		return orders;
	}

	// Setter
	public void setFname(String firstName) {
		this.first_name = firstName;
	}

	public void setLname(String lastName) {
		this.last_name = lastName;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public void setOrdersList(List<Order> orderList) {
    	this.orders = new List<Order>(orderList);
    }
	
	
	@Override
	public String toString() {
		String result = "";
		result += "Name: " + first_name + " " + last_name + "\n";
	//	result += "Account Number: " + accountNum + "\n";
	//	result += "Total Cash: $" + new DecimalFormat("###,###,###.00").format(cash);

		return result;

	}
	
	
	
	
	
	
	

}