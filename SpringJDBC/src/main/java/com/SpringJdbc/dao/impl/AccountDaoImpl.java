package com.SpringJdbc.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.SpringJdbc.dao.IAccountDao;


@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

	 public void increaseMoney(Integer id, Double money) {
		 getJdbcTemplate().update("update ar_account set money = money + ? where id = ? ;",money,id);
	 }

	 public void decreaseMoney(Integer id, Double money) {
		 getJdbcTemplate().update("update ar_account set money = money - ? where id = ? ;",money,id);
	 }

}
