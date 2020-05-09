package com.iu.lhj2.mobile;

public class Camera {
	private int pixel;
	private String count;
	
//	public Camera() {
//		// TODO Auto-generated constructor stub
//	}
	
	public Camera(int pixel, String count) {
		this.pixel = pixel;
		this.count = count;
	}

	public int getPixel() {
		return pixel;
	}

	public void setPixel(int pixel) {
		this.pixel = pixel;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}
	

	
}
