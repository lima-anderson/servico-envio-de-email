package com.pdist.msemail.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.pdist.msemail.dtos.EmailDto;
import com.pdist.msemail.models.EmailModel;
import com.pdist.msemail.services.EmailService;

@Component
public class EmailConsumer {

	@Autowired
	EmailService emailService;

//	@RabbitListener(queues = "ms.email")
//	public void ouvir(@Payload EmailDto emailDto) {
//		EmailModel email = new EmailModel();
//		
//		emailDto.DeEmailDto(emailDto);
//		emailService.enviarEmail(email);
//		
//		System.out.println("Status do E-mail: " + email.getStatus().toString());
//	}

	@RabbitListener(queues = "ms.email")
	public void ouvir(@Payload EmailModel email) {

		emailService.enviarEmail(email);

		System.out.println("Status do E-mail: " + email.getStatus().toString());
	}

}
