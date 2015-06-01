package api.util.hashMap;

public interface MemberService {
	
	/*
	 * 회원가입 기능을 하는 메소드
	 * HashMap을 해야 id 값을 가지고 password를 호출 하게 된다.
	 */
	public void join(String id, String password, String name, int age, String addr);
	/*
	 * 회원가입 후 로그인 기능을 하는 메소드
	 * 별다른 말이 없이 
	 */
	
	// 출력문 예시
			// 입력하신 ID는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.
			// 비번이 다릅니다. 다시 입력하세요.
			// 환영합니다. 서울시에 사는 20세홍길동님...
			
	public void login(String id, String password);
}
