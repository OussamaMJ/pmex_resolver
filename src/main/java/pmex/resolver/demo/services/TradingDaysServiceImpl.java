package pmex.resolver.demo.services;

import org.springframework.stereotype.Service;

@Service
public class TradingDaysServiceImpl implements TradingDaysService {
    @Override
    public Object FetchReadyTradingDays() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Object();
    }
}
