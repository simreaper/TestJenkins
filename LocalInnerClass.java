package com.innerclass;

public class LocalInnerClass {
	public void display() {
		System.out.println("Inside Display Method");
		class Local {
			void displayinner() {
				System.out.println("Inside Local inner class");
			}
		}
		Local obj = new Local();
		obj.displayinner();
	}

	public static void main(String[] args) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
		obj.displayinner();
	}
}
