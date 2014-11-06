package info.brucefeng.tinyruleengine.generate;

import info.brucefeng.tinyruleengine.bean.Rule;
import info.brucefeng.tinyruleengine.bean.RuleAction;
import info.brucefeng.tinyruleengine.generate.exception.RuleExpressionGenerateException;

public interface RuleExpressionGenerator {

    /**
     * generate rule expression
     * @param rule
     * @return
     */
    public String generateUnitExpression(Rule rule)throws RuleExpressionGenerateException;

    /**
     * generate all rules of ruleaction expression
     * @param ruleAction
     * @return
     */
    public RuleValidateExpression generate(RuleAction ruleAction) throws RuleExpressionGenerateException;
}
