package org.system;

public class Desktop  extends Computer{
	public void desktopSize() {
		System.out.println("print the monitor size");
	}
	
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();
	}
}
