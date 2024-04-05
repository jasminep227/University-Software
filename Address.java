import java.util.Scanner;

public class Address {
	Scanner input = new Scanner(System.in);
	
	private int streetNumber;
	private String streetName;
	private String city;
	private String state;
	private int postalCode;
	
	public Address (int newStreetNumber, String newStreetName, String newCity, String newState, int newPostalCode) {
		this.streetNumber = newStreetNumber;
		this.streetName = newStreetName;
		this.city = newCity;
		this.state = newState;
		this.postalCode = newPostalCode;
	}
	
	@Override
	public String toString() {
		return "Street number: " + streetNumber + "\nStreet name: " + streetName + "\nCity: " + city + "\nState:" + state
				+ "\nPostal Code:" + postalCode;
	}
}
