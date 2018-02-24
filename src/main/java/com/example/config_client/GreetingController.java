package com.example.config_client;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	

	@Value("${name}")
	private String name1;
	
    @RequestMapping("/greeting/abc")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name,@RequestBody String jsonString) {
    	System.out.println("Json String:"+jsonString);
        System.out.println("name is:"+name1); // this is the value which the configServer sends to the config Client.
        return  name;
    }
    
    @RequestMapping("/sa")
    public String sa(@RequestParam(value="name", defaultValue="World") String name,@RequestBody String jsonString) {
    	System.out.println("Json String sa:"+jsonString);
        return  name;
    }

}
