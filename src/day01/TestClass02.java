package day01;

public class TestClass02 {
	public static void main(String[] args) {
		/*
		 escape 문자
		- 문자열 안에서 특수한 기능을 수행
		- \n : 언터값과 비슷
		- \t : 커서를 탭 크기만큼 오른쪽으로 이동
		- \" : "(큰 따옴표) 하나 표현
		- \\ : \(역슬러시) 하나 표현
		 */
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("1\t1234567\t12345678\t");
		System.out.println("이름\t나이\t주소");
		System.out.println("===================");
		System.out.println("홍길동\t20살\t산골짜기");
		
		System.out.println(111 + "\n" + 222);
		System.out.println("C:\\test\\test");
	}
}
