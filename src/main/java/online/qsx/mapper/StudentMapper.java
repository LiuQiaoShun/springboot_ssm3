package online.qsx.mapper;

import online.qsx.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface StudentMapper {

    //目标是做多筛选查询，也就是可以同时将方向和性别一起作为查询条件，需要使用动态sql
    //理想状态的动态sql只能通过映射配置文件编写，此处我们坚持使用注解，不使用配置文件
    //选择使用@SelectProvider,type参数表示内部类，method表示类中的方法，通过方法获取sql

     @SelectProvider(type =FindStudentProvider.class,method = "findStudentProvider")
     List<Student> findStudent(Student student);

     //这个内部类需要包括一个能返回sql语句的方法

    class FindStudentProvider{
        public String findStudentProvider(Student student){
            //通过方法实现逻辑判断生成可变的sql语句，不属于典型的动态sql
            String sql="select * from tb_student where 1=1 ";
            if(student.getDirectionId()>=0){
                sql += "and directionId=#{directionId}";
            }
            if(student.getSex()>=0){
                sql +=  " and sex=#{sex}";
            }
            return sql;
        }
    }

    @Select("select * from tb_student")
    List<Student> findAllStudent(Student student);

    @Insert("insert into tb_student(studentno,name,sex,major,Direction,technology,ability)values(#{studentno},#{name},#{sex},#{major},#{Direction},#{technology},#{ability})")
    int save(Student student);

    @Select("select * from tb_student where Direction ='java开发'")
    List<Student> findStudentByJave(Student student);
}
