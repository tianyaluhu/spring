package entity;

public class Teacher {
    private String name;
    private Integer age;
    private String gender;
    private Student student;

    public Teacher() {
    }

    public Teacher(String name, Integer age, String gender, Student student) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.student = student;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", student=" + student +
                '}';
    }
}

