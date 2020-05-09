package com.iu.lhj2.mobile;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iu.lhj2.MyAbstractTest;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class PhoneTest extends MyAbstractTest {
	
	@Autowired
	private Phone phone;

	@Test
	public void getPhoneTest() {
		assertNotNull(phone);	
		assertNotNull(phone.getCamera());	
		System.out.println(phone.getCamera());
		assertNotNull(phone.getWifi());	
		System.out.println(phone.getWifi());
	}
	
	@Test
	public void getWifi() {
		assertEquals(phone.getWifi().getKind(), "5G");
		System.out.println(phone.getWifi().getKind());
		assertEquals(phone.getWifi().getCompany(), "Apple");
		System.out.println(phone.getWifi().getCompany());
	}
	
	@Test
	public void getCamera() {
		System.out.println(phone.getCamera().getPixel());
		System.out.println(phone.getCamera().getCount());
	}

}
