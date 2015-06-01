package api.util.hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySetDemo {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 * Map�� ���� �Է��ϴ� ��� => 1������ ����
		 */
		map.put("�迬��", new Integer(99));
		map.put("�ƻ�ٸ���", new Integer(66));
		map.put("��Ʈ���ڹ�", new Integer(9));
		
		/*
		 * GoF �� ������ ���� �߿���
		 * Iterator �����̶�� �Ҹ����
		 * Map ���� ���� �����ϴ� ����ȭ�� �����̴�.
		 */
		
		/*
		 *	�ʿ��� Ű���� �������� ���� ��Ȳ�� ���� ����� ������
		 * entrySet() ���
		 * �ʿ��� Ű���� ����� ��� : keySet()
		 * keySet() ���
		 * ��, ��� ������ Set �̿�
		 * ���� : �÷��ǿ��� �������̽��� Set, List, Map �������� ��ǥ���ε�
		 *        Set�� Map�� �ε��� ���� ��� ��ȣ ȣȯ�� �ߵǰ�
		 *        Set�� �ߺ��� ���� ����� �־
		 *        Map���� Ű������ �ߺ��� ����� �ϴ� �κа��� ��ġ��
		 *        Set�� ���� Ű�� Ȥ�� Ű+�������� ����ϴµ� ���δ�.
		 *        ����� ���� Iterator�� ���
		 *        Set�� Iterator�� ����ϱ� �����̴�. 
		 */
		
		/*
		 * Map���� ���� ����ϴ� ���� 3���� �ε�
		 * ù��° Ű+���� ���·� �Բ� ����ϴ� ���
		 * entrySet() + Iterator ���� ���
		 */
		Set set = map.entrySet(); 
 		Iterator it = set.iterator();   // map.entrySet�� �ּҰ��� Set�� ����
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("������ : " + e.getKey()+", ����: " + e.getValue());
		}
		
		/*
		 * Map���� ���� ����ϴ� ���� 3���� �ε�
		 * �ι�° Ű Ʋ�� ����ϴ� ���
		 * entrySet() ���
		 */
		set = map.keySet();
		System.out.println("������ ��� : " + set);
		
		/*
		 * Map���� ���� ����ϴ� ���� 3���� �ε�
		 * ����° ����(��) Ʋ�� ����ϴ� ���
		 * Collection ���
		 */
		// Collection���� ��Ŭ���� ���� �߿��� java.util.Collection ����
		Collection values  = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()){
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		System.out.println("���� :" +total);
		// Set �� List �迭�� Ŭ����ó�� ����� ������ size()�� �Ѵ�.
		System.out.println("��� :" +total/set.size());
		// Collections.max�� �ִ밪, .min�� �ּҰ��� ����
		System.out.println("1�� :" +Collections.max(values));
		System.out.println("�õ� :" +Collections.min(values));
		// set�� ������ ���⿡ ����� �������� ���´�.
	}
}
