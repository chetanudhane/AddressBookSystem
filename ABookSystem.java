package day10.AddressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ABookSystem {

	ArrayList<ContactDetails> contactList = new ArrayList<>();
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

		contactList.add(contactDetails);

		System.out.println(contactList);
	}


	public void deleteDetails() {
		if (contactList.isEmpty()) {
			System.out.println("Contact list Empty...Enter Contact Details...");
			addContacts();
		} else {
			System.out.println("Enter Name To Delete Details...");
			String newName = sc.next();
			for (int i = 0; i < contactList.size(); i++) {
				if (contactList.get(i).getFirstName().equals(newName)) {
					contactList.remove(i);
					System.out.println(contactList);
				} else {
					System.out.println("Entered Name Not In Contact List...");
				}
			}
		}

	}

}
