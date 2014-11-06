package info.brucefeng.tinyruleengine.bean;

import java.io.Serializable;
import java.util.List;

public class Rule implements Serializable{

    private int ruleId;
    private int ruleActionId;
    private int type;
    private String ruleTypeKey;
    private List<RuleValue> ruleValueList;

    public List<RuleValue> getRuleValueList() {
        return ruleValueList;
    }

    public void setRuleValueList(List<RuleValue> ruleValueList) {
        this.ruleValueList = ruleValueList;
    }

    public int getRuleId() {
        return ruleId;
    }

    public void setRuleId(int ruleId) {
        this.ruleId = ruleId;
    }

    public int getRuleActionId() {
        return ruleActionId;
    }

    public void setRuleActionId(int ruleActionId) {
        this.ruleActionId = ruleActionId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getRuleTypeKey() {
        return ruleTypeKey;
    }

    public void setRuleTypeKey(String ruleTypeKey) {
        this.ruleTypeKey = ruleTypeKey;
    }
}
