/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.Scanner;
import modeis.Coder;

/**
 *
 * @author Admin
 */
public class OOP {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //vong lap try_catch
//        //k nhat thiet su dung finally
//        //xay ra van de` van~ chay. binh` thuong`
//        //ham try loi~ nhay sang ham` catch
//        try {
//            System.out.println("Nhap so nguyen a: ");
//            int a = sc.nextInt();
//            System.out.println(a);
//        } catch (Exception e) {
//            System.out.println("Phai nhap so nguyen");
//        } finally {
//            sc.close();
//        }
        //Nơi làm việc trục tiếp của các object
        //Làm việc thông qua phương thức
        //Coder đầu: tên class
        //coder1 t2: từ khóa để làm việc
        //Coder t3: constructor
        //Tạo dữ liệu coder1 thông qua constructor
//        Coder coder1 = new Coder("Java", "Duy", 22, "0356435000");
//        Coder coder2 = new Coder("Python", "abc", 20, "3480223233");
//        System.out.println("Ngon ngu lap trinh: " +coder1.getProgaming_language());
//        System.out.println("Ngon ngu lap trinh: " +coder2.getProgaming_language());
        //Hàm get là hàm để gọi dữ liệu

        //BT: thao tác màn hình.
        //Nhập tên tuổi sđt ngôn ngữ lập trình
        Coder coder1 = new Coder();
        Coder coder2 = new Coder();

        Scanner sc = new Scanner(System.in);
        System.out.println("Yeu cau nhap ten:");
        String name = sc.next();
        coder1.setName(name);

        System.out.println("Yeu cau nhap tuoi");
        int age = sc.nextInt();
        coder1.setAge(age);
        while (coder1.getAge() == 0) {
            age = sc.nextInt();
            coder1.setAge(age);
        }

        System.out.println("Yeu cau nhap SDT");
        String phone = sc.next();
        coder1.setPhone(phone);

        System.out.println("Nhap ngon ngu lap trinh");
        String lang = sc.next();
        coder1.setProgaming_language(lang);
        int choice;
        System.out.println("Chon ngon ngu lap trinh: ");
        System.out.println("1. Java");
        System.out.println("2. C");
        System.out.println("3. C++");
        System.out.println("4. Python");
        System.out.print("Nhap lua chon cua ban:");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Ngon ngu Java");
                break;
            case 2:
                System.out.println("Ngon ngu C");

                break;
            case 3:
                System.out.println("Ngon ngu C++");
                break;
            case 4:
                System.out.println("Ngon ngu Python");
                break;
            case 5:
                System.exit(0);


        }

        System.out.println("name: " + coder1.getName()
                + "\ntuoi: " + coder1.getAge()
                + "\nSDT: " + coder1.getPhone()
                + "\nNgon ngu lap trinh: " + coder1.getProgaming_language() 
                + "Ngon ngu lap trinh da chon: " );

        //Parameter: phương thức thongBao(String baocao)
        //tham số truyền vào: baocao=>>parameter
        //Argument: Ở hàm main hay phương khác
        //thongBao("hom nay nghi hoc som hon 30p")
        //chưa có dữ liệu =>>parameter//có dữ liệu =>> argument
        //từ khóa this: phân biệt biến instance với 
        //biến cục bộ - parameter có cùng tên. 
        //instanceof() -> trả về true false
        //Toán tử instanceof()sẽ được sử dụng để kiểm tra xem 1 
        //đối tượng có thuộc về 1 kiểu dữ liệu cụ thể nào đó hay 
        //không(có thể là lớp hoặc interface)
        //thực hành về toán tử instanceof
//        System.out.println(coder1 instanceof Person);
//        System.out.println(ps1 instanceof Coder);
    }
}
