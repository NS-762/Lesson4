public class Employee {

    protected String name; //задание 1
    protected String email;
    protected String position;
    protected String phone;
    protected int salary;
    protected int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {  //задание 2
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {  //задание 3
        System.out.println("-----Информация о сотруднике-----");
        System.out.println("ФИО: " + name + "\nДолжность: " + position + "\nEmail: " + email + "\nТелефон: "
        + phone + "\nЗарплата: " + salary + "\nВозраст: " + age + "\n");
    }


}
