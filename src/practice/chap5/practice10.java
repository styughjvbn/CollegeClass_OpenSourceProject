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
	static int num=0;//사전의 인덱스
	static int num2=0;//사전의 저장된 아이템 개수
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
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 "+dic.get("이재문"));
		System.out.println("황기태의 값은 "+dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+dic.get("황기태"));
	}
}
