package com.flamingstar.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@RestController
public class DockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }

    @RequestMapping("/index")
    public String index(){
        return "Hello! This is your first docker demo, current time is:"
                + new SimpleDateFormat(" [yyyy-MM-dd  HH:mm:ss]").format(new Date());
    }
}
