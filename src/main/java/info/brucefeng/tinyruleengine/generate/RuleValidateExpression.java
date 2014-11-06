package info.brucefeng.tinyruleengine.generate;

import com.google.common.base.Preconditions;
import info.brucefeng.tinyruleengine.generate.exception.RuleValidateException;
import ognl.Ognl;
import ognl.OgnlException;

import java.io.Serializable;
import java.util.Map;

/**
 * rule validation expression
 */
public class RuleValidateExpression implements Serializable {
    private String expression;
    private Object compiledExpression;

    public RuleValidateExpression() {
    }

    public RuleValidateExpression(String expression, Object compiledExpression) {
        this.expression = expression;
        this.compiledExpression = compiledExpression;
    }

    public String getExpression() {
        return expression;
    }

    public RuleValidateExpression setExpression(String expression) {
        this.expression = expression;
        return this;
    }

    public Object getCompiledExpression() {
        return compiledExpression;
    }

    public RuleValidateExpression setCompiledExpression(Object compiledExpression) {
        this.compiledExpression = compiledExpression;
        return this;
    }

    /**
     * unthread safe
     * @param context
     * @return
     * @throws RuleValidateException
     */
    public boolean validate(Map<String, Object> context) throws RuleValidateException {
        try {
            Preconditions.checkArgument(context != null && !context.isEmpty());
            Object result = Ognl.getValue(compiledExpression, context);
            Preconditions.checkNotNull(result);
            return (Boolean) result;
        }catch (IllegalArgumentException ie){
            return false;
        }catch (NullPointerException ne){
            return false;
        }catch (OgnlException e) {
            throw new RuleValidateException(e);
        }
    }
}
