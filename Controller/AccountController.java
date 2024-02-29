package Controller;

import model.AccountDto;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountService accountService;
    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }
    public String deposit(Scanner sc){
        return null;
    }
    public String withdraw(Scanner sc){
        return null;
    }
    public String getBalance(Scanner sc){
        return null;
    }
    public String cancelAccount(Scanner sc){
        return null;
    }
    public String getAccount(Scanner sc){
        return null;
    }


    public List<AccountDto> createAccount(Scanner sc) {
        return null;
    }
}
