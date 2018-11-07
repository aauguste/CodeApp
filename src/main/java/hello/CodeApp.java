package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CodeApp {

    public static void main(String[] args) {
        SpringApplication.run(CodeApp.class, args);
    }

  /*  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Lets check the beans: " );
            String beanName = ctx.getContextPath();
            System.out.println(beanName);

        };
    }*/
}
