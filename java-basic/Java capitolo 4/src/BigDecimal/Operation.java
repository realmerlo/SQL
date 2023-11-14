package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operation {
    public enum operation {
        ADDICTION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION,
        MIN,
        MAX
    }
    private BigDecimal val1;
    private BigDecimal val2;
    private operation op;

    public Operation(BigDecimal val1, BigDecimal val2, operation op) {
        this.val1 = val1;
        this.val2 = val2;
        this.op = op;
    }

    public BigDecimal getVal1() {
        return val1;
    }

    public void setVal1(BigDecimal val1) {
        this.val1 = val1;
    }

    public BigDecimal getVal2() {
        return val2;
    }

    public void setVal2(BigDecimal val2) {
        this.val2 = val2;
    }

    public operation getOp() {
        return op;
    }

    public void setOp(operation op) {
        this.op = op;
    }

    public BigDecimal executeOp(){
        switch (op){
            case ADDICTION -> {
                return sum(val1,val2);
            }
            case SUBTRACTION -> {
                return sub(val1,val2);
            }
            case MULTIPLICATION -> {
                return multiply(val1,val2);
            }
            case DIVISION -> {
                return div(val1,val2);
            }
            case MAX -> {
                return max(val1,val2);
            }
            case MIN -> {
                return min(val1,val2);
            }
        }
        return BigDecimal.ZERO;
    }
    public BigDecimal sum (BigDecimal val1, BigDecimal val2){
        return val1.add(val2);
    }
    public BigDecimal sub (BigDecimal val1, BigDecimal val2){
        return val1.subtract(val2);
    }
    public BigDecimal multiply (BigDecimal val1, BigDecimal val2){
        return val1.multiply(val2);
    }
    public BigDecimal div (BigDecimal val1, BigDecimal val2){
        return val1.divide(val2,2, RoundingMode.HALF_EVEN);
    }
    public BigDecimal max (BigDecimal val1, BigDecimal val2){
        return val1.max(val2);
    }public BigDecimal min (BigDecimal val1, BigDecimal val2){
        return val1.min(val2);
    }

    @Override
    public String toString() {
        return "BigDecimal.Operation{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                ", op=" + op +
                '}';
    }
}
