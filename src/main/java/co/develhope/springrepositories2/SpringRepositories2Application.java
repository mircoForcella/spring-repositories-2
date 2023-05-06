package co.develhope.springrepositories2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
@EnableHypermediaSupport(type = { EnableHypermediaSupport.HypermediaType.HAL })
public class SpringRepositories2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringRepositories2Application.class, args);
    }

}
