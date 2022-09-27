package day10.AddressBookSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ABookSystem implements ABookInterface {

	public static final int exitNumber = 5;
	ArrayList<ContactDetails> contactList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void showDetails() {
		Iterator<ContactDetails> iterator = contactList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	@Override
	public void selectOperation() {
		boolean condition = true;
		do {
			System.out.println("Select Option To Perform Operation...");
			System.out.println("1. Add To Address Book\n" + "2. Edit Existing Entry\n" + "3. Display Address book\n"
					+ "4. Delete Contact\n" + exitNumber + ". Exit");

			switch (sc.nextInt()) {
			case 1:
				addContacts();
				break;
			case 2:
				editDetails();
				break;
			case 3:
				showDetails();
				break;
			case 4:
				deleteDetails();
				break;
			case exitNumber:
				condition = false;
				System.out.println("exit...");
				break;
			default:
				System.out.println("Enter Valid Option...");
				selectOperation();
				break;
			}

		} while (condition);

	}

	@Override
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

		System.out.println("Contact Added Successfully...");

	}

	@Override
	public void editDetails() {
		if (contactList.isEmpty()) {
			System.out.println("Contact list Empty...Enter Contact Details...");
		} else {
			System.out.println("Enter Name To Edit Details...");
			String newName = sc.next();
			for (int i = 0; i < contactList.size(); i++) {
				if (contactList.get(i).getFirstName().equals(newName)) {

					System.out.println("Enter new first name");
					contactList.get(i).setFirstName(sc.next());

					System.out.println("Enter new last name");
					contactList.get(i).setLastName(sc.next());

					System.out.println("Enter new address ");
					contactList.get(i).setAddress(sc.next());

					System.out.println("Enter new city ");
					contactList.get(i).setCity(sc.next());

					System.out.println("Enter new state ");
					contactList.get(i).setState(sc.next());

					System.out.println("Enter new zip-code ");
					contactList.get(i).setZipCode(sc.nextInt());

					System.out.println("Enter new mobile number");
					contactList.get(i).setMobileNumber(sc.nextLong());

					System.out.println("Enter new emailId");
					contactList.get(i).setEmailId(sc.next());
					System.out.println("Contact Updated..." + contactList);
				} else {
					System.out.println("Entered Name Not In Contact List...Check Contact List...");
				}
			}
		}

	}

	@Override
	public void deleteDetails() {
		if (contactList.isEmpty()) {
			System.out.println("Contact list Empty...Enter Contact Details...");
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
