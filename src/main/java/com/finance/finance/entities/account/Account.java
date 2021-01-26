package com.finance.finance.entities.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.finance.finance.entities.user.User;
import com.finance.finance.entities.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    private Set<User> linkedUsers;

    @Column(name = "balance")
    private double balance;

    @Column(name = "interestRate")
    private double interestRate;

    @Column(name = "dateOpened")
    @JsonFormat(pattern="yyyy-MM-dd")
    private java.sql.Date dateOpened;

    @Column(name = "dateClosed")
    @JsonFormat(pattern="yyyy-MM-dd")
    private java.sql.Date dateClosed;

    public Account(long linkedUser, double balance, double interestRate, Date dateOpened, Date dateClosed) {
        this.linkedUsers = linkedUsers;

//        this.linkedUsers.add(userR)

        this.balance = balance;
        this.interestRate = interestRate;
        this.dateOpened = dateOpened;
        this.dateClosed = dateClosed;

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public Set<User> getLinkedUsers() {
        return linkedUsers;
    }

    public void setLinkedUsers(Set<User> linkedUsers) {
        this.linkedUsers = linkedUsers;
    }
}
