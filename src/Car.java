public class Car implements Vehicle{
    private String model;
    private int days;
    private static final double hourlyRate = 50;

    public Car(String model, int days){
        this.model = model;
        this.days = days;
    }
    @Override
    public double calculateRentalCost() {
        return days*hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Daily rental rate = "+hourlyRate);
        System.out.println("Car model: "+model);
        System.out.println("Renting cost: $" + calculateRentalCost());
    }
}
