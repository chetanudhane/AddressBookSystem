package addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook implements AddressBookInterface {

	public static final int exitNumber = 5;
	Scanner sc = new Scanner(System.in);
	ArrayList<ContactList> contactlist = new ArrayList<>();
	private HashMap<String, ArrayList<ContactList>> addressBook = new HashMap<>();

	@Override
	public void selectOperation() {

		boolean condition = true;
		do {
			System.out.println("Select Option To Perform Operation...");
			System.out.println("1. Add Contacts\n" + "2. Edit Contact Details\n" + "3. Display Contact Details\n"
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

		ContactList contact = new ContactList();
		System.out.println("Enter First name:");
		contact.setFirstName(sc.next());

		System.out.println("Enter Last Name:");
		contact.setLastName(sc.next());

		System.out.println("Enter Address:");
		contact.setAddress(sc.next());

		System.out.println("Enter City:");
		contact.setCity(sc.next());

		System.out.println("Enter State:");
		contact.setState(sc.next());

		System.out.println("Enter Zip Code:");
		contact.setZipCode(sc.nextInt());

		System.out.println("Enter Mobile Number:");
		contact.setMobileNumber(sc.nextLong());

		System.out.println("Enter Email Id:");
		contact.setEmailId(sc.next());

		contactlist.add(contact);
		System.out.println("Contact Added Successfully");

		System.out.println("Enter a book name to which you want to add the contact..");
		String bookName = sc.next();

		if (addressBook.containsKey(bookName)) {
			ArrayList<ContactList> contactList = addressBook.get(bookName);
			addressBook.put(bookName, contactList);
			System.out.println("New Contact added to the " + bookName);
		} else {
			ArrayList<ContactList> contactList = addressBook.get(bookName);
			addressBook.put(bookName, contactList);
			System.out.println(bookName + " created ");
			System.out.println("New Contact added to the " + bookName);
		}

	}

	@Override
	public void editDetails() {

		if (contactlist.size() > 0) {
			String newFirstName;
			System.out.println("Enter First name of contact to edit it ");
			newFirstName = sc.next();

			for (int i = 0; i < contactlist.size(); i++) {
				if (contactlist.get(i).getFirstName().equals(newFirstName)) {
					System.out.println("\nSelect which one you want to update : ");
					System.out
							.println("1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Phone\n8.Email");

					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter new first name");
						contactlist.get(i).setFirstName(sc.next());
						break;
					case 2:
						System.out.println("Enter new last name");
						contactlist.get(i).setLastName(sc.next());
						break;
					case 3:
						System.out.println("Enter new Address");
						contactlist.get(i).setAddress(sc.next());
						break;
					case 4:
						System.out.println("Enter new city");
						contactlist.get(i).setCity(sc.next());
						break;
					case 5:
						System.out.println("Enter new state");
						contactlist.get(i).setState(sc.next());
						break;
					case 6:
						System.out.println("Enter new zip");
						contactlist.get(i).setZipCode(sc.nextInt());
						break;
					case 7:
						System.out.println("Enter new phone number");
						contactlist.get(i).setMobileNumber(sc.nextLong());
						break;
					case 8:
						System.out.println("Enter new email");
						contactlist.get(i).setEmailId(sc.next());
						break;
					default:
						System.out.println("Invalid Entry");
					}
					System.out.println("Contact Edited Successfully");
				} else
					System.out.println("Contact doesn't exist");
			}
		} else
			System.out.println("ContactList Empty...");

	}

	@Override
	public void deleteDetails() {

		if (contactlist.size() > 0) {
			System.out.println("Enter the firstName of the contact which you want to delete ");
			String delName = sc.next();
			for (int i = 0; i < contactlist.size(); i++) {
				if (contactlist.get(i).getFirstName().equals(delName)) {
					ContactList contact = contactlist.get(i);
					contactlist.remove(contact);
					System.out.println("Contact deleted Successfully...");
					break;
				} else
					System.out.println("Contact not found.... ");
			}
		} else
			System.out.println("ContactList Empty...");

	}

	@Override
	public void showDetails() {

		if (contactlist.size() > 0) {
			for (ContactList iterator : contactlist) {
				System.out.println(iterator);
			}
		} else {
			System.out.println("No Contact Found...");
		}

	}

}
