package l.after;

public class EmployeeRole {
    public String firstName;
    public String lastName;
    public double salary;
    public double baseAmount;
    public double rankRate;

    public EmployeeRole(double baseAmount, double rankRate) {
        this.baseAmount = 12.50;
        this.rankRate = 2.0;
    }

    public void calculatePerHourRate(int rank) {
        salary = baseAmount + (rank * rankRate);
    }
}
