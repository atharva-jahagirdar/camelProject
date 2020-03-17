package com.example.springapachecamel;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApacheCamelApplication extends RouteBuilder {

	public static void main(String[] args) {
		SpringApplication.run(SpringApacheCamelApplication.class, args);
	}

	@Override
	public void configure() throws Exception {
		System.out.println("atharva");
		//move("");
		moveContent("hello");
		System.out.println("jahagirdar");
	}
	
	/*public void move(String type)
	{
		from("file:D:\\atharvaj\\Desktop\\a?noop=true").filter(header(Exchange.FILE_NAME).startsWith(type)).to("file:D:\\atharvaj\\Desktop\\b");
	}*/
	
	public void moveContent(String content)
	{
		from("file:D:\\atharvaj\\Desktop\\a?noop=true").filter(body().startsWith(content)).to("file:D:\\atharvaj\\Desktop\\b");
	}

}
