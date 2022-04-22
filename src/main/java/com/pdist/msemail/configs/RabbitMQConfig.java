package com.pdist.msemail.configs;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	private String fila = "ms.email";

	@Bean
	public Queue queue() {
		return new Queue(fila, true);
	}

	@Bean
	public Jackson2JsonMessageConverter converter() {
		return new Jackson2JsonMessageConverter();
	}

}
