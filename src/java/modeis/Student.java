/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeis;

/**
 *
 * @author Admin
 */
public class Student {

    private static int count = 0;
    private int id;
    private String name;
    private int age;
    private String major;

    //constructor
    public Student(String name, int age, String major) {
        this.id = count++;
        this.name = name;
        this.age = age;
        this.major = major;

    }
    //getter and setter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    //hien thong tin hoc sinh
    public void displayInfo() {
        System.out.println("ID:" + id + ", Name:" + name + ", Age:" + age + ", Major:" + major);
    }

//    public String toSring(int id, String name, int age, String major) {
//        return ("ID: " + id
//                + "\nname" + name
//                + "\nage" + age
//                + "\nmajor" + major);
//    }

}
