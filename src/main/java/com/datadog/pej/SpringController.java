package com.datadog.pej;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    Logger log = LoggerFactory.getLogger("commonLogger");

    @RequestMapping("/test")
    public String index() {
        System.out.println("Instructor");
        log.info("Instructor");
        return "\ntest";
    }


}
