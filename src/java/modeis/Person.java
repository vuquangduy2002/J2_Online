/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeis;

/**
 *
 * @author Admin
 */
public class Person {
    //access modifiers: Tu khoa chi muc do truy cap cua mot class, phuong thuc, bien
    //public: khong bi gioi han truy cap, truy cap tu bat cu dau
    //private: chi duoc su dung trong class chua bien, chua phuong thuc do
    //protected: chi duoc su dung trong package hoac class con cua no
    //deault: chi duoc su dung tron package
    //OOP co 4 thuoc tinh:
    //kế thừa:
    //đóng gói:
    //đa hình:
    //trừu tượng:
     //non-access modifiers: 
    
    //thành phần chính thứ nhât: thuộc tính
    String name;
    int age;
    String phone;
    
    //thành phần chính thứ 2: constructor
    public Person() {
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    //thành phần chính thứ 3: phương thức
    //cầu nối để làm việc với các thuộc tính

    //chuột phải
    //Insert code...
    //Getter and setter...
//    public String getName() {//gọi dữ liệu của thuộc tính
//        return name;
//    }
//
//    public void setName(String name) {//thêm mới và sửa đổi dữ liệu của thuộc tính
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }

//    @Override
//    public String toString() {//viết hàm in ra màn hình đầy đủ
//        return "Person{" + "name=" + name + ", age=" + age + ", phone=" + phone + '}';
//    }
//    public String toString(String name, int age, String phone){
//        return("Ten nguoi: " + name
//                + "\nTuoi" + age
//                + "\nSDT"  + phone);
//    }
    
     public String getName() {//gọi dữ liệu của thuộc tính
        return name;
    }

    public void setName(String name) {//thêm mới và sửa đổi dữ liệu của thuộc tính
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age < 18 ){
            System.out.println("phai nhap tren 18 tuoi");
        }else{
            this.age = age;
        }
        
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    public String toString(String name, int age, String phone){
        return("Ten nguoi: " + name
                + "\nTuoi" + age
                + "\nSDT"  + phone);
    }
    
}
