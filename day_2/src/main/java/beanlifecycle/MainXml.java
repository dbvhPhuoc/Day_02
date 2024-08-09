package beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle/beans.xml");
        LifecycleXml lifecycleXml = new LifecycleXml();
        lifecycleXml.destroy();
    }
}
