package top.yeonon.arthasuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "top.yeonon")
@EnableJpaRepositories
public class ArthasUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArthasUserServiceApplication.class, args);
    }

}
