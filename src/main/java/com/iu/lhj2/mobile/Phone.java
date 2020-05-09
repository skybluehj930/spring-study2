package com.iu.lhj2.mobile;

import javax.security.auth.Destroyable;

public class Phone {

		private Camera camera;
		private Wifi wifi;
		
		public Phone(Camera camera) {
			this.camera = camera;
		}
		
		public void init() {
			System.out.println("초기화 메소드");
		}
		
		public void destroy() {
			System.out.println("소멸 전 메소드");
		}
		
		public Camera getCamera() {
			return camera;
		}
		public void setCamera(Camera camera) {
			this.camera = camera;
		}
		public Wifi getWifi() {
			return wifi;
		}
		public void setWifi(Wifi wifi) {
			this.wifi = wifi;
		}
		
		
}
