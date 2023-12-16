package com.nfjh.bank.service.impl;

import com.nfjh.bank.mapper.AccountMapper;
import com.nfjh.bank.pojo.Account;
import com.nfjh.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {

  @Autowired
  private AccountMapper accountDao;

    @Override
    public boolean addAccount(Account newAct) {
        return accountDao.insert(newAct) == 1;
    }

    @Override
    public boolean deleteAct(String actno) {
        return accountDao.deleteByActno(actno) == 1;
    }

    @Override
    public void transferAccounts(String actFrom, String actTo, Double money) {
        //转出
        Account actFromAct = accountDao.selectByActno(actFrom);
        actFromAct.setBalance(actFromAct.getBalance() - money);
        //转入
        Account actToAct = accountDao.selectByActno(actTo);
        actToAct.setBalance(actToAct.getBalance() + money);

        if (actFromAct.getBalance()<money){
            throw new RuntimeException("余额不足");
        }

        int count = accountDao.updateActno(actFromAct);
        count+= accountDao.updateActno(actToAct);
        System.out.println(count);
        if (count!=2){
            throw new RuntimeException("转账异常");
        }

    }

    @Override
    public Account selectByActno(String actno) {
        return accountDao.selectByActno(actno);
    }

    @Override
    public List<Account> selectAll() {
        return accountDao.selectAll();
    }
}
