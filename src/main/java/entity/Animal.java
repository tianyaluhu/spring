package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//在类的上方加入注解
//@Component等价于在applicationContext.xml中配置,<bean id="animal" class="entity.Animal">
//bean的id默认是类名首字母小写animal,可以在@Component后加括号添加自己想要的id
//@Scope("prototype")多例模式
@Component("abc")
@Scope("prototype")
public class Animal {
    @Value("张三")
    private String name;
    @Value("18")
    private Integer age;
    @Value("女")
    private String geder;

    //@Autowired== ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    //1.
    //@Autowired
    private Student student;

    public Animal() {
    }

    //2.
    @Autowired
    //Qualifier的意思是合格者，通过这个标示，表明了哪个实现类才是我们所需要的
    public Animal(@Qualifier("student") Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("被销毁");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", geder='" + geder + '\'' +
                ", student=" + student +
                '}';
    }
}
