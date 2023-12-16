package com.nfjh.bank.mapper;
import com.nfjh.bank.pojo.Account;
import java.util.List;


public interface AccountMapper {
     /**
      *  * 新增账户
      * @param account
      */
     int insert(Account account);

     /**
      * 删除账户
      * @param actno
      * @return
      */
     int deleteByActno(String actno);

     /**
      * 更新账户余额
      * @param actno
      * @return
      */
     int updateActno(Account actno);

     /**
      * 通过账户查找账户
      * @param actno
      * @return
      */
     Account selectByActno(String actno);

     /**
      * 查看全部账户
      * @return
      */
     List<Account> selectAll();

}
