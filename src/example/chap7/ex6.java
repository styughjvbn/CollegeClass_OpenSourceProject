package example.chap7;

import java.util.*;

public class ex6 {
	public static void main(String[] args) {
// ����� �̸��� ������ ����ϴ� HashMap �÷��� ����
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
// 5 ���� ���� ����
		scoreMap.put("�輺��", 97);
		scoreMap.put("Ȳ����", 88);
		scoreMap.put("�賲��", 98);
		scoreMap.put("���繮", 70);
		scoreMap.put("�ѿ���", 99);
		System.out.println("HashMap�� ��� ���� :" + scoreMap.size());
// ��� ����� ���� ���.
// javaScore�� ��� �ִ� ��� (key, value) �� ���
// key ���ڿ��� ���� ���� Set �÷��� ����
		Set<String> keys = scoreMap.keySet();
// key ���ڿ��� ������� ������ �� �ִ� Iterator ����
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + " : " + score);
		}
	}
}