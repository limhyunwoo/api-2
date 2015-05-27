package api.lang.string;
/*
 * java.lang.string
 * endWith(s) : s로 끝나는지 여부 체크
 * 				이미지 파일 등 올릴 때 한정되게 끔 설정할 때 많이 사용
 */
public class EndWithDemo {
	public static void main(String[] args) {
		System.out.println(
			"Hello.txt".endsWith("txt") ? "txt 파일 입니다." : "txt 파일이 아닙니다."
				);
	}
}
