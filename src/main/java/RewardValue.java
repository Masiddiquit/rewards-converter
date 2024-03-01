public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.0035;
    }

    // Constructor that accepts a value in miles (using String to distinguish from the other constructor)
    public RewardValue(String milesInput) {
        double milesValue = Double.parseDouble(milesInput);
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.2857; // 1 / 0.0035
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
