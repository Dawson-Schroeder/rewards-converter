import java.math.BigDecimal;
import java.math.RoundingMode;

public class RewardValue {

    private final BigDecimal cashValue;
    private final BigDecimal milesValue;

    public RewardValue(BigDecimal cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue.multiply(BigDecimal.valueOf(0.0035));
    }

    public RewardValue(double milesValue) {
        this.milesValue = BigDecimal.valueOf(milesValue);
        this.cashValue = this.milesValue.divide(BigDecimal.valueOf(0.0035), 2, RoundingMode.HALF_UP);
    }


    public BigDecimal getCashValue() {
        return cashValue;
    }

    public BigDecimal getMilesValue() {
        return milesValue;
    }
}



