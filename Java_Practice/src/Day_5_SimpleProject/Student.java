package Day_5_SimpleProject;

public class Student {
    private String name;
    private String id;
    private String sex;
    private int age;
    private String dept;
    private String year;

    public Student (String n, String id, String sex, int age, String dept, String yr ){
        name = n;
        this.id = id;
        this.sex = sex;
        this.age = age;
        this.dept = dept;
        year = yr;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDept(String dept){
        this.dept =dept;
    }
    public void setYear(String yr){
        year = yr;
    }

    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }
    public String getDept(){
        return dept;
    }
    public String getYear(){
        return year;
    }
}
