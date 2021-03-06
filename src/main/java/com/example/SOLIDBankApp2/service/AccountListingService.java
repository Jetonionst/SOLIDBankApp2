package com.example.SOLIDBankApp2.service;

import com.example.SOLIDBankApp2.entity.account.Account;
import com.example.SOLIDBankApp2.entity.account.AccountType;
import com.example.SOLIDBankApp2.entity.account.AccountWithdraw;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountListingService {
    Account getClientAccount(String clientID, String accountID);

    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);

    List<Account> getClientAccounts(String clientID);

    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
}
