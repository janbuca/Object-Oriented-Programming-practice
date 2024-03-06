package Day_5_SimpleProject;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] argStrings) {
        Scanner in = new Scanner(System.in);
        Student s1 = new Student("No Name 1", "No Id 1", "Not Determined", 0, "Not Specified 1", "Not Started 1 \n");
        Student s2 = new Student("No Name 2", "No Id 2", "Not Determined", 0, "Not Specified 2", "Not Started 2 \n");
        Student s3 = new Student("No Name 3", "No Id 3", "Not Determined", 0, "Not Specified 3", "Not Started 3 \n");
        Student s4 = new Student("No Name 4", "No Id 4", "Not Determined", 0, "Not Specified 4", "Not Started 4 \n");
        Student s5 = new Student("No Name 5", "No Id 5", "Not Determined", 0, "Not Specified 5", "Not Started 5 \n");

        System.out.printf("%5s%10s%12%s%15s%15s%12%n", "Name", "Id", "Sex", "Age", "Dept", "Year");
        // print a line of dashes to separate the header from the data
        System.out.println("-------------------------------------------");

        displayAll(s1);
        displayAll(s2);
        displayAll(s3);
        displayAll(s4);
        displayAll(s5);

        String name, id, sex, dept, yr;
        int age;
        int n;
        System.out.println("\n\n 1. Add Student Information");
        System.out.println("\n   2. Show Student Information");
        System.out.println("\n  -1. Exit Programme");
        System.out.print("\n Enter your choice:");

        String a1 = in.nextLine();
        n = Integer.parseInt(a1); // n in.nextInt();

        while (n != -1) {
            switch (n) {
                case 1:
                    System.out.println("\n\n We are about to Enter a new Data! \n Please enter the following details : ");
                    System.out.println("Enter your name, please");
                    name = in.nextLine();
                    System.out.println("Enter your is, please!");
                    id = in.nextLine();
                    System.out.println(" Enter your sex? male/female, please!");
                    sex = in.nextLine().toLowerCase();
                    System.out.println("Enter your  age, please!");
                    String a = in.nextLine();
                    age = Integer.parseInt(a);
                    System.out.println("Enter  your department, please!");
                    dept = in.nextLine();
                    System.out.println("Enter  your year, please!");
                    yr = in.nextLine();
                    addStudent(name, id, sex, age, dept, yr, s1);

                    break;
                case 2:
                    System.out.printf("%5s%10s%12%s%7s%20s%15%n", "Name", "Id", "Sex", "Age", "Dept", "Year");
                    displayAll(s1);
                    break;
                default:
                    System.out.println("Invalid Entry! Please enter again.");
            }
            if (n != -1) {
                System.out.println("\n \n Your Choice : ");
                System.out.println("\n    Press 1 to continue adding student information");
                System.out.println("\n    Press 2 to view all the students' information");
                System.out.println("\n    Press -1 to exit the programme");
                System.out.print("\n Enter your choice:");
                a1 = in.nextLine();
                n = Integer.parseInt(a1);
            }
            break;
        }

    }

    public static void addStudent(String n, String id, String sex, int age, String dept, String yr, Student s) {
        s.setName(n);
        s.setId(id);
        s.setSex(sex);
        s.setAge(age);
        s.setDept(dept);
        s.setYear(yr);
    }

    public static void displayAll(Student s) {
        System.out.printf("%5s%10s%12%s%7s%20s%15%n", s.getName(), s.getId(), s.getSex(), s.getAge(), s.getDept(),
                s.getYear());
    }
}
