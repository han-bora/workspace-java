package constructor02;

public class UserInfo {
	
	String userId;
	String userPassword;
	String userName;
	String userAddress;
	String userNumber;
	
	public UserInfo() {
	}
	
	public UserInfo(String userId, String userPassword, String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName=userName;
		
	}
	
	public String showUserInfo( ) {
		return "고객님의 아이디는 " +userId+ " 이고, 등록된 이름은" +userName+ "입니다.";
	}
	

}
