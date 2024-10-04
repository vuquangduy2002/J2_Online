/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeis;

/**
 *
 * @author Admin
 */
//quan hệ Has - A
//object Student : name - age - sdt
//object Class :
/**
 * ghjgh
 */
//private ArrayList<Person> listStudent;//Aggregation: một đối tượng
//sẽ chứa 1 hoặc nhiều đối tượng khác 
// Khi đối tượng chứa bị hủy, thì đối tượng nằm trong không bị làm sao
// -> Aggregation không phải là 1 quan hệ chặt chẽ 
//private Person student;//Composition: một đối tượng chứa
// 1 đối tượng khác 
//Khi đối tương chứa bị hủy, thì đối tượng nằm trong như nó
//như 1 thuộc tính cũng sẽ bị hủy theo -> là 1 quan hệ rất chặt chẽ
//Kế thừa
//Coder sẽ được kế thừa từ Person
//Bất cứ người nào cũng phải có tên có tuổi có sdt
//Thuộc tính riêng của class Coder
//class cha Person
//class con Coder
public class Coder extends Person {

    private String Progaming_language;

    public Coder() {
    }

    //super: Từ khóa để liên kiên giữa class con với class cha
    public Coder(String Progaming_language, String name, int age, String phone) {
        super(name, age, phone);
        this.Progaming_language = Progaming_language;
    }

    public String getProgaming_language() {
        return Progaming_language;
    }

    public void setProgaming_language(String Progaming_language) {
        this.Progaming_language = Progaming_language;
    }

    //Sử dụng những phương thức và thuộc tính của class cha
    //Đã khai báo ở class cho Person
}
