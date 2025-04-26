package com.example.makemytrip;

import ch.qos.logback.core.net.SyslogOutputStream;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Hotel {
        public Hotel() {
        }

        @GetMapping({"/hotels"})
        public String getData() {
            return "Book your HOTELS for Pune at 50% OFF!";
        }
    }
