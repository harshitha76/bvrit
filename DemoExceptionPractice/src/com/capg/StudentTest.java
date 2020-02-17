package com.capg;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StudentTest {
	static Student s;
	@BeforeAll
	static void getValues() {
		 s = new Student();
		 s.setSid(101);
		 s.setSmarks(63);
		 s.setSname("Nived");
	}

	@Test
	void testGetSid() {
		assertEquals(101, s.getSid());
	}

	@Test
	void testGetSname() {
		assertEquals("Nived", s.getSname());
	}

	@Test
	void testGetSmarks() {
		assertEquals(63, 63);
	}

}
