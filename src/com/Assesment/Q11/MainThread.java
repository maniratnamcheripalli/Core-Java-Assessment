package com.Assesment.Q11;

public class MainThread {
	
	public static void main(String[] args) {
		
		ThreadOne o=new ThreadOne();
		ThreadTwo t=new ThreadTwo();
		ThreadThree tt=new ThreadThree();
		o.setName("Mani");
		o.setDaemon(true);
		o.start();
		t.start();
		tt.start();
	}

}
