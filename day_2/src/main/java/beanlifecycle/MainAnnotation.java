package beanlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        // the bean as it loads into container

        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("beanlifecycle/beans.xml");
        LifecycleAnnotation CycleAnnotation = new LifecycleAnnotation();
        CycleAnnotation.doLifecycle();
        // destroy() method
    }
}
