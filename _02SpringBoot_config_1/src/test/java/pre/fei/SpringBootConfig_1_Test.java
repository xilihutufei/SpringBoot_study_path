package pre.fei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pre.fei.entity.Person;
import pre.fei.entity.ValueEntity;

/**
 * @Auth puhongfei~
 * @Date 2021/1/31
 * @Desc TODO
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfig_1_Test {

    @Autowired
    Person person;


    @Test
    public void config_1Test(){
        System.out.println("----------");
        System.out.println(person);
        System.out.println("----------");
    }

    @Autowired
    ValueEntity entity;
    @Test
    public void testValue(){
        System.out.println("----- @Value 回顾 ----");
        System.out.println(entity);
    }
}
