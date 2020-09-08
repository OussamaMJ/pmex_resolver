package pmex.resolver.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pmex.resolver.demo.tradingDays.TradingDaysThread;

@SpringBootApplication
public class ResolverApplication implements CommandLineRunner {
    @Autowired
    TradingDaysThread tradingDaysThread;

    public static void main(String[] args) {
        SpringApplication.run(ResolverApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello in Thread :" + Thread.currentThread().getName());
        tradingDaysThread.startTask();
    }
}
