package info.brucefeng.tinyruleengine.generate.exception;

public class RuleExpressionGenerateException extends Exception {
    public RuleExpressionGenerateException() {
    }

    public RuleExpressionGenerateException(String message) {
        super(message);
    }

    public RuleExpressionGenerateException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuleExpressionGenerateException(Throwable cause) {
        super(cause);
    }
}
