package com.madeeasy.controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SMSController {

    static {
        Twilio.init("TWILIO_ACCOUNT_SID", "TWILIO_AUTH_TOKEN");
    }

    @GetMapping(value = "/send-sms")
    public ResponseEntity<String> sendSMS() {
        /**
         * FIRST NUMBER IS CELLPHONE NUMBER WHERE MESSAGE TO BE SENT
         * SECOND NUMBER IS TWILIO NUMBER
         */
        Message.creator(new PhoneNumber("+ country code CELLPHONE NUMBER ex: +91.... for India"),
                new PhoneNumber("TWILIO NUMBER"), "Hello from Twilio 📞").create();
        return new ResponseEntity<String>("Message sent successfully", HttpStatus.OK);
    }
}
