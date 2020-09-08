package pmex.resolver.demo.tradingDays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Service
public class TradingDaysThread {
    private ExecutorService tradingDayThread;
    @Autowired
    private TradingDaysJob tradingDaysJob;

    public void startTask() {
        tradingDayThread = Executors.newSingleThreadExecutor();
        tradingDayThread.execute(this::watchTradingDays);
    }

    private void watchTradingDays() {
        System.out.println(" Watching Trading Days ....  Thread :"+ Thread.currentThread().getName());
        Timer t = new Timer();
        t.scheduleAtFixedRate(tradingDaysJob, 0, 10000);
        tradingDayThread.shutdownNow();
        tradingDayThread = null;
    }

}
