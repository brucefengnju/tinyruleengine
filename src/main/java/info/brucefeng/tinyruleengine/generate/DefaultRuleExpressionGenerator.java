package info.brucefeng.tinyruleengine.generate;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import info.brucefeng.tinyruleengine.bean.Rule;
import info.brucefeng.tinyruleengine.bean.RuleAction;
import info.brucefeng.tinyruleengine.generate.exception.RuleExpressionGenerateException;

import java.util.List;

public class DefaultRuleExpressionGenerator implements RuleExpressionGenerator {

    @Override
    public String generateUnitExpression(Rule rule)throws RuleExpressionGenerateException {
        try{
            Preconditions.checkArgument(
                    rule != null && rule.getRuleValueList() != null && !rule.getRuleValueList().isEmpty());
            List<String> unitExpressionList = Lists.newArrayList();

        }catch (IllegalArgumentException ie){
            return "";
        }catch (Exception e){
            throw new RuleExpressionGenerateException(e);
        }
        return "";
    }

    @Override
    public RuleValidateExpression generate(RuleAction ruleAction) throws RuleExpressionGenerateException{
        try{

        }catch (IllegalArgumentException ie){

        }catch (Exception e){

        }
        return null;
    }
}
