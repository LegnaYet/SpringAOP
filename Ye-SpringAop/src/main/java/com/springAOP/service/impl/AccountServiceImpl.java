package com.springAOP.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

import com.springAOP.dao.IAccountDao;
import com.springAOP.service.IAccountService;

@Service
public class AccountServiceImpl extends JdbcDaoSupport implements IAccountService {
	
	@Autowired
	 private IAccountDao accountDao;

	    public void transfer(Integer from, Integer to, Double money) {
	        accountDao.decreaseMoney(from,money);
	        accountDao.increaseMoney(to,money);
	    }

}
