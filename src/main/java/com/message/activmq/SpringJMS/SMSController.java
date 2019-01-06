package com.message.activmq.SpringJMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SMSController {
	
	@Autowired
	Sender sender;
	
	
	 @RequestMapping("/")
	 @ResponseBody
	 public String sendMessage() {
		 
	//	 String message = "This is my JMS applicaton, Developed by Daniel";
		 sender.send("hey", "Hello Daniel, How are you");
		 
		 return "Sms Send to the proper destination";
	 }

}
