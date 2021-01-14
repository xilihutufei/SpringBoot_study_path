package pre.fei.springboot_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Controller 标识这是一个controller，用来接收来自浏览器的请求
 */
@Controller
public class HelloWordController {

    /**
     * @ResponseBody  将字符串返回到浏览器并显示
     * @RequestMapping(value = "/hello") 浏览器的 /hello 将请求到这个方法
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello world";
    }
}
