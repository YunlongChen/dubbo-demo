package chenyunlong.zhangli.dubbodemo.consumer;

import chenyunlong.zhangli.dubbodemo.api.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        GreetingService demoService = (GreetingService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHi("baby!"); // 执行远程方法
        System.out.println(hello); // 显示调用结果
    }
}