package simple_factory.src.main.java.Mason;

public class SubOperation extends Operation {
    /**
     * 减法法运算类 ，继承运算类
     * @return 两数相减的结果
     * @throws Exception
     */

    @Override
    public double getResult() throws Exception {
        return getFirstNumber()-getSecondNumber();
    }
}
