package pmex.resolver.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmex.resolver.demo.Resolver.ResolverJob;
import pmex.resolver.demo.TradingDays.TradingDaysJob;

import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Service
public class Threads {
    private ExecutorService executorService1,executorService2;
    @Autowired
    private TradingDaysJob tradingDaysJob;
    @Autowired
    private ResolverJob resolverJob;

    public void startTask() {
        executorService1 = Executors.newSingleThreadExecutor();
        executorService1.execute(this::watchTradingDays);

        executorService2 = Executors.newSingleThreadExecutor();
        executorService2.execute(this::watchResolver);
    }


    private void watchTradingDays() {
        System.out.println(" Watching Trading Days ....  Thread :"+ Thread.currentThread().getName());
        Timer t = new Timer();
        t.scheduleAtFixedRate(tradingDaysJob, 0, 10000);
        executorService1.shutdownNow();
        executorService1 = null;
    }

    private void watchResolver() {
        System.out.println(" Watching Resolver ....  Thread :"+ Thread.currentThread().getName());
        Timer t = new Timer();
        t.scheduleAtFixedRate(resolverJob, 0, 10000);
        executorService2.shutdownNow();
        executorService2 = null;
    }
}
