package software.renato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/")
    public Mono<String> helloWorld() {
        return Mono.just("Hello world!");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
