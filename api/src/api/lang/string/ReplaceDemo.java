package api.lang.string;
/*
 * java.lang.String 메소드
 * replace("Old", "New") : String 문자열에서 "Old" 글자를
 * "New" 글자로 대체한다.
 * 만약 대체하는 글자가 복수이면 replaceAll() 을 사용한다. 
 */
public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Tom".replace("Tom", "Alex"));
		System.out.println("A B C D : A B C D".replaceAll(" C D", " E F"));
		
		/*
		 * 위 문법은 자바 버전 5(JDK 1.5)까지의 문법입니다.
		 * 버전 5 이후 replace() 기능이 확대되어 replaceAll() 처럼
		 * 복수의 글자에도 반응하게 되었습니다.
		 * 그렇다면 차이점이 없냐 ? 아닙니다.
		 * 정규식에 대한 기능이 있는지 없는지 여부에 따른 차이점이 있습니다.
		 */
		System.out.println("[1] A B C D : A B C D".replace(" C D", " E F"));
		System.out.println("[2] A B C D : A B C D".replaceAll(" C D", " E F"));
		
		System.out.println("[3] Hello Java !!".replace("!", ""));
		System.out.println("[4] Hello Java !!".replaceAll(".!", ""));
		// .의 역할은 정규식에서 쓰이는데 맨압 한 글자만 지정합니다.
		// 그러니깐 느낌표가 두개 있는데 앞에 맨 뒷 한녀석만 남기겠다는 의미이고
		// 이 기능은 replaceAll() 에게만 있습니다.
		// 따라서 replace() 보다는 정규식까지 처리가능한 replaceAll() 을 쓰라고 
		// 권장합니다.
		// (java script에서 많이 사용함)
	}
}
