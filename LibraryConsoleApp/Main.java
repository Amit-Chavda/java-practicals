import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		BookstoreBook bookstoreBook[] = new BookstoreBook[100];
		int bookstoreBookTracker = 0;
		LibraryBook libraryBook[] = new LibraryBook[200];
		int libraryBookTracker = 0;

		System.out.println("Welcome to the book program!");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Would you like to create a book object?(yes/no): ");
			if (!scanner.next().equalsIgnoreCase("yes")) {
				break;
			}

			System.out.print("Please enter the author, title and the isbn of the book seperated by /:");
			scanner.nextLine();
			String bookDetails = scanner.nextLine();

			System.out.println("Got it!");
			System.out.print(
					"Now tell me if it is a bookstore book or a library book (enter BB for bookstore book and LB for libraryr book): ");
			String bookType = scanner.nextLine();
			boolean isNotCorrectType = true;
			while (isNotCorrectType) {
				if (bookType.toLowerCase().equals("bb")) {
					isNotCorrectType = false;
				} else if (bookType.toLowerCase().equals("lb")) {
					isNotCorrectType = false;
				} else {
					System.out.print("Oops! That's not a valid entry. Please try again: ");
					bookType = scanner.nextLine();
				}
			}
			String bookDelailsArray[] = bookDetails.split("/");

			// check if bookstore book
			if (bookType.toLowerCase().equals("bb")) {
				bookstoreBook[bookstoreBookTracker] = new BookstoreBook();
				bookstoreBook[bookstoreBookTracker].setauthor(bookDelailsArray[0]);
				bookstoreBook[bookstoreBookTracker].setTitle(bookDelailsArray[1]);
				bookstoreBook[bookstoreBookTracker].setIsbn(bookDelailsArray[2]);

				System.out.print(
						"Please enter the list price of " + bookDelailsArray[1] + " by " + bookDelailsArray[0] + ":");
				double price = scanner.nextDouble();

				bookstoreBook[bookstoreBookTracker].setPrice(price + "");

				System.out.print("Is it on sale?(yes/no):");
				String yesNo = scanner.next();
				bookstoreBook[bookstoreBookTracker].setOnSale(false);

				if (yesNo.toLowerCase().equals("yes")) {
					System.out.print("Deductin percentage:");
					int deductionPercentage = scanner.nextInt();
					System.out.println("Got it!");

					bookstoreBook[bookstoreBookTracker].setOnSale(true);
					bookstoreBook[bookstoreBookTracker].setReductionPercentage(deductionPercentage);
				}

				System.out.println("\n\nHere is your bookstore book information\n"
						+ bookstoreBook[bookstoreBookTracker].toString() + "\n\n");

				bookstoreBookTracker++;
				// check if library book
			} else if (bookType.toLowerCase().equals("lb")) {

				libraryBook[libraryBookTracker] = new LibraryBook();

				libraryBook[libraryBookTracker].setauthor(bookDelailsArray[0]);
				libraryBook[libraryBookTracker].setTitle(bookDelailsArray[1]);
				libraryBook[libraryBookTracker].setIsbn(bookDelailsArray[2]);

				int xx = new Random().nextInt(99) + 1;
				String yyy = bookDelailsArray[0].substring(0, 2);
				char c = bookDelailsArray[2].charAt(bookDelailsArray[2].length() - 1);

				String callNumber = xx + "." + yyy + "." + c;

				libraryBook[libraryBookTracker].setCallNumber(callNumber);

				System.out.println("\n\nHere is your library book information\n"
						+ libraryBook[libraryBookTracker].toString() + "\n\n");
				libraryBookTracker++;
			}

		}

		// print all books
		System.out.println("\n\nHere are all your books...");
		System.out.println("Library books(" + libraryBookTracker + ")");
		for (int i = 0; i < libraryBookTracker; i++) {
			System.out.println(libraryBook[i].toString());
		}

		System.out.println("--------");
		System.out.println("Bookstore books(" + bookstoreBookTracker + ")");
		for (int i = 0; i < bookstoreBookTracker; i++) {
			System.out.println(bookstoreBook[i].toString());
		}

		scanner.close();
	}
}