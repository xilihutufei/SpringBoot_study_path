package pre.fei.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

/**
 * @Auth puhongfei~
 * @Date 2021/1/31
 * @Desc 回顾 @Value 注解的使用
 */
@Component
@Validated
public class ValueEntity {
    // 从配置文件中读取
    @Email
    @Value(value = "${person.name}")
    private String vname;
    // 可以支持表达式计算
    @Value(value = "#{11+2}")
    private Integer vage;

    @Value(value = "true")
    private boolean isTrue;


    public ValueEntity() {
    }

    @Override
    public String toString() {
        return "ValueEntity{" +
                "vname='" + vname + '\'' +
                ", vage=" + vage +
                ", isTrue=" + isTrue +
                '}';
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Integer getVage() {
        return vage;
    }

    public void setVage(Integer vage) {
        this.vage = vage;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }
}
