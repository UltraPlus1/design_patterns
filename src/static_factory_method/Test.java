package static_factory_method;

public class Test {
    public static void main(String[] args) throws Exception {
        Add(1,2);
        Sub(3,5);
        Mul(8,5);
        Div(4,6);

    }
    private static void Add(double num1,double num2) throws Exception {
        String opt = "+";
        Operation Opt = OperationFactory.createOperation(opt);
        Opt.setFirstNumber(num1);
        Opt.setSecondNumber(num2);
        double result = Opt.getResult();
        System.out.println(result);
    }
    private static void Sub(double num1,double num2) throws Exception {
        String opt = "-";
        Operation Opt = OperationFactory.createOperation(opt);
        Opt.setFirstNumber(num1);
        Opt.setSecondNumber(num2);
        double result = Opt.getResult();
        System.out.println(result);
    }
    private static void Div(double num1,double num2) throws Exception {
        String opt = "/";
        Operation Opt = OperationFactory.createOperation(opt);
        Opt.setFirstNumber(num1);
        Opt.setSecondNumber(num2);
        double result = Opt.getResult();
        System.out.println(result);
    }
    private static void Mul(double num1,double num2) throws Exception {
        String opt = "*";
        Operation Opt = OperationFactory.createOperation(opt);
        Opt.setFirstNumber(num1);
        Opt.setSecondNumber(num2);
        double result = Opt.getResult();
        System.out.println(result);
    }
}
