package com.capg;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class TestException {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.setSid(101);
		student.setSmarks(65);
		student.setSname("Hello");
		/*if (student.getSmarks()<70) {
			try {
				throw new StudentFailedException("fail");
			} catch (StudentFailedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("pass");
		}
*/
		if ( student.getSname().matches("^"
				+ "[A-Z][a-z]+")) {
			try {
				throw new StudentFailedException("Invalid name");
			} catch (StudentFailedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("nice name");
		}
		
	
		
	}

}
