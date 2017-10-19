package complexpattern.interpreter;

/**
 * Created by CoT on 10/17/17.
 */
public class OperatorExpression implements Expression {

    private OperatorExpression leftOperand;
    private OperatorExpression rightOperand;
    private char operator;

    public OperatorExpression(OperatorExpression leftOperand, OperatorExpression rightOperand, char operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public int intepret() {
        switch (operator){
            case '+':
                return leftOperand.intepret() + rightOperand.intepret();
            case '-':
                return leftOperand.intepret() - rightOperand.intepret();
            case '*':
                return leftOperand.intepret() * rightOperand.intepret();
            case '/':
                return leftOperand.intepret() / rightOperand.intepret();
            default:
                return 0;
        }
    }
}
