/**
 * Use Case 2: Room Types and Static Availability
 *
 * Demonstrates abstraction, inheritance, and polymorphism.
 *
 * @author Srikanth
 * @version 2.0
 */

// Abstract Class
abstract class Room {
    int beds;
    double price;

    Room(int beds, double price) {
        this.beds = beds;
        this.price = price;
    }

    abstract String getRoomType();
}

// Single Room
class SingleRoom extends Room {

    SingleRoom() {
        super(1, 2000);
    }

    String getRoomType() {
        return "Single Room";
    }
}

// Double Room
class DoubleRoom extends Room {

    DoubleRoom() {
        super(2, 3500);
    }

    String getRoomType() {
        return "Double Room";
    }
}

// Suite Room
class SuiteRoom extends Room {

    SuiteRoom() {
        super(3, 5000);
    }

    String getRoomType() {
        return "Suite Room";
    }
}

// Main Class
public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        // Create room objects (Polymorphism)
        Room r1 = new SingleRoom();
        Room r2 = new DoubleRoom();
        Room r3 = new SuiteRoom();

        // Static availability
        boolean singleAvailable = true;
        boolean doubleAvailable = false;
        boolean suiteAvailable = true;

        // Display details
        System.out.println("=== Room Availability ===");

        System.out.println(r1.getRoomType() +
                " | Beds: " + r1.beds +
                " | Price: " + r1.price +
                " | Available: " + singleAvailable);

        System.out.println(r2.getRoomType() +
                " | Beds: " + r2.beds +
                " | Price: " + r2.price +
                " | Available: " + doubleAvailable);

        System.out.println(r3.getRoomType() +
                " | Beds: " + r3.beds +
                " | Price: " + r3.price +
                " | Available: " + suiteAvailable);
    }
}