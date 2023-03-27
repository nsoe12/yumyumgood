package com.cookpang.app.cart.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class CartDAO {

	public SqlSession sqlSession;
	
	public CartDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
