package com.azienda.esempioRestContainer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EsempioRestContainerApplicationTests {

	@Test
	public void test1() {
		assertEquals(4,2+2);
	}

}
