package top.yeonon.arthasuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "top.yeonon")
public class ArthasUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArthasUserServiceApplication.class, args);
    }

}
