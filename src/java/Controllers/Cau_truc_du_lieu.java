/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import modeis.Coder;

/**
 *
 * @author Admin
 */
public class Cau_truc_du_lieu {

    public static void main(String[] args) {
        //ArayList: đây là một cấu trúc dữ liệu lưu trữ các phần tử có cùng kiểu dữ liệu
        //và có kích thước cố định. Các phần tử cũng đánh số theo index (0).
        //Một danh sách kiểu dữ liệu
        ArrayList<Coder> alist = new ArrayList();
        Coder coder1 = new Coder("Java", "Duc", 32, "0384927384");
        Coder coder2 = new Coder("C", "Tien", 22, "083482783");
        alist.add(coder1);
        alist.add(coder2);
//        System.out.println(alist.get(0));
        
        //LinkedList: đây là một danh sách liền kề, trong đó mỗi phần tử chứa một liên kết 
        //đến phần tử tiếp theo
        //head-pt1-pt2-pt3-tail
        LinkedList<String> llist = new LinkedList();
        llist.addFirst("");
        llist.addLast("");
        
        //Stack: là cấu trúc dữ liệu hoạt động theo nguyen tắc LIFO( last in - first out)
        //push() thêm phần tử -pop() lấy phần tử
        Stack<String> slist = new Stack();
        slist.push("phan tu 1");
        slist.push("phan tu 2");
        String s = slist.pop();
//        System.out.println(s);
        
        
        //Queue: hàng đợi, cấu trúc dữ liệu hoạt động theo phương thức FIFO( First in - First out)
        Queue<String> qlist = new LinkedList();
        qlist.add("phan tu 1");
        qlist.poll();
        
        //HashMap: một cấu trúc dữ liệu lưu trữ theo dạng key-value
        //key thì là duy nhất - value thì không
        HashMap<Integer, String> hlist = new HashMap<>();
        hlist.put(1, "phan tu 1");
        hlist.put(2, "phan tu 2");
        
//        System.out.println(hlist.get(2));
        
        //Hashset: là cấu trúc dữ liệu chỉ lưu trữ giá trị duy nhất - k được trùng lặp
        HashSet<String> setlist = new HashSet<>();
        setlist.add("phan tu 1");
        setlist.add("phan tu 2");
        
        System.out.println(setlist);
        
        //Collection Framework
        //Thư viện cung cấp cấu trúc dữ liệu và thuật toán được tích hợp sẵn
        //nhằm mục đích hỗ trợ lập trình viên dễ dàng xử lý dữ liệu
        //Một số phương thức phổ biến :
        //add(): Thêm phần tử
        //remove(): Xóa phần tử
        //contains(): Kiểm tra xem bộ sưu tập có chứa phần tử cụ thể hay không 
        //size(): Trả về số lượng phần tử trong bộ sưu tập
        //clear(): Xóa toàn bộ phần tử trong bộ sưu tập
        //isEmpty(): Kiểm tra xem bộ sưu tập có rỗng hay không - boolean
    }
   
}

