package complexpattern.interpreter;

/**
 * Created by CoT on 10/17/17.
 */
public class OperandExpression implements Expression {

    private String operand;

    public OperandExpression(String operand) {
        this.operand = operand;
    }

    public int intepret() {
        return Integer.parseInt(operand);
    }
}
