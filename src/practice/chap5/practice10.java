package practice.chap5;
abstract class PairMap{
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int lenght();
}
class Dictionary extends PairMap{
	static int num=0;//������ �ε���
	static int num2=0;//������ ����� ������ ����
	public Dictionary(int size) {
		super.keyArray=new String[size];
		super.valueArray=new String[size];
	}
	String get(String key) {
		if(is(key)>=0) 
			return super.valueArray[is(key)];
		else
			return "NULL";
	}
	void put(String key, String value) {
		if(is(key)>=0) 
			super.valueArray[is(key)]=value;
		else {
			super.keyArray[num]=key;
			super.valueArray[num++]=value;
			num2++;
		}
	}
	String delete(String key) {
		if(is(key)>=0) {
			String tmp=super.valueArray[is(key)];
			super.valueArray[is(key)]="NULL";
			super.keyArray[is(key)]="NULL";
			return tmp;
		}
		else {
			return "NULL";
		}
	}
	int lenght() {
		return num2;
	}
	int is(String str) {
		for(int i=0;i<num;i++) {
			if(super.keyArray[i].equals(str))
				return i;
		}
		return -1;
	}
}
public class practice10 {
	public static void main(String[] args) {
		Dictionary dic=new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� "+dic.get("���繮"));
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
	}
}
