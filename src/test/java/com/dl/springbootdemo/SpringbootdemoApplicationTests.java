package com.dl.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootdemoApplicationTests {

//	@BeforeTestClass
//	public void before(){
//		System.out.println("befor");
//	}

	@Test
	void contextLoads() {
		System.out.println("测试");
	}

}
