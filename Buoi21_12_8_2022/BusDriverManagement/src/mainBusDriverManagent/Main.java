package mainBusDriverManagent;

import busDriverManagement.BusDriverManagement;
import driver.Driver;
import route.Route;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {




    public  static List <BusDriverManagement> busDriverManagementList= new ArrayList<>();


    public static void main(String[] args) {

    }

    private static  void menu (){
        boolean isExit = false;

        do {

            int functionChoice = functionChoice();

            switch (functionChoice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        }while (!isExit);
    }

    private  static  int functionChoice(){
        showMenu();
        System.out.println(" xin moi nhap chuc nang : ");

        int choice = 0;

        do {
            choice = new Scanner(System.in).nextInt();

            if (choice >= 1 && choice <= 8){
                break;
            } else {
                System.out.println(" lua chon khong hop le, vui long chon lai ");
            }
        } while (true);
        return  choice;
    }

    private static  void  showMenu (){
        System.out.println( " \n\n\n ----- PHAN MEM QUAN LY XE BUS -----");
        System.out.println("1. them 1 lai xe moi ");
        System.out.println("2. in ra toan bo lai xe ");
        System.out.println("3. them 1 tuyen xe moi ");
        System.out.println("4. in ra toan bo tuyen xe ");
        System.out.println("5. phan cong lai xe ");
        System.out.println("6. hien thi danh sach phan cong");
        System.out.println("7. hien thi tong khoang cach chay trong ngay cho lai xe ");
        System.out.println("8. thoat ");
    }
}