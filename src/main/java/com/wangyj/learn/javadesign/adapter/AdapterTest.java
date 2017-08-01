package com.wangyj.learn.javadesign.adapter;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void testAdapter(){
		Hotel hotel = new Hotel();
		GBSocketInterface gbSocketInterface = new GBSocket();
		SocketAdapter socketAdapter = new SocketAdapter(gbSocketInterface);
		hotel.setSocket(socketAdapter);
		hotel.charge();
		
	}
}
