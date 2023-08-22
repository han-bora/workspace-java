package constructor02;

public class UserInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserInfo userInfo = new UserInfo();
		userInfo.userId = "himedia";
		userInfo.userPassword = "1128";
		userInfo.userName = "이순신";
		
		System.out.println(userInfo.showUserInfo());
		
		UserInfo userInfo2 = new UserInfo("hi", "1129", "신사임당");
		System.out.println(userInfo2.showUserInfo());

	}

}
