package Task;

public class Employee {
    private String Name;
    private String Post;
    private String Email;
    private String Phone;
    private int Salary;
    private int Age;


    public Employee(String name, String post, String email, String phone, int salary, int age) {
        Name = name;
        Post = post;
        Email = email;
        Phone = phone;
        Salary = salary;
        Age = age;
    }

    public void PrintEmployeeInfo(){
        System.out.println("Employee name: " + Name);
        System.out.println("Employee post: " + Post);
        System.out.println("Employee email: " + Email);
        System.out.println("Employee phone: " + Phone);
        System.out.println("Employee salary: " + Salary);
        System.out.println("Employee age: " + Age);
        System.out.println();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
