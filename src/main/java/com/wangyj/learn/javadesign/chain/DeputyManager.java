package com.wangyj.learn.javadesign.chain;

public class DeputyManager extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		if (fee <= 3000) {
			if ("wangyaojin".equalsIgnoreCase(user)) {
				str = "副总经理同意" + user +"费用申请，金额为：" + fee  +"元人民币。";
			} else {
				str = "副总经理不同意" + user +"费用申请，金额为：" + fee  +"元人民币。";
			}
		} else {
			if (getSuccessor() != null) {
				return getSuccessor().handleFeeRequest(user, fee);
			} else {
				str = "无人处理该费用，" + user +"费用申请，金额为：" + fee  +"元人民币。";
			}
		}
		return str;
	}

	
}
