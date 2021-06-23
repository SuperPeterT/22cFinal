import java.util.Comparator;

public class Order<T> {
	private Customer customer;
	private String date;
	private List<House> orderContents;
	private int shippingSpeed;
	private int priority;

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public List<House> getOrderContents() {
	return orderContents;
}

public void setOrderContents(List<House> orderContents) {
	this.orderContents = orderContents;
}

public int getShippingSpeed() {
	return shippingSpeed;
}

public void setShippingSpeed(int shippingSpeed) {
	this.shippingSpeed = shippingSpeed;
}

public int getPriority() {
	return priority;
}

public void setPriority(int priority) {
	this.priority = priority;
	
	
}


    

//getters, setters, constructors go here

 

}

/* class ValueComparator implements Comparator<Order> {

	@Override
	public int compare(Order account1, Order account2) {
		return compare(account1.getShippingSpeed(), account2.getShippingSpeed());
	}
	
	
	
	
}	
	
}
*/
