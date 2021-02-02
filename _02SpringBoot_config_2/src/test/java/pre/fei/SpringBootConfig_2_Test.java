package pre.fei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pre.fei.entity.Person;

/**
 * @Auth puhongfei~
 * @Date 2021/1/31
 * @Desc springboot的单元测试
 */
@RunWith(SpringRunner.class) // 表示是用spring的单元测试来跑，而不是用 junit
@SpringBootTest // 表示这是一个springboot的单元测试
public class SpringBootConfig_2_Test {
    // 自动注入
    @Autowired
    Person person;

    @Test
    public void configTest(){
        System.out.println("++++++++++++++++++");
        System.out.println(person);
        System.out.println("++++++++++++++++++");
    }

}
