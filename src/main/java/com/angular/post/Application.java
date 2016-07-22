package com.angular.post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

@Controller
class HomeController {

	@RequestMapping(value = "/")
	public String home() {
		return "angularPost.html";
	}
}

@RestController
class TestController {
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public void testThis(@RequestBody TestModel testModel) {
		System.out.println("Reached here :"+testModel);
	}
}

