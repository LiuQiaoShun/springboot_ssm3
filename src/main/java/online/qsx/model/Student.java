package online.qsx.model;


public class Student {

    private Integer studentno;

    private String name;

    private Integer sex;

    private String major;

    private String direction;

    private Integer technology;

    private Integer ability;

    private Integer directionId;

    public Integer getStudentno() {
        return studentno;
    }

    public void setStudentno(Integer studentno) {
        this.studentno = studentno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getTechnology() {
        return technology;
    }

    public void setTechnology(Integer technology) {
        this.technology = technology;
    }

    public Integer getAbility() {
        return ability;
    }

    public void setAbility(Integer ability) {
        this.ability = ability;
    }

    public Integer getDirectionId() {
        return directionId;
    }

    public void setDirectionId(Integer directionId) {
        this.directionId = directionId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentno=" + studentno +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", major='" + major + '\'' +
                ", direction='" + direction + '\'' +
                ", technology=" + technology +
                ", ability=" + ability +
                ", directionId=" + directionId +
                '}';
    }
}
