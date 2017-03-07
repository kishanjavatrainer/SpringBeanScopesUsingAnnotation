package com.infotech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Message;

public class ClientTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		Message message = ctx.getBean("message", Message.class);
		
		message.setMessageId(1001);
		message.setMessage("Hello!!");
		
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		
		Message message1 = ctx.getBean("message", Message.class);
		
		System.out.println(message1.getMessageId()+"\t"+message1.getMessage());
		
		((AbstractApplicationContext) ctx).close();
		
		
		
		
		
	}

}
