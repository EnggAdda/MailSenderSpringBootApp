package org.example.mailsenderspringbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {
@Autowired
private JavaMailSender javaMailSender;

    public void sendMail(String toEmail, String subject, String body){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(toEmail);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(body);
        simpleMailMessage.setFrom("mailtrap@demomailtrap.com");
        javaMailSender.send(simpleMailMessage);
    }
}
