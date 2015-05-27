package api.lang.string;

public class EqualsIgnoreCaseDemo {
	public static void main(String[] args) {
		// 비교 대상이 대소문자 차이점까지 비교한다.
		System.out.println(
				"Hello".equals("hello")?"같습니다.":"다릅니다."
				);
		// 로그인 할때 대소문자 구분 하지 않게 하기 위해서 많이 사용
		// 비교 대상이 대소문자 차이를 두지않는다.
		// 대소문자 구별이 없다.
		System.out.println(  
				"Hello".equalsIgnoreCase("hello")?"같습니다.":"다릅니다."
				);
	}
}
