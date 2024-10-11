/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.Locale;

/**
 *
 * @author Admin
 */
public class String_J2 {

    public static void main(String[] args) {
        //3 cach khoi tao String
//        String a = "Ruy";
//        
//        String b = new String("Hello");
//        
        char[] c = {'v', 'u', 'D', 'u', 'y'};
        String d = new String(c);

        //Các phương thức làm việc với String
        d.length();//Được dùng để trả về độ dài của chuỗi(int)
        d.charAt(0);//Được dùng để trả về ký tự tại vị trí index
        String e = d.substring(1, 5);//trả về chuỗi con
        //số thứ nhất sẽ là beginIndex - số thứ 2 sẽ là endIndex
//        System.out.println(e);
        //Lưu ý: substring sẽ từ beginIndex --> endIndex-1
        //concat(): nối chuỗi, cách dùng như dấu cộng, chuỗi không biến thiên

        //String f = d + e;
        String f = d.concat(e);

        String thu_nhat = "chuc mung sinh nhat ";
        String thu_hai = "Duy";

        String result = thu_nhat.concat(thu_hai);
//        System.out.println(result);
        d.indexOf(thu_hai);//tìm vị trí đầu tiên của chuỗi con
        d.lastIndexOf(thu_hai);//tìm vị trí cuối cùng của chuỗi con

        String name = "vuDuy";
        String cut = "u";

//        System.out.println(name.indexOf(cut));
//        System.out.println(name.lastIndexOf(cut));
        d.equals(thu_hai);//so sánh hai chuỗi
        d.equalsIgnoreCase(thu_hai);//so sánh hai chuỗi không viết hoa

        String a = "VuDuy";
        String b = "vuduy";
//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(b));

        d.compareTo(thu_hai);//so sánh chuỗi theo thứ thự từ điển ACSII

        d.trim();//bỏ toàn bộ khoảng trắng
        d.toLowerCase();//sử dụng để biến chuỗi thành chữ thường
        d.toUpperCase();//sử dụng để biến chuỗi thành chữ hóa

        d.replace('A', 'b');//dùng để thay thế ký tự (char old, char new)

        d.startsWith(a); //Chuỗi có bắt đầu bằng chuỗi con không - boolean
        d.endsWith(a);//Chuỗi có bắt đầu bằng chuỗi con không - boolean

        //split: tách chuỗi thành mảng dựa trên biểu thức chính quy
        String chuoi = "Duy-Ruy;Ruury,DDuy";
        String[] mang = chuoi.split("\\W");//[-;,]
//        
//        for(String str : mang){
//            System.out.println(str);
//        }
        //StringBuilder ( hoặc StringBuffer):
        //đây là các lớp cho phép tạo các chuỗi có thể thay đổi được
        //các chuỗi có thể thay đổi được --> chuỗi biến thiên
        //Lưu ý: Đối với Concat(+): nó sẽ tạo ra nhiều String trong quá trình 
        //nối chuỗi --> tạo ra bấy nhiêu chuỗi(String). tốn dung lượng//
        //có thể lấy ra chuỗi khi chưa nối hết.
        //StringBuilder: chỉ có một bản gốc, và bản gốc đó sẽ thay đổi 
        //trong quá trình nối chuỗi.

        //{a,b,c,d}
        //abcd --> String a(1 bé) = "a", String a(2 bé) = "ab", String a( 3 bé) = "abc"
        //đối với StringBuilder: String sb = "a" -->sb = "ab" -->sb = "abc"
        
        StringBuilder sb = new StringBuilder();

        sb.append(b).append(c).append(d);

        String result1 = sb.toString();
        System.out.println(result1);
        
        d.isEmpty();//kiểm tra xem chuỗi có rỗng hay không boolean
        String.valueOf(sb);//Chuyển đổi giá trị bất kì thành chuỗi
        d.contains(sb);//sử dụng để tìm xem chuỗi có giá trị này không
        
        d = "VuDuy";
        boolean t = d.contains("ui");
        System.out.println(t);
        
        
        
    }
    public static StringBuilder noiChuoi(String b, String c, String d) {
        StringBuilder sb = new StringBuilder();

        sb.append(b).append(c).append(d);

        String result1 = sb.toString();
        System.out.println(result1);
        
        return sb;

    }

}
//btvn: tạo lớp Student có các thuộc tính:int id,Str name,int age,Str chuyen_nganh(major)
//-> id phải là duy nhất
//private static int count; biến tĩnh
//Trong Constructor khi khởi tạo id: count++
//tạo lớp StudenManager bao gồm các Student
//tạo Menu Switch/Case gồm các tác vụ:
//1. Xem danh sách học sinh
//2. Thêm học sinh
//3. Xóa học sinh
//4. Sửa học sinh --> người dùng nhập id: rồi sửa thuộc tính k sửa id
//5. Tìm theo tên
//6. Thoát


