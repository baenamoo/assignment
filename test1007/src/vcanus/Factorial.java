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

// �� �Լ����� stackOverflow �߻��� ���� ���
// ����Լ� ��� for/while�� 
// stack �� �ƴ� �ٸ� ��������� ����..??? 