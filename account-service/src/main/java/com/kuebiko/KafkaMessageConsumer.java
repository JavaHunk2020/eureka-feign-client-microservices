/*package com.kuebiko;

import java.util.Date;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageConsumer {
	
	@KafkaListener(topics = "${general.topic.name}", 
			groupId = "${general.topic.group.id}",containerFactory = "thothitListener")
	public void messageEater(String message) {
		System.out.println("Hello I got the message from kafka topic  "+message+ " at "+new Date());
	}

}*/
