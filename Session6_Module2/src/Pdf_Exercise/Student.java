package Pdf_Exercise;

import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    //  Xây dựng lớp Student gồm các thông tin như sau:
    // Thuộc tính
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private float htmlScore;
    private float cssScore;
    private float javascriptScore;
    private  float avgScore;
    // Default  Constructor
    public Student() {
    }
    // Constructor khởi tạo tất cả thông tin sinh viên
    public Student(String studentId, String studentName, int age, boolean sex, float htmlScore, float cssScore, float javascriptScore, float avgScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.htmlScore = htmlScore;
        this.cssScore = cssScore;
        this.javascriptScore = javascriptScore;
        this.avgScore = avgScore;
    }
    // Getter : Lấy dữ liệu ra
    public String getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public int getAge() {
        return age;
    }
    public boolean isSex() {
        return sex;
    }
    public float getHtmlScore() {
        return htmlScore;
    }
    public float getCssScore() {
        return cssScore;
    }
    public float getJavascriptScore() {
        return javascriptScore;
    }
    public float getAvgScore() {
        avgScore = (htmlScore + cssScore + javascriptScore)/3;
        return avgScore;
    }

    //  Setter: Gán giá trị cho thuộc tính
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public void setHtmlScore(float htmlScore) {
        this.htmlScore = htmlScore;
    }
    public void setCssScore(float cssScore) {
        this.cssScore = cssScore;
    }
    public void setJavascriptScore(float javascriptScore) {
        this.javascriptScore = javascriptScore;
    }
    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }
    // Method inputData: cho phép nhập tất cả thông tin sinh viên từ bàn phím (Trừ avgScore)
    public void inputData(Scanner scanner){
        System.out.print("Nhập vào mã của sinh viên :");
        this.studentId = scanner.nextLine();
        System.out.print("Nhập vào tên của sinh viên : ");
        this.studentName = scanner.nextLine();
        System.out.print("Nhập vào tuổi của sinh viên : ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào giới tính của sinh viên (true: nam, false: nữ): ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Nhập vào điểm HTML của sinh viên : ");
        this.htmlScore = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập vào điểm CSS của sinh viên : ");
        this.cssScore = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập vào điểm JavaScriptcủa sinh viên : ");
        this.javascriptScore = Float.parseFloat(scanner.nextLine());
    }
    // Method displayData: cho phép hiển thị tất cả thông tin sinh viên ra màn hình console
    public void displayData(){
        System.out.printf("Mã của sinh viên : %s\n",this.studentId);
        System.out.printf("Tên của sinh viên : %s\n",this.studentName);
        System.out.printf("Tuổi của sinh viên : %d\n",this.age);
        System.out.printf("Giói tính của sinh viên : %b\n",this.sex);
        System.out.printf("Điểm HTML của sinh viên : %.1f\n",this.htmlScore);
        System.out.printf("Điểm CSS của sinh viên : %.1f\n",this.cssScore);
        System.out.printf("Điểm JavaScript của sinh viên : %.1f\n",this.javascriptScore);
        System.out.printf("Điểm trung bình 3 môn của sinh viên : %.1f\n",this.avgScore);
    }
    // Phương thức tính điểm trung bình của sinh viên
    public  void calAvgScore(){
        this.avgScore = (this.htmlScore+this.cssScore+this.javascriptScore)/3;
    }
}
