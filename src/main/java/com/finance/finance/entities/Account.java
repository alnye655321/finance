package com.finance.finance.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;

    @ManyToMany
    private Set<User> linkedUsers;

    @ManyToOne
    @JoinColumn(name="account_type_id", nullable=false)
    private AccountType accountType;

    @Column(name = "balance")
    private double balance;

    @Column(name = "interest_rate")
    private double interestRate;

    @Column(name = "date_opened")
    @JsonFormat(pattern="yyyy-MM-dd")
    private java.sql.Date dateOpened;

    @Column(name = "date_closed")
    @JsonFormat(pattern="yyyy-MM-dd")
    private java.sql.Date dateClosed;


    public Account() {
    }

    public Account(long linkedUser, double balance, double interestRate, Date dateOpened, Date dateClosed) {
        this.linkedUsers = linkedUsers;

//        this.linkedUsers.add(userR)

        this.balance = balance;
        this.interestRate = interestRate;
        this.dateOpened = dateOpened;
        this.dateClosed = dateClosed;

    }

    public long getAccountId() {
        return accountId;
    }
    public void setAccountId(long id) {
        this.accountId = id;
    }

    public Set<User> getLinkedUsers() {
        return linkedUsers;
    }

    public void setLinkedUsers(Set<User> linkedUsers) {
        this.linkedUsers = linkedUsers;
    }
}
