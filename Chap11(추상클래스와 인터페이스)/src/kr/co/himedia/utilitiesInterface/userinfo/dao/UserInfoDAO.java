package kr.co.himedia.utilitiesInterface.userinfo.dao;

import kr.co.himedia.utilitiesInterface.userinfo.UserInfoDTO;

public interface UserInfoDAO {
	
	void insertUserInfo(UserInfoDTO userInfoDTO); 
	void updateUserInfo(UserInfoDTO userInfoDTO);
	void deleteUserInfo(UserInfoDTO userInfoDTO);
	void selectUserInfo(UserInfoDTO userInfoDTO);
	
	
	
	
	

}
