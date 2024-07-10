package org.example.mailsenderspringbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSenderController {

    @Autowired
    private MailSenderService  service;

    @GetMapping("/send")
    public String sendMail(@RequestParam("toEmail") String toEmail
                          ,@RequestParam("subject") String subject,
                           @RequestParam("body") String body) {

        service.sendMail(toEmail,subject,body);
        return "successfully sent the mail";

    }
}
