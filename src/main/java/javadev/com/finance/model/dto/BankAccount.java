package javadev.com.finance.model.dto;

import javadev.com.finance.model.AccountStatus;
import javadev.com.finance.model.AccountType;

import java.math.BigDecimal;

import lombok.Data;
@Data
public class BankAccount {

    private Long id;
    private String number;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;
    private User user;

}
