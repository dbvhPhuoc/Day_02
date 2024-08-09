package beanlifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class LifecycleAnnotation {
@PostConstruct
    public void init() {
        System.out.println("Hàm này được gọi sau khi beanLifecycle được tạo");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Hàm này được gọi trước khi beanLifecycle bị destroy");

    }

    public void doLifecycle() {
            System.out.println("Pr54-Spring Boot");
    }
}
