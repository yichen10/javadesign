package com.wangyj.learn.javadesign.adapter;

/**
 * hotel只提供了两箱接口，需要转换为三箱接口： 
 * @author wangyj
 *
 */
public class Hotel {

	private DBSocketInterface dbSocketInterface;
	
	public Hotel() {
		
	}
	
	public Hotel(DBSocketInterface dbSocketInterface) {
		this.dbSocketInterface = dbSocketInterface;
	}
	
	public void charge() {
		dbSocketInterface.powerWithTwoFlat();
	}
	
	public void setSocket(SocketAdapter socketAdapter) {
		this.dbSocketInterface = socketAdapter;
	}
}
