

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
class HelloWorld {

    @GetMapping("hello-world/welcome")

    public String hello(){
        return "Welcome to LOIT";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }

}