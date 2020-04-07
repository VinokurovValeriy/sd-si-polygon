package com.netcracker.ec;

import com.netcracker.ec.rules.NoNumbersRule;
import com.netcracker.ec.rules.OnlyNumbersRule;
import com.netcracker.ec.rules.Rule;

import java.util.List;

/**
 * Contains application entry point
 * @author alex_prus
 */
public class Main {
    /**
     * Inpusts string,
     * creates ArrayList of rules, adds rules to that list
     * and calls check of this rules for input string
     * @param args - command line arguments, but they don't use
     */
    public static void main(String[] args) {
        InputStringProvider string = new InputStringProvider();
        RuleHolder ruleHolder = new RuleHolder();

        ruleHolder.ruleAdd(new NoNumbersRule())
                .ruleAdd(new OnlyNumbersRule());

        ruleHolder.getRules().stream()
                .filter(rule -> rule.checkString(string))
                .peek(rule -> Rule.countRules++)
                .forEach(System.out::println);
        //        checkRules(ruleHolder.getRules(), string);
    }

    private static void checkRules(List<Rule> ruleList, InputStringProvider string) {
        for (Rule rule : ruleList) {
            if (rule.checkString(string)) {
                Rule.countRules++;
                System.out.println(rule.getClass().getSimpleName() + " is true");
            }
        }
        if (Rule.countRules == 0) {//If there's no confirmed rules
            System.out.println("This line does not fit under any rule!");
        }
    }
}
