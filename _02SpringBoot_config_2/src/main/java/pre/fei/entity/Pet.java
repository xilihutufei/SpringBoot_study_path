package pre.fei.entity;

/**
 * @Auth puhongfei~
 * @Date 2021/1/31
 * @Desc 宠物实体类
 */
public class Pet {
    private String name;
    private String color;
    private Integer age;

    public Pet() {
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
