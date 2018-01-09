package com.SpringJdbc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringJdbc.dao.IAccountDao;
import com.SpringJdbc.service.IAccountService;

@Transactional
@Service
public class AccountServiceImpl implements IAccountService {
	
	 @Autowired
	 private IAccountDao actDao;

	 public void transfer(Integer from, Integer to, Double money) {
	    actDao.decreaseMoney(from,money);
//	    Integer.parseInt("abc");
	    actDao.increaseMoney(to,money);
	 }

}
