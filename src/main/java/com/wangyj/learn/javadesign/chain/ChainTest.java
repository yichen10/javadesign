package com.wangyj.learn.javadesign.chain;


import org.junit.Test;

public class ChainTest {

	@Test
	public void testChain() {
		Handler handler1 = new ProjectManager();
		Handler handler2 = new DeptManager();
		Handler handler3 = new DeputyManager();
		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);
		
		for (int i = 0; i < 20; i++) {
			String result = handler1.handleFeeRequest("wangyaojin", Math.random()*4000);
			System.out.println(result);
		}
		
	}
}
