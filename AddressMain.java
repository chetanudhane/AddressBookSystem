package day10.AddressBookSystem;

public class AddressMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book System");

		ABookSystem addressBook = new ABookSystem();
		addressBook.addContacts();
		addressBook.deleteDetails();

	}

}
