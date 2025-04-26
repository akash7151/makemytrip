package com.example.makemytrip;





import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Bus {
        @GetMapping("/bus")
        public String getData() {return "Book your BUS from Kolkata to Pune at 10% OFF!";}
    }

