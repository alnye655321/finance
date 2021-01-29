package com.finance.finance.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "budget_items")
public class BudgetItem {

    //TODO need to create the controller and repository for this
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long budgetItemId;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @ManyToOne
    @JoinColumn(name="budget_type_id", nullable=false)
    private BudgetType budgetType;

    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name="accounting_period_id")
    private AccountingPeriod accountingPeriod;

    @Column(name = "amount")
    private double amount;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "created_date")
    private java.sql.Date createdDate;


}
