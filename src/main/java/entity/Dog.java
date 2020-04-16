package entity;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Dog {
    private Student student;

    public Student getStudent() {
        return student;
    }

    //@Resource（setter自动配置）
    @Resource(name = "student")
    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "student=" + student +
                '}';
    }
}

