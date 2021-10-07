package vcanus;

public class Factorial {

	public static void main(String[] args) {

		int input = 4; // 4!
		System.out.println(fact(input));

	}


	public static int fact(int n) {

		if (n <= 1)
			return n;
		else 
			return fact(n-1) * n;

	}

}

// 위 함수에서 stackOverflow 발생을 막는 방법
// 재귀함수 대신 for/while문 
// stack 이 아닌 다른 저장공간에 저장..??? 