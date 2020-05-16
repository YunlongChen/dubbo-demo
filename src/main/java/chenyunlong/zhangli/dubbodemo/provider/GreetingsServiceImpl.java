package chenyunlong.zhangli.dubbodemo.provider;

import chenyunlong.zhangli.dubbodemo.api.GreetingService;

public class GreetingsServiceImpl implements GreetingService {
    @Override
    public String sayHi(String name) {
        return "hi, " + name;
    }
}