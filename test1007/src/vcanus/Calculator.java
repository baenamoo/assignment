package vcanus;

class Calculator {

	int x = 0;
	int a;
	
	public int add(int a) {
		this.a = a;
		x += a;
		return x;
	}
	

	public int subtract(int a) {
		this.a = a;
		x -= a;
		return x;
		
	}

}
