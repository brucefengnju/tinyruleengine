package info.brucefeng.tinyruleengine.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RuleAction implements Serializable{
    private int ruleActionId;
    private int ruleGroupId;
    private int type;
    private BigDecimal actionValue;
    private String extraInfo;
    private int priority;
    private int status;
    private List<Rule> ruleList;

    public int getRuleActionId() {
        return ruleActionId;
    }

    public void setRuleActionId(int ruleActionId) {
        this.ruleActionId = ruleActionId;
    }

    public int getRuleGroupId() {
        return ruleGroupId;
    }

    public void setRuleGroupId(int ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BigDecimal getActionValue() {
        return actionValue;
    }

    public void setActionValue(BigDecimal actionValue) {
        this.actionValue = actionValue;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Rule> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<Rule> ruleList) {
        this.ruleList = ruleList;
    }
}
