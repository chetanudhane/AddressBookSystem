package day10.AddressBookSystem;

import java.util.Scanner;

public class ABookSystem {

	ContactDetails contactDetails;

	public void addContacts() {

		System.out.println("Enter Contact Details.....");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		String firstName = sc.next();
		System.out.println("Enter Last Name : ");
		String lastName = sc.next();
		System.out.println("Enter Address : ");
		String address = sc.next();
		System.out.println("Enter City : ");
		String city = sc.next();
		System.out.println("Enter State : ");
		String state = sc.next();
		System.out.println("Enter Zip-Code : ");
		int zipCode = sc.nextInt();
		System.out.println("Enter Mobile Number : ");
		long mobileNumber = sc.nextLong();
		System.out.println("Enter E-mail Id : ");
		String emailId = sc.next();
		contactDetails = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
		sc.close();

	}

	@Override
	public String toString() {
		return "ABookSystem [contactDetails=" + contactDetails + "]";
	}

}
