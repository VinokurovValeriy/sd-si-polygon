package com.netcracker.ec;

import com.netcracker.ec.rules.Rule;

import java.util.ArrayList;
import java.util.List;

/**
 * Includes list of added rule,
 * Calls method of objects of this list to check input string
 * @author alex_prus
 */
public class RuleHolder {
    private final List<Rule> rules = new ArrayList<>();//keep all rules

    /**
     * Save objects of class - Rule to ArrayList
     * @param rule object of Rule class
     * @return link on this ArrayList of rules
     */
    public RuleHolder ruleAdd(Rule rule) {
        rules.add(rule);
        return this;
    }

    public List<Rule> getRules() {
        return rules;
    }
}
