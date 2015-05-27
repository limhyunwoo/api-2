package api.lang.string;
/*
 * java.lang.String
 * contain(s) : s 라는 글자가 포함되어있는지 여부 체크 
 *                (검색할 때 많이 사용함)
 */
public class ContainDemo {
	public static void main(String[] args) {
		String str = "abcde";
		/*
		 * (조건식) ? "참" : "거짓" ;
		 */
		
		System.out.println(str.contains("f") ? "f가 포함" : "f가 미포함");
	}
}
