/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MyFile {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Nhap ten File de tao moi: ");
        String fileName = sc.nextLine();
        //Khi tạo File -> thì tạo nó ở đâu? 
        //Đường dẫn tương đối: Tạo File trực tiếp trên Folder đang làm việc
        //Đường dẫn tuyệt đối: Cho phép mọi người chọn đường dẫn để tạo Files
        //C:\Java\
        File file1 = taoFile(fileName);
        String message = docFile(file1);
        System.out.println(message);
        
        System.out.println("Viet vao File: ");
        String mgs = sc.nextLine();
        if (checkFile(file1)) {
            vietFile(file1, mgs);
        } else {
            System.out.println("File đã tồn tại, thêm nội dung vào cuối File");
            vietFile(file1, mgs);
        }

    }

    public static String docFile(File file) {
        StringBuilder msg = new StringBuilder();
        // Sử dụng BufferedReader đọc file
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                msg.append(line).append("\n"); // Thêm từng dòng vào StringBuilder
            }
        } catch (Exception e) {
            System.out.println("Loi doc File: " + e.getMessage());
        }
        return msg.toString(); // Trả về nội dung file dưới dạng chuỗi
    }

    public static void vietFile(File file, String message) {
        try {
            //BufferWriter
            //PrintWriter
            //có true sẽ sử dụng append để ghi tiếp vào File
            FileWriter fw = new FileWriter(file, true);
            fw.write(message);
            fw.close();
        } catch (IOException e) {
            System.out.println("Loi ghi file");
            e.printStackTrace();
        }
    }

    public static File taoFile(String fileName) throws IOException {
        //tạo File 
        File myFile = new File(fileName + ".txt");
        if (checkFile(myFile)) {
            System.out.println("File da duoc tao moi");
            return myFile;
        } else {
            System.out.println("File da ton tai");
            return myFile;
        }
    }

    //Trả về thông báo File đã được tạo chưa
    public static boolean checkFile(File myFile) throws IOException {
        try {
            if (myFile.createNewFile()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Loi tao File");
        }
        return false;
    }

}

/**
 *
 * @author Admin
 */

