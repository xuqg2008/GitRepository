/**
 * @Author:xuqiangang
 * @Date:2021/9/3 0003 13:52
 * @Description: PACKAGE_NAME
 * @Version:1.0.0
 */
public class Student {
    private  String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
