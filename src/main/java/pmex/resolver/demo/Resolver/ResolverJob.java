package pmex.resolver.demo.Resolver;

import org.springframework.stereotype.Service;

import java.util.TimerTask;

@Service
public class ResolverJob extends TimerTask {
    public ResolverJob(){
        //Some stuffs
    }

    @Override
    public void run() {
        System.out.println("Checking Resolver's status...");
    }
}

