package CreativePatterns.static_factory_method;

public class OperationFactory {
    public static Operation oper = null;

    public static Operation createOperation(String operator){
        switch(operator){
            case "+":
                oper = new AddOperation();
                break;
            case "-":
                oper = new SubOperation();
                break;
            case "*":
                oper = new MulOperation();
                break;
            case "/":
                oper = new DivOperation();
                break;
            default:
                break;
        }
        return oper;
    }

}
