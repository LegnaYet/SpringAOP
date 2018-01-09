package com.springAOP.dao;

public interface IAccountDao {
	 void increaseMoney(Integer id , Double money);
	 void decreaseMoney(Integer id , Double money);
}
