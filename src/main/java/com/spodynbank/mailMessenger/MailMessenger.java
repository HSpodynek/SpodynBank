package com.spodynbank.mailMessenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class MailMessenger {

    private final JavaMailSender mailSender;

    @Autowired
    public MailMessenger(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void htmlEmailMessenger(String from, String toMail, String subject, String body) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper htmlMessage = new MimeMessageHelper(message, true);

        htmlMessage.setTo(toMail);
        htmlMessage.setFrom(from);
        htmlMessage.setSubject(subject);
        htmlMessage.setText(body, true);
        mailSender.send(message);
    }
}
