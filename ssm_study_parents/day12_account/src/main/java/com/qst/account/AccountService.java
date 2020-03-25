package com.qst.account;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AccountService {
    //转账业务
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outUser, String inUser, double money) {
        accountDao.out(outUser, money);

        int j = 1 / 0;

        accountDao.in(inUser, money);
    }
}
