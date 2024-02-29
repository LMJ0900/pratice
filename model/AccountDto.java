package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;
@NoArgsConstructor
@Getter
@Setter
//@AllArgsConstructor
@ToString


public class AccountDto {
    private long id;
    private String accountNumber;


    private String accountHolder;

    private double balance;


    private Date transactionDate;

    public AccountDto(long id, String accountNumber, String accountHolder, double balance, Date transactionDate) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionDate = transactionDate;
    }
}
