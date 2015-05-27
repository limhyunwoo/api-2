package api.lang.string;
/*
 * java.lang.String �޼ҵ� 
 * split("������") : �����ڸ� �������� String ���ڿ��� �и��Ͽ� 
 *                   �迭��(ArrayList ����)�� ���� ��� ���.
 * 			        �ڿ� ���ڰ� ������ �ܾ� ���� ������ �ְ�
 *					 ������ ����Ʈ�� �� ������ �ش�. 
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
		 * int ������ŭ ������ �ش�.
		 * �� ������ ����Ʈ�� ��ü ����
		 */
		System.out.print("split() ��°�� : ");
		String[] fruits2 = fruit.split(",",3);
		System.out.println(Arrays.toString(fruits2));
		String[] fruits3 = fruit.split("");
		System.out.println(Arrays.toString(fruits3));
	}
}
