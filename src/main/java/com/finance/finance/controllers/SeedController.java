package com.finance.finance.controllers;

import com.finance.finance.ResourceNotFoundException;
import com.finance.finance.entities.AccountType;
import com.finance.finance.entities.User;
import com.finance.finance.repositories.AccountRepository;
import com.finance.finance.repositories.AccountTypeRepository;
import com.finance.finance.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class SeedController {

    @Resource
    UserRepository userRepository;

    @Resource
    AccountTypeRepository accountTypeRepository;

    @Resource
    AccountRepository accountRepository;

    @Autowired
    public SeedController() {
    }

    @GetMapping("/seed/{amount}")
    public ResponseEntity<String> getUserById(@PathVariable(value = "amount") Long amount) {

//        User user1 = new User("betty", "pw", "a@aol.com");
//        User user2 = new User("sue", "pw", "b@aol.com");
//        userRepository.save(user1);
//        userRepository.save(user2);

//        List<AccountType> accountTypeList = new ArrayList<>();
//        accountTypeList.add(new AccountType("Checking"));
//        accountTypeList.add(new AccountType("Retirement"));
//        accountTypeList.add(new AccountType("Savings"));
//        accountTypeList.add(new AccountType("Loan"));
//        accountTypeRepository.saveAll(accountTypeList);







        return ResponseEntity.ok().body("Success");
    }

//    @GetMapping("/seed")
//    public String getTest() {
//        System.out.println("test");
//        return "test";
//    }

}
