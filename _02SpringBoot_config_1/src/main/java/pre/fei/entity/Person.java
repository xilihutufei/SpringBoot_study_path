package pre.fei.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;

/**
 * @Auth puhongfei~
 * @Date 2021/1/31
 * @Desc persion 实体类
 */

/**
 * 将当前组件【person】加到容器中去，只有组件在容器中，才能使用容器提供的功能 【@ConfigurationProperties】
 */
@Component
/**
 * 告诉springboot，将本类中的所有属性和配置文件中的配置进行绑定
 * 【prefix = "person" 表示的是绑定配置文件中那个标签下的配置内容】
 */
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    @Email
    private String name;
    private int age;
    /**
     * 日期格式转换处理
     * @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;
    private Pet pet;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", pet=" + pet +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
