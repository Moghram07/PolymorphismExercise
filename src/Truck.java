public class Truck implements Vehicle{
    private String type;
    private int week;
    private static final double weeklyRate = 500;

    public Truck(String type, int week){
        this.type = type;
        this.week = week;
    }
    @Override
    public double calculateRentalCost() {
        return week*weeklyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Daily rental rate = "+ weeklyRate);
        System.out.println("Truck type: "+type);
        System.out.println("Renting cost: $" + calculateRentalCost());
    }
}
