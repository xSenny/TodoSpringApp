package dev.xsenny.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloController {

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return """
                <html>
                    <head>
                        <title>Hello</title>
                    </head>
                    <body>
                        Hello world!
                    </body>
                </html>
                """;
    }

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }

}
