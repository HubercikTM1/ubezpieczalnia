package com.company.classes;

import com.company.enums.PolicyType;

import java.util.Date;

public class PolicyClass {

    private int id;
    private CustomerClass policyHolder;
    private CustomerClass policyInsured;
    private CustomerClass policyBeneficiary;
    private RiskClass Risk;
    private Date policy_from;
    private Date policy_to;
    private double contributionAmount;
    private PolicyType policyType;


    //CONSTRUCTOR
    public PolicyClass(int id, CustomerClass policyHolder, CustomerClass policyInsured, CustomerClass policyBeneficiary,
                       RiskClass risk, Date policy_from, Date policy_to, double contributionAmount, PolicyType policyType) {
        this.id = id;
        this.policyHolder = policyHolder;
        this.policyInsured = policyInsured;
        this.policyBeneficiary = policyBeneficiary;
        Risk = risk;
        this.policy_from = policy_from;
        this.policy_to = policy_to;
        this.contributionAmount = contributionAmount;
        this.policyType = policyType;
    }

    //GETTERS
    public int getId() {
        return id;
    }
    public CustomerClass getPolicyHolder() {
        return policyHolder;
    }
    public CustomerClass getPolicyInsured() {
        return policyInsured;
    }
    public CustomerClass getPolicyBeneficiary() {
        return policyBeneficiary;
    }
    public RiskClass getRisk() {
        return Risk;
    }
    public Date getPolicy_from() {
        return policy_from;
    }
    public Date getPolicy_to() {
        return policy_to;
    }
    public double getContributionAmount() {
        return contributionAmount;
    }
    public PolicyType getPolicyType() {
        return policyType;
    }


    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setPolicyHolder(CustomerClass policyHolder) {
        this.policyHolder = policyHolder;
    }
    public void setPolicyInsured(CustomerClass policyInsured) {
        this.policyInsured = policyInsured;
    }
    public void setPolicyBeneficiary(CustomerClass policyBeneficiary) {
        this.policyBeneficiary = policyBeneficiary;
    }
    public void setRisk(RiskClass risk) {
        Risk = risk;
    }
    public void setPolicy_from(Date policy_from) {
        this.policy_from = policy_from;
    }
    public void setPolicy_to(Date policy_to) {
        this.policy_to = policy_to;
    }
    public void setContributionAmount(double contributionAmount) {
        this.contributionAmount = contributionAmount;
    }
    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }

}
