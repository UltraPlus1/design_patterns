package static_factory_method.src.main.java.Mason;

public class DivOperation  extends Operation{
    /**
     * 减法运算类，重载运算类
     * @return 两数相减结果
     * @throws Exception
     */
    @Override
    public double getResult() throws Exception {
        return getFirstNumber()/getSecondNumber();
    }
}
