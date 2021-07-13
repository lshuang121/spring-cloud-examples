package com.hls.spring.springcloudconfigclient.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@RefreshScope
public class MainController {

  private static final Logger log = LoggerFactory.getLogger(MainController.class);

  @Value("${app.name}")
  String appName;

  @RequestMapping("")
  public String main(){
    return appName;
  }
}
