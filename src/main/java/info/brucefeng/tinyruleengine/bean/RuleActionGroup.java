package info.brucefeng.tinyruleengine.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RuleActionGroup implements Serializable{
    private int ruleGroupId;
    private String ruleGroupName;
    private int type;
    private int ruleTrigger;
    private int stock;
    private Date startDate;
    private Date endDate;
    private int status;
    private List<RuleAction> ruleActionList;

    public int getRuleGroupId() {
        return ruleGroupId;
    }

    public void setRuleGroupId(int ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
    }

    public String getRuleGroupName() {
        return ruleGroupName;
    }

    public void setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getRuleTrigger() {
        return ruleTrigger;
    }

    public void setRuleTrigger(int ruleTrigger) {
        this.ruleTrigger = ruleTrigger;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<RuleAction> getRuleActionList() {
        return ruleActionList;
    }

    public void setRuleActionList(List<RuleAction> ruleActionList) {
        this.ruleActionList = ruleActionList;
    }
}
