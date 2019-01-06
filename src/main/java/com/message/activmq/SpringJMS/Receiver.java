package com.message.activmq.SpringJMS;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

 // private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

 // private CountDownLatch latch = new CountDownLatch(1);

 
  @JmsListener(destination = "boot.qt")
  public void receive(String message) {
   System.out.println(message);
  }
}
