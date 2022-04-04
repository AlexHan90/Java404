package day12;

public class Ex03 {

	private int age; //변수 (정보은닉 = private), 외부에서 접근차단
	private int name;				// 내부에서 접근 setter and getter
	public void printA() {
		System.out.println(age);
	
		
						// public void setAge() {     //setter 사용법
						// public void setName() {
		
	}
	public void getAge() {}			// 가져오는 기본적인 형식	
	
	public void getName() {}		//기본적인형식
	
	public void setting(int a) {		//내부접근
		age  = a;
	}
	
	public int getter() {				//얻어오는 간접적 기능
		return age;
	
	}
}

 