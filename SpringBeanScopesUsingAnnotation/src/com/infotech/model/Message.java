package com.infotech.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//Message message= new Message();
@Scope("prototype")
public class Message {
	
	private int messageId;
	private String message;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
