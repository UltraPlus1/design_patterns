package simple_factory.src.main.java.Mason;

/**
 * 加法运算类 ，继承运算类
 */
public class AddOperation extends Operation{

    @Override
    public double getResult() throws Exception {
        return getFirstNumber()+getSecondNumber();
    }
}