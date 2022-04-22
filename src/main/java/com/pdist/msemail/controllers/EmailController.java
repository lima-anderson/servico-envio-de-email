package com.pdist.msemail.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pdist.msemail.dtos.EmailDto;
import com.pdist.msemail.models.EmailModel;
import com.pdist.msemail.services.EmailService;

@RestController
public class EmailController {

	@Autowired
	EmailService emailService;

//	@PostMapping("/enviar-email")
//	public ResponseEntity<EmailModel> enviarEmail(@RequestBody @Valid EmailDto emailDto) {
//		EmailModel email = new EmailModel();
////		BeanUtils.copyProperties(emailDto, email);
//		email = emailDto.DeEmailDto(emailDto);	
//		
//		emailService.enviarEmail(email);
//		return new ResponseEntity<>(email, HttpStatus.CREATED);
//	}
	
	@PostMapping("/enviar-email")
	public ResponseEntity<EmailModel> enviarEmail(@RequestBody @Valid EmailModel email) {
//		EmailModel email = new EmailModel();
//		BeanUtils.copyProperties(emailDto, email);
//		email = emailDto.DeEmailDto(emailDto);	
		
		emailService.enviarEmail(email);
		return new ResponseEntity<>(email, HttpStatus.CREATED);
	}
}
