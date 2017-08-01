package com.wangyj.learn.javadesign.adapter;

/**
 * 适配器角色：
 * @author wangyj
 *
 */
public class SocketAdapter implements DBSocketInterface {

	private GBSocketInterface gbSocketInterface;
	
	public SocketAdapter(GBSocketInterface gbSocketInterface){
		this.gbSocketInterface = gbSocketInterface;
	}
	
	@Override
	public void powerWithTwoFlat() {
		gbSocketInterface.powerWithThreeFlat();
	}

}
