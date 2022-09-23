package day10.AddressBookSystem;

import java.util.Scanner;

public class ABookSystem {

	Scanner sc = new Scanner(System.in);

	public void addContacts() {

		ContactDetails contactDetails = new ContactDetails();

		System.out.println("Enter Contact Details.....");

		System.out.println("Enter First Name : ");
		contactDetails.setFirstName(sc.next());

		System.out.println("Enter Last Name : ");
		contactDetails.setLastName(sc.next());

		System.out.println("Enter Address : ");
		contactDetails.setAddress(sc.next());

		System.out.println("Enter City : ");
		contactDetails.setCity(sc.next());

		System.out.println("Enter State : ");
		contactDetails.setState(sc.next());

		System.out.println("Enter Zip-Code : ");
		contactDetails.setZipCode(sc.nextInt());

		System.out.println("Enter Mobile Number : ");
		contactDetails.setMobileNumber(sc.nextLong());

		System.out.println("Enter E-mail Id : ");
		contactDetails.setEmailId(sc.next());

		System.out.println(contactDetails.toString());

	}

}
