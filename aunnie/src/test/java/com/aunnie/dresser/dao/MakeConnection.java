package com.aunnie.dresser.dao;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MakeConnection {
	private static MakeConnection mc;
	private SqlSessionFactory factory;
	private final String CONFIG_FILE = "/aunnie/src/test/resources/sqlMapConfig.xml";
	
	private MakeConnection(){
		if(factory==null){
			try {
				factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(CONFIG_FILE));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//Constructor
	
	public static MakeConnection getInstance(){ return mc; }
	public SqlSessionFactory getFactory(){return factory;}
}
