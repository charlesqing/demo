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
		return "Hello World!!!李白(701年－762年)，字太白，号青莲居士，唐朝浪漫主义诗人，被后人誉为诗仙。祖籍陇西成纪(待考)，出生于西域碎叶城，4岁再随父迁至剑南道绵州。李白存世诗文千余篇，有《李太白集》传世。762年病逝，享年61岁。杜甫（712年—770年），字子美，自号少陵野老，唐代伟大的现实主义诗人，与李白合称“李杜”。原籍湖北襄阳，后徙河南巩县。为了与另两位诗人李商隐与杜牧即“小李杜”区别，杜甫与李白又合称“大李杜”，杜甫也常被称为“老杜”。";
	}
}
