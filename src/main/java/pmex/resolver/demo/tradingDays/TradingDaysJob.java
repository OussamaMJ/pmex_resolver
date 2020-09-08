package pmex.resolver.demo.tradingDays;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmex.resolver.demo.resolver.WatchResolver;
import pmex.resolver.demo.services.TradingDaysService;

import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class TradingDaysJob extends TimerTask {
    @Autowired
    TradingDaysService tradingDaysService;
    private ExecutorService resolverThread;

    public TradingDaysJob(){
        //Some stuffs
    }

    @SneakyThrows
    @Override
    public void run() {
        System.out.println("Looking For Trading Days To Be Resolved *..."+Thread.currentThread().getName());
        if(tradingDaysService.FetchReadyTradingDays() != null){
            this.cancel(); // Stops the task watching on trading days...
            resolverThread = Executors.newSingleThreadExecutor();
            //resolverThread.execute(this::watchResolver);
            resolverThread.execute(new WatchResolver(tradingDaysService.FetchReadyTradingDays()));
            //restart the task watching on the trading days...
            resolverThread.shutdownNow();
            resolverThread = null;
        }
    }


}
