package com.finance.finance.entities.user;

import com.finance.finance.entities.account.Account;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    public User() {

    }

    public User(String name, String hashedPassword, String email) {
        this.name = name;
        this.hashedPassword = hashedPassword;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "hashedPassword", nullable = false)
    private String hashedPassword;


    @Column(name = "email", nullable = false)
    private String email;


    @ManyToMany
    @JoinTable(
            name = "user_account",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "account_id"))
    private Set<Account> linkedAccounts;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Account> getLinkedAccounts() {
        return linkedAccounts;
    }

    public void setLinkedAccounts(Set<Account> linkedAccounts) {
        this.linkedAccounts = linkedAccounts;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", hashPassword=" + hashedPassword + ", email=" + email
                + "]";
    }

}