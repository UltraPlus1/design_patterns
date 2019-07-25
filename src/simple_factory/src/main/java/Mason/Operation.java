package simple_factory.src.main.java.Mason;

/**
 * @author Mason
 * @description 运算类
 */
public abstract class Operation{
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public abstract double getResult() throws Exception;

}