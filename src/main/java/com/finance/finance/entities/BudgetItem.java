package com.finance.finance.entities;

import javax.persistence.*;

@Entity
@Table(name = "budget_items")
public class BudgetItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long budgetItemId;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;


}
