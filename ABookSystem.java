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
	
	public void editDetails() {
		if(contactList.isEmpty()) {
			System.out.println("Contact list Empty...Enter Contact Details...");
			addContacts();
		}else {
			System.out.println("Enter Name To Edit Details...");
			String newName = sc.next();
			for(int i=0;i<contactList.size();i++) {
				if(contactList.get(i).getFirstName().equals(newName)) {
					
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
					System.out.println("Contact Updated..."+contactList);
				}else {
					System.out.println("Invalid Name Entered...");
				}
			}
		}
	}

}
