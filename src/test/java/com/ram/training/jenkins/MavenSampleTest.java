package com.ram.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class MavenSampleTest {

	@Test
	public void addTest() {
		MyMavenClass myMavenClass = new MyMavenClass();
		assertEquals(10,myMavenClass.add(5, 5));
	}

	@Test
	public void subTest() {
		MyMavenClass myMavenClass = new MyMavenClass();
		assertEquals(10,myMavenClass.sub(20, 10));
	}
}
