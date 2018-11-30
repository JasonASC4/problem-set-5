/**
 * Just like last time, the User class is responsible for retrieving
 * (i.e., getting), and updating (i.e., setting) user information.
 * This time, though, you'll need to add the ability to update user
 * information and display that information in a formatted manner.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

public class User {
	 private String first_name;
	 private String last_name;
	 private int pin;
	 private String dob;
	 private int telephone_number;
	 private String address;
	 private String city;
	 private String state;
	 private String postal_code;
	 
	 public User(String first_name, String last_name, int pin, String dob, int telephone_number, String address, String city, String state, String postal_code) {
		 	this.first_name = first_name; 
		 	this.last_name = last_name;
			this.pin = pin;
			this.dob = dob;
			this.telephone_number = telephone_number;
			this.address = address;
			this.city = city;
			this.state = state;
			this.postal_code = postal_code;
	}
	 
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public int getPIN() {
		return pin;
	}
	public String getDOB() {
		return dob;
	}
	public int getTelephone_number() {
		return telephone_number;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getPostal_code() {
		return postal_code;
	}
	
	public void setFirst_name( String first_name) {
		this.first_name = first_name;
	}
	public void setLast_name( String last_name) {
		this.last_name = last_name;
	}
	public void setPIN(int pin) {
		this.pin = pin;
	}
	public void setDOB(String dob) {
		this.dob = dob;
	}
	public void setTelephone_number(int telephone_number) {
		this.telephone_number = telephone_number;
	}
	public void setAddress( String address) {
		this.address = address;
	}
	public void setCity( String city) {
		this.city = city;
	}
	public void setState( String state) {
		this.state = state;
	}
	public void setPostal_code( String postal_code) {
		this.postal_code = postal_code;
	}
}