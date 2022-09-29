package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotNull.List;

class DemoApplicationTests {

	@List(value = { @NotNull })
	void contextLoads() {
	}

}
