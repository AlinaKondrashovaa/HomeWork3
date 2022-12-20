package Task;



public class Main {
    public static void main(String[] args){
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Антощенкова Валерия Николаевна", "Директор", "vnantoshenkova@mailbox.com", "81726912642", 151000, 47);
        empArray[1] = new Employee("Ахмтезянов Марат Альбертович", "Разработчик", "makmetzyanov@mailbox.com", "89172281337", 63000, 19);
        empArray[2] = new Employee("Евстратов Лев Владимирович", "зам. Директора", "lvevstratov@mailbox.com", "81962428996", 54840, 29);
        empArray[3] = new Employee("Романова Екатерина Анатольевна", "Администратор", "earomanova@mailbox.com", "87025824807", 52075, 34);
        empArray[4] = new Employee("Гуреев Петр Борисович", "Разнорабочий", "pbgureev@mailbox.com", "88100998621", 62423, 52);

        for (Employee employee : empArray) {
            if (employee.getAge() > 40) employee.PrintEmployeeInfo();
        }
    }
}

