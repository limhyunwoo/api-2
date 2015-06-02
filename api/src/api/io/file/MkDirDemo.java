package api.io.file;

import java.io.File;

public class MkDirDemo {
	public static void main(String[] args) {
		
		File f = null;
		boolean bool = false;
		
		try{
			f = new File("C:/Texts");  
			bool = f.mkdir();
			System.out.println("Directory created? " +bool);
			// 경로에 폴더가 없으면 폴더를 생성한다.
			// 경로에 폴더가 없으면 true, 폴더가 있으면 false를 출력
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
