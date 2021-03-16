package com.ivoronline.springboot_log_log4j_config.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  private static final Logger log = LoggerFactory.getLogger(MyController.class);

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    log.info("Hello from Controller");
    return "Hello from Controller";
  }

}
