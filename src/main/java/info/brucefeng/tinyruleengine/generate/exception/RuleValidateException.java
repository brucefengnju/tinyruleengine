package info.brucefeng.tinyruleengine.generate.exception;

public class RuleValidateException extends Exception {
    public RuleValidateException() {
    }

    public RuleValidateException(String message) {
        super(message);
    }

    public RuleValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuleValidateException(Throwable cause) {
        super(cause);
    }
}
