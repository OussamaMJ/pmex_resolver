package pmex.resolver.demo.resolver;

import org.springframework.stereotype.Service;

import java.util.TimerTask;

@Service
public class ResolverJob extends TimerTask {
    Object data;

    public ResolverJob(Object data) {
        this.data = data;
    }

    public ResolverJob(){
        //Some stuffs
    }

    @Override
    public void run() {
        System.out.println("Checking Resolver's status..."+data);
    }
}

