package com.nfjh.bank.service;

import com.nfjh.bank.pojo.Account;

import java.util.List;

public interface AccountService {
    /**
     * 新增账户
     * @param newAct
     * @return
     */
     boolean addAccount(Account newAct);

    /**
     * 销户,根据账户名进行删除
     * @param actno
     * @return
     */
     boolean deleteAct(String actno);

    /**
     * 转账
     * @param actFrom 转出
     * @param actTo 转入
     * @param money 转账金额
     * @return
     */
    void transferAccounts(String actFrom ,String actTo,Double money);

    /**
     * 根据账户名进行查询
     * @param actno
     * @return
     */
     Account selectByActno(String actno);


    /**
     * 查询所有账户信息
     * @return
     */
    List<Account> selectAll();


}
