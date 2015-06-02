package api.io.file;

import java.io.File;


/*
 java.io.file 메소드
 inFile() : 해당 파일이 있는지 여부를 확인, 없으면 false
 isDirectory() : 해당 패스에 디렉토리(폴더) 가 존재하는지, 없으면 false
 */
/*
 디렉토리 vs 폴더 : 둘은 같은 의미이다. 그러나 약간의 의미적 차이가 있다.
 디렉토리(directory) : 텍스트 모드로 cmd 창에서 경로 구분시에 의미가 있다.
 폴더(folder) : GUI 모드에서 파일을 넣어 두는 곳의 의미가 강하다.
 			    실제로 폴더란 말 자체가 Windows 3.5 이상의 버전에서 등장했다.
 			    그전 DOS 모드에서는 디렉토리란 말을 썼다.
 */
public class IsDirectoryDemo {
	public static void main(String[] args) {
//		String directory = "c:/test.txt";  // 폴더가 아님
		String directory = "c:"+File.separator+"temp";
		//== String directory = "c:/temp";
		// File.separator(/) 디렉토리 구분자가 불확실 할 때
		// 동적으로 구문자를 호출하는 클래스 변수
		
		// import 단축키 Ctrl + Shift + o
		File file = new File(directory);
		// 디렉토리인지 검사
		if(file.isDirectory()){
			System.out.println("검색 디렉토리 : " + directory);
			System.out.println("디렉토리 내부파일  목록");
			String str[] = file.list();
			for(int i=0; i<str.length; i++){
				File file2 = new File(directory + "\\" + str[i]);
				if(file2.isDirectory()){
					System.out.println(str[i]+" : 디렉토리");
				}else{
					System.out.println(str[i]+" : 파일");
				}
			}
		}else{
			System.out.println("지정한 "+directory+" 는 디렉토리가 아님");
		}
	}
}
