package kr.co.himedia.utilitiesInterface.userinfo.dao.postgras;

import kr.co.himedia.utilitiesInterface.userinfo.UserInfoDTO;
import kr.co.himedia.utilitiesInterface.userinfo.dao.UserInfoDAO;

public class Postgras implements UserInfoDAO{

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("insert into Postgras DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("insert into Postgras DB userid = " + userInfoDTO.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("insert into Postgras DB userid = " + userInfoDTO.getUserId());
		
	}
	
	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("insert into Postgras DB userid = " + userInfoDTO.getUserId());
		
	}

}
