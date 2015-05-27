package api.lang.string;
/*
 * java.lang.String 메소드 
 * split("구분자") : 구분자를 기준으로 String 문자열을 분리하여 
 *                   배열등(ArrayList 포함)에 나눠 담는 기능.
 * 			        뒤에 숫자가 붙으면 단어 사이 공백을 주고
 *					 없으면 디폴트로 다 공백을 준다. 
 */
import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		for(int i=0; i<fruits.length; i++){
			System.out.print("\t"+fruits[i]);
		}
		System.out.println();
		
		/*
		 * split(String, int)
		 * int 갯수만큼 공백을 준다.
		 * 단 없으면 디폴트로 전체 공백
		 */
		System.out.print("split() 출력결과 : ");
		String[] fruits2 = fruit.split(",",3);
		System.out.println(Arrays.toString(fruits2));
		String[] fruits3 = fruit.split("");
		System.out.println(Arrays.toString(fruits3));
	}
}
