package com.example.demo.db;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.MemberVO;

public class DBManager {
	public static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			String resource = "com/example/demo/db/SqlMapConfig.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory =
			  new SqlSessionFactoryBuilder().build(inputStream);
		}catch(Exception e) {
			System.out.println("예외발생 : "+e.getMessage());
		}
	}
	public static List<MemberVO> findAll(){ //
		SqlSession session = sqlSessionFactory.openSession(); //
		List<MemberVO> list = session.selectList("member.findAll"); //
		session.close(); //
		return list;
	}
}
