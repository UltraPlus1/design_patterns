package static_factory_method.src.main.java.Mason;

public class MulOperation extends Operation {
    /**
     * 乘法运算类，重载运算类
     * @return 返回两数相乘的结果
     * @throws Exception
     */
    @Override
    public double getResult() throws Exception {
        return getFirstNumber()*getSecondNumber();
    }
}
