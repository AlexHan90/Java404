package day12;

public class Ex04 {

	
	private int num;
	private String name;
	private int age;
	
	public int getNum() {  //num이라는값을 리턴해서 돌려주겠다.
		return num;
	}
	public void setNum(int num) {	//해당하는 num이라는 변수에 값을 설정(외부로부터 num 이라는 값을 전달해서 자기 자신에게 넣겠다.
		this.num = num;				//사용자가 넘겨준num 값을 자기자신에게 넣어준다.
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
	this.age = age;
		
	}
	}


