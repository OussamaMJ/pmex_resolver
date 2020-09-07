package pmex.resolver.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResolverApplication implements CommandLineRunner {
    @Autowired
    Threads threads;

    public static void main(String[] args) {
        SpringApplication.run(ResolverApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello in Thread :" + Thread.currentThread().getName());
        threads.startTask();
    }
}
