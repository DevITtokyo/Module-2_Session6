package Pdf_Exercise;

import java.util.Scanner;
public class StudentImp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] arrStudent = new Student[100];
        int n =0;
        int choice;
        String searchName;
        do {
            System.out.println("********************** MENU *********************");
            System.out.println("1. Nhập vào thông tin n sinh viên (n nhập từ bàn phím)");
            System.out.println("2. Tính điểm trung bình tất cả sinh viên");
            System.out.println("3. Hiển thị thông tin tất cả sinh viên");
            System.out.println("4. Sắp xếp sinh viên theo điểm trung bình giảm dần");
            System.out.println("5. Tìm kiếm sinh viên theo tên sinh viên (Tên sinh viên cần tìm nhập từ\n" + "bàn phím)");
            System.out.println("6. Thoát");
            System.out.print("Sự lựa chọn của bạn là : ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.printf("--------------------------\n");
            switch (choice){
                case 1:
                    System.out.print("Nhập vào số sinh viên : ");
                    n = Integer.parseInt(scanner.nextLine());
                    if (n<1 && n>100){
                        System.out.println("Vui lòng nhập số sinh viên trong khoảng từ 1 đến 100");
                    } else {
                        for (int i = 0; i < n; i++) {
                        //   Khởi tạo đối tượng sinh viên cần nhập thông tin
                            System.out.println("Nhập thông tin sinh viên thứ " + (i+1) + " : ");
                        //  Thêm sinh viên vào mảng
                            arrStudent[i] = new Student();
                            arrStudent[i].inputData(scanner);
                            System.out.printf("---------------------\n");
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        arrStudent[i].calAvgScore();
                    }
                    System.out.println("Đã tính xong điểm trung bình cho các sinh viên");
                    for (int i = 0; i < n; i++) {
                        System.out.println(arrStudent[i].getStudentName() + " : " + arrStudent[i].getAvgScore());
                        System.out.printf("---------------------\n");
                    }

                    break;
                case 3:
                    System.out.println("Hiển thị thông tin tất cả sinh viên");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Thông tin sinh viên thứ " + (i+1) + " : ");
                        arrStudent[i].displayData();
                        System.out.printf("---------------------\n");
                    }

                    break;
                case 4:
                    System.out.println("Sắp xếp sinh viên theo điểm trung bình giảm dần");
                    for (int i = 0; i < n-1; i++) {
                        for (int j = i+1; j <n ; j++) {
                            if(arrStudent[i].getAvgScore()>arrStudent[j].getAvgScore()){
                               Student temp = arrStudent[i];
                               arrStudent[i] = arrStudent[j];
                                arrStudent[j] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        arrStudent[i].displayData();
                        System.out.printf("\t");
                    }
                    break;
                case 5:
                    System.out.println("Nhập tên sinh viên cần tìm kiếm");
                    searchName = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (arrStudent[i].getStudentName().equalsIgnoreCase(searchName)){
                            System.out.println("Thông tin sinh viên cần tìm : ");
                            arrStudent[i].displayData();
                            found = true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Không tìm thấy sinh viên có tên " + searchName);
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-6");
            }
        }while (true);
    }
}
