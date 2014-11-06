package info.brucefeng.tinyruleengine.bean;

import java.io.Serializable;

public class RuleValue implements Serializable{
    private int ruleValueId;
    private int ruleId;
    private String ruleValue;
    private  Operator operator;

    public int getRuleValueId() {
        return ruleValueId;
    }

    public void setRuleValueId(int ruleValueId) {
        this.ruleValueId = ruleValueId;
    }

    public int getRuleId() {
        return ruleId;
    }

    public void setRuleId(int ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleValue() {
        return ruleValue;
    }

    public void setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public static enum  Operator{
        Less("<"),
        LessEqual("<="),

        ;
        private String symbol;
        private Operator(String symbol){
            this.symbol = symbol;
        }
    }
}
