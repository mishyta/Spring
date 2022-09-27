package pc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PCSetup.class);

        PC server = context.getBean("PC", PC.class);
        System.out.println(server.systemInfo());

        context.close();
    }
}
