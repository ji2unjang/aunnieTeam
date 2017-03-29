package com.aunnie.dresser;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aunnie.dresser.dao.MemberDAO;
import com.aunnie.dresser.dao.MemberOracleDAO;

public class AunnieTest {
	
	private static final Logger log = LoggerFactory.getLogger(AunnieTest.class);

	public static void main(String[] args) {
		MemberDAO dao = new MemberOracleDAO();
		dao.selectAll();
	}
}
