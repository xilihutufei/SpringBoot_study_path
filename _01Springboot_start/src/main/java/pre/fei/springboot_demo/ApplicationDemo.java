package pre.fei.springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标识一个主程序类，说明这是个SpringBoot应用
 */
@SpringBootApplication
public class ApplicationDemo {
    public static void main(String[] args) {
        // run()方法的参数：一个是启动类.class,一个是main方法的可变参数
        SpringApplication.run(ApplicationDemo.class, args);
    }

}
