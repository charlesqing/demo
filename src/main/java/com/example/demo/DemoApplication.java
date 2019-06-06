package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String index(){
		return "Hello World! 庄周梦蝴蝶,蝴蝶为庄周.一体更变易,万事良悠悠.乃知蓬莱水,复作清浅流.青门种瓜人,旧日东陵侯.富贵故如此,营营何所求.";
	}
}
