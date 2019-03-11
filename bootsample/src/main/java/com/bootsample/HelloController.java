package com.bootsample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/")
	private String hello(){
		// this is a test.
        return "Hello world!!";
    }
}
