package com.pets.v1.api.utiltest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class MyTest {
	
	@Test
	public void sampleTest() {
		String result = "yes";
		assertNotNull(result);
	}
}
