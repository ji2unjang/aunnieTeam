package com.aunnie.dresser;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aunnie.dresser.dao.MakeConnection;

public class AunnieTest {
	
	
	private static final Logger log = LoggerFactory.getLogger(AunnieTest.class);

	@Test
	public void connection(){
		SqlSessionFactory factory = MakeConnection.getInstance().getFactory();
		log.info("factory :: " + factory);
	}
}
