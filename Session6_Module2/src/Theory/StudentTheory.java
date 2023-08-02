package Theory;

import java.util.Scanner;

public class StudentTheory {
//        Fields - Attributes:  Mô tả đặc điểm của đối tượng
//        Access Modifier +Datatype + fieldName
//        Access Modifier: public, protected, default
        private String studentId;
        private String studentName;
        private int age;
        private boolean sex;
//       2. Contructor - Hàm tạo giúp chúng ta khởi tạo đối tượng
//    Syntax: public ClassName(params)
//    Tạo 1 Contructor không có tham số - không khởi tạo thông tin sinh viên - default
    public StudentTheory() {
    }

//    Tạo 1 Contructor có 2 tham số - khởi tạo thông tin sinh viên


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

    public StudentTheory(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        }
    //    Tạo 1 Contructor có tất cả thông tin - khởi tạo thông tin sinh viên

    public StudentTheory(String studentId, String studentName, int age, boolean sex) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
//        3. Method : miêu tả hành vi đối tượng
//        Syntax: Access Modifier + returnData + methodName(param)
//        Trả về duy nhất 1 kiểu dữ liệu (void)
//        3.1 Getter / Setter : Giúp truy cập các thuộc tính ở ngoài
//        3.2 Method
    }
//    void thif k can return
        public void hello(){
            System.out.println("Hello everyone");
        }
        public int add(int number1, int number2){
            int sum = number1 + number2;
            return sum;
        }
        public void talk(String name){
            System.out.println("hello " + name);
        }
//Viết phương thức cho phép nhập thông tin sv
    public void inputData(Scanner scanner){
        System.out.println("Nhập vào mã sinh viên");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên");
        this.age = scanner.nextInt();

    }
    public void displayData(){
        System.out.printf("%s - %s - %d",this.studentId, this.studentName, this.age);
    }
    }


