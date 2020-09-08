package pmex.resolver.demo.resolver;

import java.util.Timer;

public class WatchResolver implements Runnable {
    private Object object;

    public WatchResolver(Object data) {
        this.object = data;
    }

    @Override
    public void run() {
        System.out.println(" Watching Resolver ....  Thread :"+ Thread.currentThread().getName());
        System.out.println(" Received the Object "+object);
        Timer t = new Timer();
        t.scheduleAtFixedRate(new ResolverJob(object), 0, 10000);
    }
}
