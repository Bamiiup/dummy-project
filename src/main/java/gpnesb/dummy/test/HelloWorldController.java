package gpnesb.dummy.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping(path = "/helloworld")
  public String getHelloWorld() {
    return "hello world";
  }
}
