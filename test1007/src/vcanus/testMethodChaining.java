package vcanus;

import org.junit.jupiter.api.Test;

public class testMethodChaining {
	
	@Test
    public void testMethodChain() {
        Calculator cal = new Calculator();
        
        int result = cal.add(4).add(5).subtract(3).out();
        System.out.println(result);

    }

}
