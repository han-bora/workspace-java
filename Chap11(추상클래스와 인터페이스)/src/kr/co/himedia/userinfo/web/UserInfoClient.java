package kr.co.himedia.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import kr.co.himedia.utilitiesInterface.userinfo.UserInfoDTO;
import kr.co.himedia.utilitiesInterface.userinfo.dao.UserInfoDAO;
import kr.co.himedia.utilitiesInterface.userinfo.dao.oracle.OracleDAOImpl;
import kr.co.himedia.utilitiesInterface.userinfo.dao.postgras.Postgras;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");

		Properties prop = new Properties();
		prop.load(fis);
		String dbtype = prop.getProperty("DBTYPE");

		UserInfoDTO userDTO = new UserInfoDTO();
		userDTO.setUserId("himedia");
		userDTO.setUserId("1128");
		userDTO.setUserName("하이미디어");

		UserInfoDAO userDAO = null;
		if (dbtype.equals("Postgras")) {
			userDAO = new Postgras();
		}

		else if (dbtype.equals("Oracle")) {
			userDAO = new OracleDAOImpl();
		}
		
		else {
			System.out.println("db support error");
			return;
		}

	}

}
