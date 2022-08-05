package com.Assesment.Q3;

interface Sum{
	int a=10;
	void add();
}

public class Anonymous {
	public static void main(String[] args) {
		
		Sum s=new Sum() {

			@Override
			public void add() {
				System.out.println("Anonumous class "+ a);
				
			}	
		};
		s.add();
	}

}
