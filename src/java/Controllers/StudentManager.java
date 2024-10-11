/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.ArrayList;
import java.util.Scanner;
import modeis.Student;

/**
 *
 * @author Admin
 */
public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    //xem danh sach hoc sinh
    public void viewStudent() {
        if (students.isEmpty()) {
            System.out.println("Danh sach hoc sinh trong");
        } else {
            for (Student student : students) {
                student.displayInfo();
            }
        }
    }

    //them hoc sinh
    public void addStudent() {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi:");
        int age = sc.nextInt();
        sc.nextLine();//doc ki tu thua
        System.out.println("Nhap chuyen nganh:");
        String major = sc.nextLine();
        

        Student newStudent = new Student(name, age, major);
        students.add(newStudent);
        System.out.println("Them hoc sinh thanh cong");

    }

    //xoa hoc sinh
    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID hoc sinh can xoa");
        int id = sc.nextInt();

        Student studentToDelete = null;
        for (Student student : students) {
            if (student.getId() == id) {
                studentToDelete = student;
                break;
            }
        }
        

        if (studentToDelete != null) {
            students.remove(studentToDelete);
            System.out.println("Xoa hoc sinh thanh cong");

        } else {
            System.out.println("Khong tim thay hoc sinh voi ID nay");
        }

    }

    //Sua thong tin hoc sinh
    public void editStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID hoc sinh can sua: ");
        int id = sc.nextInt();
        sc.nextLine(); // doc ki tu thua
        Student studentToEdit = null;
        for (Student student : students) {
            if (student.getId() == id) {
                studentToEdit = student;
                break;
            }
        }

        if (studentToEdit != null) {
            System.out.print("Nhap ten moi: ");
            String newName = sc.nextLine();
            System.out.print("Nhap tuoi moi: ");
            int newAge = sc.nextInt();
            sc.nextLine(); // doc ki tu thua
            System.out.print("Nhap chuyen ganh moi: ");
            String newMajor = sc.nextLine();

            studentToEdit.setName(newName);
            studentToEdit.setAge(newAge);
            studentToEdit.setMajor(newMajor);

            System.out.println("Cap nhap thong tin hoc sinh thanh cong.");
        } else {
            System.out.println("Khong tim thay hoc sinh voi ID nay.");
        }
    }

    //Tim hoc sinh theo ten
    public void findStudentByName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh can tim: ");
        String name = sc.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay hoc sinh voi ten nay.");
        }
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Xem danh sach hoc sinh");
            System.out.println("2. Them hoc sinh");
            System.out.println("3. Xoa hoc sinh");
            System.out.println("4. Sua hoc sinh");
            System.out.println("5. Tim hoc sinh theo ten");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    manager.viewStudent();
                    break;
                case 2:
                    //Constructor của object Student
                    manager.addStudent();
                    break;
                case 3:
                    //remove(id)
                    manager.deleteStudent();
                    break;
                case 4:
                    //(id) --> sửa các thuộc tính
                    manager.editStudent();
                    break;
                case 5:
                    //getName().equals(str);
                    //name.contains("str");
                    //String search do người dùng nhập vào
                    //String name là thuộc tính name đã được lưu vào trong danh sách
                    //name.toLowerCase() để đưa về chữ thường
                    //search.toLowerCase()
                    //name.toLowerCase().trim() để loại bỏ khoảng trắng
                    //" Vu Duy "
                    //ReplaceAll("\\s+","");
                    //ArrayList<Student> seconlist = new ArrayList();
                    //foreach cho list ban đầu
                    //name.toLowerCase().trim().contains(search.toLowerCase()));
                    //seconlish.add();
                    manager.findStudentByName();
                    break;
                case 6:
                    System.out.println("Chuong trinh ket thuc.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 6);
    }

}


