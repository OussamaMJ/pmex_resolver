package pmex.resolver.demo.TradingDays;

import org.springframework.stereotype.Service;

import java.util.TimerTask;
@Service
public class TradingDaysJob extends TimerTask {
    public TradingDaysJob(){
        //Some stuffs
    }

    @Override
    public void run() {
        System.out.println("Looking For Trading Days To Be Resolved...");
    }
}
