package api.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfoDemo {
	public static void main(String[] args) {
		System.out.println("���� �̸��� ��������");
		String name = "";  // ���������� �ʱ�ȭ �ؾ� ��.
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine();  // �� ������ �о����
		}catch(Exception ex){
			ex.printStackTrace();
		}
		File file = new File(name);
		if(file.exists()){
			System.out.println("�����̸� : " + file.getName());
			System.out.println("���ϰ�� : " + file.getPath());
			System.out.println("���Ⱑ�ɿ��� : " + file.canWrite());
			System.out.println("�ϱⰡ�ɿ��� : " + file.canRead());
			System.out.println("���ϱ��� : " + file.length()+"����Ʈ");
		}else{
			System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		}
	}
}
/*
���� �̸��� ��������
c:/test.txt
�����̸� : test.txt
���ϰ�� : c:\test.txt
���Ⱑ�ɿ��� : true
�ϱⰡ�ɿ��� : true
���ϱ��� : 4����Ʈ
*/
