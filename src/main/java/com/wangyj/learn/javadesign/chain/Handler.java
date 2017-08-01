package com.wangyj.learn.javadesign.chain;

/**
 * 责任链模式
 * 处理链的抽象类：
 * @author wangyj
 *
 */
public abstract class Handler {

	public Handler successor;
	
	public Handler getSuccessor() {
		return successor;
	}
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract String handleFeeRequest(String user, double fee);
}
