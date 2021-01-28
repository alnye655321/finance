package com.finance.finance.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;


@Entity
@Table(name = "accountTypes")
public class AccountType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "accountType")
    private String accountType;

    @OneToMany(mappedBy="accountType")
    private Set<Account> accounts;

    public AccountType() {
    }

    public AccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
}
