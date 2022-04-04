package day12;

// setting가 getter
// private  변수는 내부 setter 메서드를 이용해서 접근해야한다.
public class MainClass03 {

	public static void main(String[] args) {
	
		Ex03 ex = new Ex03();
		ex.setting(100);
		int a = ex.getter();
		System.out.println(a-1);
		
		
		
		
		
	}

}
