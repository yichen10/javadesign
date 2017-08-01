package com.wangyj.learn.javadesign.chain;

public class DeptManager extends Handler{

	@Override
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		if (fee <= 1000) {
			if ("wangyaojin".equalsIgnoreCase(user)) {
				str = "部门经理同意" + user +"费用申请，金额为：" + fee  +"元人民币。";
			} else {
				str = "部门经理不同意" + user +"费用申请，金额为：" + fee  +"元人民币。";
			}
			
		} else {
			if (getSuccessor() != null) {
				return getSuccessor().handleFeeRequest(user, fee);
			}
		}
		return str;
	}

	
}
