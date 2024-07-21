public class Bike implements Vehicle{
    private String brand;
    private int hour;
    private static final double hourlyRate = 10;

    public Bike(String brand, int hour){
        this.brand = brand;
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return hour*hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Daily rental rate = "+hourlyRate);
        System.out.println("Bike brand: "+brand);
        System.out.println("Renting cost: $" + calculateRentalCost());
    }
}
