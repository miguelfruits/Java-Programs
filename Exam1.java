package src;
abstract class LibraryItem {
    int id;
    String title;

    LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    abstract int calculateFine(int daysLate);
}

class Book extends LibraryItem {
    Book(int id, String title) {
        super(id, title);
    }

    int calculateFine(int daysLate) {
        if (daysLate < 0) throw new RuntimeException("InvalidDaysException");
        return daysLate * 5;
    }
}

class Magazine extends LibraryItem {
    Magazine(int id, String title) {
        super(id, title);
    }

    int calculateFine(int daysLate) {
        if (daysLate < 0) throw new RuntimeException("InvalidDaysException");
        return daysLate * 3;
    }
}



public class Exam1 {
	public static void main(String[] args) {
		LibraryItem b = new Book(1, "Java");
        LibraryItem m = new Magazine(2, "Tech");

        System.out.println("Book Fine: " + b.calculateFine(4));
        System.out.println("Magazine Fine: " + m.calculateFine(9));

	}
}
