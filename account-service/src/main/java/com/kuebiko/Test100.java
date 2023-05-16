package com.kuebiko;




interface Eater {
	public void process();
}


public class Test100 {
	
	public static void main(String[] args) {
		
		Eater eat=new Eater() {
			@Override
			public void process() {
				System.out.println("Hey I will eat u !!");
			}
		};
		
		Eater eat2=() -> {
				System.out.println("Hey I will eat u !!");
			};
			
		Eater eat3=()->System.out.println("Hey I will eat u !!");
	}
}
