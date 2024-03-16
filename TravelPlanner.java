import java.util.*;

public class TravelPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Travel Itinerary Planner!");
        System.out.print("Enter the number of destinations: ");
        int numDestinations = scanner.nextInt();
        
        List<Destination> destinations = new ArrayList<>();
        
        for (int i = 1; i <= numDestinations; i++) {

            System.out.println("\nDestination " + i + ":");
            System.out.print("Enter destination name: ");
            String name = scanner.next();
            System.out.print("Enter arrival date (MM/DD/YYYY): ");
            String arrivalDate = scanner.next();
            System.out.print("Enter departure date (MM/DD/YYYY): ");
            String departureDate = scanner.next();
            destinations.add(new Destination(name, arrivalDate, departureDate));
        }
        
        System.out.println("\n--- Travel Itinerary ---");
        for (Destination destination : destinations) {
            System.out.println(destination);
        }
    }
}

class Destination {
    private String name;
    private String arrivalDate;
    private String departureDate;
    
    public Destination(String name, String arrivalDate, String departureDate) {
        this.name = name;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
    }
    
    @Override
    public String toString() {
        return "Destination: " + name + ", Arrival: " + arrivalDate + ", Departure: " + departureDate;
    }
}
