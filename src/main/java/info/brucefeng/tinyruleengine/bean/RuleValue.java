package info.brucefeng.tinyruleengine.bean;

import java.io.Serializable;

public class RuleValue implements Serializable{
    private int ruleValueId;
    private int ruleId;
    private String ruleValue;
    private int operator;

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

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }
}
