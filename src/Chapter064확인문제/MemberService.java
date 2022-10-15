package Chapter064확인문제;

public class MemberService {


	boolean login(String id,String password) {

		if (id == "hong" && password == "12345") {

			return true;

		}

		else {
			return false;

		}

	}

	void logout(String id) {

		System.out.println("로그아웃 되었습니다.");

	}

}

/*
 * boolean login(String id, String password){
 * if(id.equals("hong") && password.equals("12345")) {
 * 
 * return true;
 * 
 *  }
 *  
 *  else {
 *  
 *  return false;		// else 를 지우고 return false; 로 대신할수 있다. 코드 간소화
 *  
 * }
 * 
 * void logout(String id){
 * 
 * }
 * 
 * 
 * 
 */


